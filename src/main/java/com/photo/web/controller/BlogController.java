package com.photo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogController {

	@RequestMapping(value="/blog",method=RequestMethod.GET)
		public String blogPage() {
			return "blog";
		}
	}

