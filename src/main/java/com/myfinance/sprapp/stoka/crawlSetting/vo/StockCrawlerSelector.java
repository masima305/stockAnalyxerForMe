package com.myfinance.sprapp.stoka.crawlSetting.vo;

import org.springframework.stereotype.Repository;

// 주식 기본정보 VO
// bean으로 하나만 관리하자.

@Repository
public class StockCrawlerSelector {


//	## 네이버금융 ##
//	## 네이버 메인 ##
	private String naverMain = "https://finance.naver.com/item/main.nhn?code=";

//	## 네이버 시세 ##
	private String naverSise = "https://finance.naver.com/item/sise.nhn?code=";


//	## 네이버 뉴스 ##
	private String naverNews = "https://finance.naver.com/item/news.nhn?code=";

//	## 종목분석 ##
	private String naverCoinfoS="https://finance.naver.com/item/coinfo.nhn?code=";
	private String naverCoinfoE="&target=finsum_more";



//	## ------------------ 메인 - 최근 연간 당기순이익 라벨 ------------------------ ##

//	## 연도 라벨

//	## 재무연도 -3년##
	private String naverYearlabelM3 =
			"#content > div.section.cop_analysis > div.sub_section > table > thead > tr:nth-child(2) > th:nth-child(1)";

//	## 재무연도 -2년##
	private String naverYearlabelM2 =
			"#content > div.section.cop_analysis > div.sub_section > table > thead > tr:nth-child(2) > th:nth-child(2)";

//	## 재무연도 -1년##
	private String naverYearlabelM1 =
			"#content > div.section.cop_analysis > div.sub_section > table > thead > tr:nth-child(2) > th:nth-child(3)";

//	## 재무연도 0년##
	private String naverYearlabelTY =
			"#content > div.section.cop_analysis > div.sub_section > table > thead > tr:nth-child(2) > th.t_line.cell_strong";
//
//	## ------------------ 메인 - 최근 연간 당기순이익 ------------------------ ##
//	croll.naversel.yearnetp.mthree=#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(2)
//
//	croll.naversel.yearnetp.mtwo=#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(3)
//
//	croll.naversel.yearnetp.mone=#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(4)
//
//	croll.naversel.yearnetp.thisyear=#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td.t_line.cell_strong
//
//	## ------------------ 메인 - 최근 분기 당기순이익 라벨------------------------ ##
//	croll.naversel.coinfosel.mfive=#content > div.section.cop_analysis > div.sub_section > table > thead > tr:nth-child(2) > th:nth-child(5)
//
//	croll.naversel.coinfosel.mfour=#content > div.section.cop_analysis > div.sub_section > table > thead > tr:nth-child(2) > th:nth-child(6)
//
//	croll.naversel.coinfosel.mthree=#content > div.section.cop_analysis > div.sub_section > table > thead > tr:nth-child(2) > th:nth-child(7)
//
//	croll.naversel.coinfosel.mtwo=#content > div.section.cop_analysis > div.sub_section > table > thead > tr:nth-child(2) > th:nth-child(8)
//
//	croll.naversel.coinfosel.mone=#content > div.section.cop_analysis > div.sub_section > table > thead > tr:nth-child(2) > th:nth-child(9)
//
//	croll.naversel.coinfosel.pone=#content > div.section.cop_analysis > div.sub_section > table > thead > tr:nth-child(2) > th:nth-child(10)
//
//
}
