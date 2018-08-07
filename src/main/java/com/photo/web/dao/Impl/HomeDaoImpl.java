package com.photo.web.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.photo.web.dao.HomeDao;
import com.photo.web.domain.Home;
import com.photo.web.repository.HomeRepository;

@Component
public class HomeDaoImpl implements HomeDao {

	@Autowired
	HomeRepository homeRepoitory;
	
	@Override
	public Home getEachImage() {
		List<Home> home =  (List<Home>) homeRepoitory.findAll();
		return null;
	}

}
;