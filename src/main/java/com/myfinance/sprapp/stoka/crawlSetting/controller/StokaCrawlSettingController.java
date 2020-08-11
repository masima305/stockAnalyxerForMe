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
	@RequestMapping(value="/stoka/stokaStokList.do", method = RequestMethod.GET)
	public ModelAndView StokaStokList( Model model, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();

		List<StockInfoVO> stockList = stokaCrawlSettingService.StokaStokList();

		mv.setViewName(BASEPATH+"/stokaStokList");
		mv.addObject("stokList", stockList);
		return mv;
	}

	//주식 리스트 등록
	@RequestMapping(value="/stoka/stokaInsertStok.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView stokaInsertStok( StockInfoVO stockInfoVo, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();

		//insert

		//set selection
		stokaCrawlSettingService.stokaInsertStok(stockInfoVo);

		List<StockInfoVO> stockList = stokaCrawlSettingService.StokaStokList();

		mv.setViewName(BASEPATH+"/stokaStokList");
		mv.addObject("stokList", stockList);

		return mv;
	}


}
