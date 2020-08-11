package com.myfinance.sprapp.stoka.crawlSetting.service;

import com.myfinance.sprapp.stoka.crawlSetting.vo.StockInfoVO;

//실질적인 주식 크롤러이다.
public class StockCrawler {

	//--------- 크롤링 selector 선언
	//---- 연도별 당기순이익
	//---- 분기별 당기순이익

	public String CrawlStart(StockInfoVO stockInfoVo) {
		if(true) {
			return "크롤링이 잘 끝났음.";
		}else {
			return "중간에 오류발생 : msg";
		}


	}


}
