package com.photo.web.email;

import java.util.Properties;
import java.util.ResourceBundle;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

import com.photo.web.model.ContactVo;

@Component
public class EmailSenderImpl{
	public static String To = "sasmita.maharana555@gmail.com";
	
		public void send(ContactVo contact) throws MessagingException {

		Properties properties = new Properties();
		//To read properties file
		ResourceBundle rb = ResourceBundle.getBundle("email");
		properties.setProperty("mail.smtp.host", rb.getString("mail.smtp.host"));
		properties.setProperty("mail.smtp.socketFactory.port", rb.getString("mail.smtp.socketFactory.port"));
		properties.setProperty("mail.login.username", rb.getString("mail.login.username"));
		properties.setProperty("mail.login.password", rb.getString("mail.login.password"));
		properties.setProperty("mail.smtp.starttls.enable",rb.getString("mail.smtp.starttls.enable"));
		properties.setProperty("mail.smtp.auth", rb.getString("mail.smtp.auth"));
		
		Session session = Session.getDefaultInstance(properties,
				  new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(rb.getString("mail.login.username"), rb.getString("mail.login.password"));
					}
				  });
		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(contact.getFrom()));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(To));
		msg.setSubject(contact.getSubject());
		msg.setContent("<h1>"+contact.getMessage()+"</h1>","text/html");
		Transport.send(msg);
        System.out.println("Mail successfully sent");
	}

}
