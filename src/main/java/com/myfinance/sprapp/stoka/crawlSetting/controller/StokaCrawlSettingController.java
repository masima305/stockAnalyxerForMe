package com.myfinance.sprapp.stoka.crawlSetting.controller;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myfinance.sprapp.HomeController;
import com.myfinance.sprapp.stoka.crawlSetting.service.StokaCrawlSettingService;
import com.myfinance.sprapp.stoka.crawlSetting.vo.StockInfoVO;



@Controller
public class StokaCrawlSettingController {
	private static final Logger logger = LoggerFactory.getLogger(StokaCrawlSettingController.class);

	@Value("com/myfinance/sprapp/stoka/crawlSetting")
	String BASEPATH;

	StockInfoVO stockInfoVo;

	@Autowired
	StokaCrawlSettingService stokaCrawlSettingService;

	//주식 리스트 조회
	@RequestMapping(value="/stoka/stokaStokList.do", method =
					RequestMethod.POST, produces ="application/text; charset=utf8")

	public @ResponseBody Object StokaStokList(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();

		List<StockInfoVO> stockList = stokaCrawlSettingService.StokaStokList();

		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = mapper.writeValueAsString(stockList);

		return jsonStr;
	}

	//주식 리스트 등록
	@RequestMapping(value="/stoka/stokaInsertStok.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView stokaInsertStok( StockInfoVO stockInfoVo, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();

		//set selection
		stokaCrawlSettingService.stokaInsertStok(stockInfoVo);

		List<StockInfoVO> stockList = stokaCrawlSettingService.StokaStokList();

		mv.setViewName(BASEPATH+"/stokaStokList");
		mv.addObject("stokList", stockList);

		return mv;
	}

	//주식 크롤링 시작
		@RequestMapping(value="/stoka/stokaCrawlStart.do", method = RequestMethod.GET)
		@ResponseBody
		public ModelAndView stokaCrawlStart( StockInfoVO stockInfoVo, HttpServletRequest request) throws Exception {
			ModelAndView mv = new ModelAndView();

			//주식 크롤링 리스트 가지고 오기.
			List<StockInfoVO> stockList = stokaCrawlSettingService.StokaStokList();

			for (int i = 0; i < stockList.size(); i++) {
				//start service 호출
				stokaCrawlSettingService.stokaCrawlStart(stockList.get(i));
			}





			mv.setViewName(BASEPATH+"/stokaStokList");
			mv.addObject("stokList", stockList);

			return mv;
		}



}
