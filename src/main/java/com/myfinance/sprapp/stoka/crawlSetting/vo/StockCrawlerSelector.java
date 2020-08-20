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


	private String naverYearnetpM3 =
			"#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(2)";

	private String naverYearnetpM2 =
			"#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(3)";

	private String naverYearnetpM1 =
			"#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(4)";

	private String naverYearnetpTY =
			"#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td.t_line.cell_strong";

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

//	## ------------------ 메인 - 최근 분기 당기순이익 금액------------------------ ##

//	#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(6)

//	#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(7)

//	#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(8)

//	#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(9)

//	#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td:nth-child(10)

//	#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(3) > td.last.cell_strong

//	## ------------------ 기본정보 ------------------------ ##

//	시총
//	#_market_sum
//	저가
//  #chart_area > div.rate_info > table > tbody > tr:nth-child(2) > td:nth-child(2) > em.no_down
//	고가
//	#chart_area > div.rate_info > table > tbody > tr:nth-child(1) > td:nth-child(2) > em.no_up
//	종가
//	#chart_area > div.rate_info > div > p.no_today
//	당좌비율
//	#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(8) > td:nth-child(10)
//	부채비율
//	#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(7) > td:nth-child(10)
//	유보율
//	#content > div.section.cop_analysis > div.sub_section > table > tbody > tr:nth-child(9) > td:nth-child(10)

	//getters and setters

//	주가수익비율(Price Earnings Ratio, PER)은 주가(P)를 주당순이익(Earnings Per Share)으로 나눈 것으로 흔히 P/E비율이라고도 한다.
//
//	PER는 주가가 주당순이익의 몇 배인지 나타내는 지표로 기업의 주당순이익 1원에 대한 시장에서의 평가라고 이해할 수 있다.
//
//
//
//	PER가 10이라면, 주당순이익 1원 대비 시장에서는 10원의 가치로 평가를 하는 것이다. 1/PER는 EPS/P 이므로 PER가 10이면, 1/PER는 10%로 계산이 된다. 10원짜리 주식을 샀는데, 이 기업의 EPS가 1이면 10%의 이익률이 있는 기업을 매수한 것이다.
//
//	시간가치와 성장률을 무시한다면 이 기업을 인수했을 때 10년이면 다 뽑을 수 있다라고 해석할 수 있다. 10% X 10년 = 1이 되므로...
//
//
//
//	EPS 구하는 방식은 재무제표 보는법에서 12.손익계산서 III(http://blog.naver.com/donghm/202029260)를 참고하면 된다.



	public String getNaverMain() {
		return naverMain;
	}

	public void setNaverMain(String naverMain) {
		this.naverMain = naverMain;
	}

	public String getNaverSise() {
		return naverSise;
	}

	public void setNaverSise(String naverSise) {
		this.naverSise = naverSise;
	}

	public String getNaverNews() {
		return naverNews;
	}

	public void setNaverNews(String naverNews) {
		this.naverNews = naverNews;
	}

	public String getNaverCoinfoS() {
		return naverCoinfoS;
	}

	public void setNaverCoinfoS(String naverCoinfoS) {
		this.naverCoinfoS = naverCoinfoS;
	}

	public String getNaverCoinfoE() {
		return naverCoinfoE;
	}

	public void setNaverCoinfoE(String naverCoinfoE) {
		this.naverCoinfoE = naverCoinfoE;
	}

	public String getNaverYearlabelM3() {
		return naverYearlabelM3;
	}

	public void setNaverYearlabelM3(String naverYearlabelM3) {
		this.naverYearlabelM3 = naverYearlabelM3;
	}

	public String getNaverYearlabelM2() {
		return naverYearlabelM2;
	}

	public void setNaverYearlabelM2(String naverYearlabelM2) {
		this.naverYearlabelM2 = naverYearlabelM2;
	}

	public String getNaverYearlabelM1() {
		return naverYearlabelM1;
	}

	public void setNaverYearlabelM1(String naverYearlabelM1) {
		this.naverYearlabelM1 = naverYearlabelM1;
	}

	public String getNaverYearlabelTY() {
		return naverYearlabelTY;
	}

	public void setNaverYearlabelTY(String naverYearlabelTY) {
		this.naverYearlabelTY = naverYearlabelTY;
	}

	public String getNaverYearnetpM3() {
		return naverYearnetpM3;
	}

	public void setNaverYearnetpM3(String naverYearnetpM3) {
		this.naverYearnetpM3 = naverYearnetpM3;
	}

	public String getNaverYearnetpM2() {
		return naverYearnetpM2;
	}

	public void setNaverYearnetpM2(String naverYearnetpM2) {
		this.naverYearnetpM2 = naverYearnetpM2;
	}

	public String getNaverYearnetpM1() {
		return naverYearnetpM1;
	}

	public void setNaverYearnetpM1(String naverYearnetpM1) {
		this.naverYearnetpM1 = naverYearnetpM1;
	}

	public String getNaverYearnetpTY() {
		return naverYearnetpTY;
	}

	public void setNaverYearnetpTY(String naverYearnetpTY) {
		this.naverYearnetpTY = naverYearnetpTY;
	}





}
