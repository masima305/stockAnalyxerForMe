package com.myfinance.sprapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	HomeService homeService;
	//지금은 이렇게 가지고오지마는, 나중에는 뭔가 대책이 필요함. XML로 주입해서 VO같은걸 하나 만드는게 좋지않나 싶음.
	@Value("#{crlSet['croll.naver.main']}")
	String MAIN_URL;

	@Value("#{crlSet['croll.naversel.coinfosel.thisyear']}")
	String LABLE_THISYEAR;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model)throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		HomeVO hv = homeService.selectTest();
		
		String ARTICLE_URL = MAIN_URL+"089010";
		System.out.println(ARTICLE_URL);
		//페이지 긁어서 가지고옴
		Document rawData = Jsoup.connect(ARTICLE_URL)
                .timeout(5000)
                .get();
		
		
		Elements element = null;
		//당기 순이익 가지고 오기.	
		
		//#QmZIZ20rMn > table:nth-child(2) > thead > tr:nth-child(2) > th.r03c06.bg

		element = rawData.select(LABLE_THISYEAR);
		String a = element.html();
		String b = element.text();
		System.out.println("!@!@"+a);
		
//		https://navercomp.wisereport.co.kr/v2/company/c1010001.aspx?cmp_cd=008560&amp;target=finsum_more
//		https://navercomp.wisereport.co.kr/v2/company/c1010001.aspx?cmp_cd=089010&amp;target=finsum_more
		
//		
//			CAPEX	유형자산의증가
//			FCF	영업활동으로인한현금흐름-CAPEX
//			이자발생부채	단기사채+단기차입금+유동성장기부채+단기금융부채+사채+장기차입금+장기금융부채
//			영업이익률	영업이익/매출액(수익)
//			순이익률	당기순이익/매출액(수익)
//			ROE	(지배주주지분)당기순이익[당기]/((지배주주지분)자본총계[당기]+(지배주주지분)자본총계[전기])/2)
//			ROA	당기순이익[당기]/(자산총계[당기]+자산총계[전기]/2)
//			부채비율	부채총계/자본총계
//			자본유보율	(자본잉여금+이익잉여금)/자본금
//			EPS	(지배주주지분)당기순이익*1000/수정평균발행주식수(보통주+우선주)
//			PER	보통주수정주가(기말)/EPS
//			BPS	(지배주주지분)자본총계/수정기말발행주식수(보통주+우선주, 자사주차감)
//			PBR	보통주수정주가(기말)/BPS
//			수정DPS	DPS에 자본금변동이벤트 시 수정계수가 발생하는 경우 수정계수를 적용
//			현금배당수익률	수정DPS/보통주수정주가(기말)
//			현금배당성향	현금배당액(전체)/(지배주주지분)당기순이익
//			발행주식수	보통주 기말발행주식수 (자본금 변동 이벤트 중 수정계수가 발생하는 경우 과거 데이터가 소급됨
//			
		model.addAttribute("serverTime", " : "+formattedDate+" : "+hv.getAaa()+"<br>"+a+"<br>"+b+"<br>");
		
		return "home";
	}
	
}
