package com.myfinance.sprapp.stoka.crawlSetting.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.myfinance.sprapp.CommonDao;
import com.myfinance.sprapp.stoka.crawlSetting.vo.StockInfoVO;

//실질적인 주식 크롤러이다.

@Repository
public class StockCrawler {

	//TODO 얘네 그냥 다 Bean Object로 관리하자. 프로퍼티 쓸거없이.


	@Autowired
	CommonDao commonDao;

	//크롤링 메인 흐름
	public String CrawlStart(StockInfoVO stockInfoVo) throws Exception {


		//당기순이익 크롤

		//우선 해당 주식이 크롤링 대상인지 부터 판단해야함.
		//boolean 변수들을 생성해서 해당 조건들을 하나라도 만족하면 크롤은 일단 해와야함.
		//1.해당 주식 id로 조회했을때 아에 검색결과가 없다면 : 싹다 크롤하고 넣어줘야할 대상.
		boolean isNothing = (commonDao.selectList("mappers.crawlSetting-mapper.chkNetpYearHas", stockInfoVo).size() == 0);
		//올해 연도가 해당 주식 쿼리 조회했을때 연도라벨이 0이 아닐경우  : 연도별 당기순이익 크롤대상.
		//크롤한 분기실적 -5m연월이 DB에 있는 연월과 다르면 크롤대상

		//크롤 실현부
		if(isNothing) {
			//메인 페이지에서 모두 크롤링 해오기
			Document rawData = crawlMainPage(stockInfoVo.getStokId());

			Elements elementA = null;
			Elements elementB = null;

			//당기 순이익 가지고 오기.


			elementA = rawData.select(NMNM);
			elementB = rawData.select(NETP_YM3);

			String a = elementA.html();
			String b = elementA.text();

			String c = elementB.html();
			String d = elementB.text();

			System.out.println("elemA : html : "+a);
			System.out.println("elemA : text : "+b);

			System.out.println("elemB : html : "+c);
			System.out.println("elemB : text : "+d);

		}




		if(true) {
			return "크롤링이 잘 끝났음.";
		}else {
			return "중간에 오류발생 : msg";
		}
	}

	//stokId에 해당하는 종목의 메인페이지를 긁어온다.
	public Document crawlMainPage(String stokId) throws IOException {
		String ARTICLE_URL = MAIN_URL+stokId;
		System.out.println(ARTICLE_URL);
		//페이지 긁어서 가지고옴
		Document rawData = Jsoup.connect(ARTICLE_URL)
                .timeout(5000)
                .get();
		return rawData;
	}


}
