package com.myfinance.sprapp.stoka.crawlSetting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfinance.sprapp.CommonDao;
import com.myfinance.sprapp.stoka.crawlSetting.vo.StockInfoVO;



@Service
public class StokaCrawlSettingService {

	@Autowired
	CommonDao commonDao;

	public List<StockInfoVO> StokaStokList() throws Exception{
		return commonDao.selectList("mappers.crawlSetting-mapper.selectStockInfoList");
	}


}
