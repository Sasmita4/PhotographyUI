package com.photo.web.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.photo.web.model.ContactVo;
import com.photo.web.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	ContactService contactService;

	@RequestMapping(value="/contact",method=RequestMethod.GET)
	public String contactPage(@ModelAttribute("contact")ContactVo contact) {
		return "contact";
	}
	
	@RequestMapping(value="/sendEmail",method=RequestMethod.POST)
	public void sendEmail(@ModelAttribute("contact")ContactVo contact) throws MessagingException {
		contactService.sendEmail(contact);
	}
}
