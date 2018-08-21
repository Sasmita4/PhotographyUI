package com.photo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.photo.web.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getEachImage() {
		//homeService.getEachImage();
		return "dashboardAndHome";
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    