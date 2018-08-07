package com.photo.web.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photo.web.dao.HomeDao;
import com.photo.web.domain.Home;
import com.photo.web.model.HomeVo;
import com.photo.web.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeDao homeDao;

	@Override
	public HomeVo getEachImage() {
		HomeVo homeVo;
		Home home = homeDao.getEachImage();
		return null;
	}

}
