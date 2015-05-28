package com.workfront.si.mail.transformer;

import org.springframework.integration.annotation.*;
import org.springframework.mail.*;

import javax.mail.*;
import javax.mail.internet.*;

@MessageEndpoint
public class UnWantedMessageTransformer {

	@Transformer
	public SimpleMailMessage transform(MimeMessage mimeMessage) throws MessagingException {

		InternetAddress address = (InternetAddress) mimeMessage.getFrom()[0];

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(address.getAddress());
		message.setSubject("Out of Office");
		message.setText("I am out of office, please call me on phone");

		return message;
	}
}
