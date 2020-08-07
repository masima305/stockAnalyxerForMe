package com.myfinance.sprapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
	
	@Autowired
	HomeDao homeDao;

	public HomeVO selectTest() throws Exception	{
		homeDao.selectTtest();
		return homeDao.selectTest();
	}
	
	
}
