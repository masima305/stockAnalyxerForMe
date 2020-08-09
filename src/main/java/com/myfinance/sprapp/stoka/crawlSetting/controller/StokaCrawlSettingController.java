package com.myfinance.sprapp.stoka.crawlSetting.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.myfinance.sprapp.HomeController;
import com.myfinance.sprapp.stoka.crawlSetting.vo.StockInfoVO;
import com.sun.tools.javac.util.List;



@Controller
public class StokaCrawlSettingController {
	private static final Logger logger = LoggerFactory.getLogger(StokaCrawlSettingController.class);

	@Value("com/myfinance/sprapp/stoka/crawlSetting")
	String BASEPATH;

	StockInfoVO stockInfoVo;

	@RequestMapping(value="/stoka/stokaStokList.do", method = RequestMethod.GET)
	public ModelAndView StokaStokList( Model model, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();

		List<StockInfoVO> stockList;

		mv.setViewName(BASEPATH+"/stokaStokList");
		return mv;
	}



}
