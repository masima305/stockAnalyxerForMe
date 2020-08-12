package com.myfinance.sprapp.stoka.crawlSetting.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.myfinance.sprapp.stoka.crawlSetting.vo.StockInfoVO;

//실질적인 주식 크롤러이다.

@Repository
public class StockCrawler {

	//네이버 금융 메인
	@Value("#{crlSet['croll.naver.main']}")
	String MAIN_URL;

	//재무연도 -3년
	@Value("#{crlSet['croll.naversel.yearlabel.mthree']}")
	String LABEL_YM3;

	//재무연도 -3년
	@Value("#{crlSet['croll.naversel.yearlabel.mthree']}")
	String NETP_YM3;


	//재무연도 -2년
	@Value("#{crlSet['croll.naversel.yearlabel.mtwo']}")
	String LABEL_YM2;

	//재무연도 -1년
	@Value("#{crlSet['croll.naversel.yearlabel.mone']}")
	String LABEL_YM1;

	//재무연도 0년
	@Value("#{crlSet['croll.naversel.yearlabel.thisyear']}")
	String LABEL_YM0;

	//테스트용 이름
	@Value("#{crlSet['croll.testNm']}")
	String NMNM;



	//---- 연도별 당기순이익
	//---- 분기별 당기순이익

	//크롤링 메인 흐름
	public String CrawlStart(StockInfoVO stockInfoVo) throws IOException {

		//메인 페이지에서 모두 크롤링 해오기
		Document rawData = crawlMainPage(stockInfoVo.getStokId());

		Elements element = null;
		//당기 순이익 가지고 오기.

		//#QmZIZ20rMn > table:nth-child(2) > thead > tr:nth-child(2) > th.r03c06.bg

		element = rawData.select(NMNM);
		String a = element.html();
		String b = element.text();
		System.out.println("!@!@"+a);

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
