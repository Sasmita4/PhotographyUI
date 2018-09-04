package com.photo.web.service.Impl;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photo.web.email.EmailSenderImpl;
import com.photo.web.model.ContactVo;
import com.photo.web.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	EmailSenderImpl emailSenderImpl;
	
	@Override
	public void sendEmail(ContactVo contact) throws MessagingException {
		emailSenderImpl.send(contact);
	}

}
