package com.photo.web.service;

import javax.mail.MessagingException;

import com.photo.web.model.ContactVo;

public interface ContactService {
	public void sendEmail(ContactVo contact) throws MessagingException;
}
