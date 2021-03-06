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

	@Autowired
	StockCrawler stockCrawler;

	//주식 리스트 조회
	public List<StockInfoVO> StokaStokList() throws Exception{
		return commonDao.selectList("mappers.crawlSetting-mapper.selectStockInfoList");
	}

	//주식 등록
	public void stokaInsertStok(StockInfoVO stockInfoVo) throws Exception {
		commonDao.insert("mappers.crawlSetting-mapper.stokaInsertStok", stockInfoVo);
	}

	//-----------------------------------------주식 정보 가져오기-----------------------------------------

	public void stokaCrawlStart(StockInfoVO stockInfoVo) throws Exception {


		System.out.println("크롤링 시작");

		stockCrawler.CrawlStart(stockInfoVo);

	}






}
