package com.workfront.si.mail.activator;

import org.springframework.integration.annotation.*;
import org.springframework.messaging.*;

import javax.mail.internet.*;

/**
 * Created by Garik on 5/27/15.
 */
@MessageEndpoint
public class MessageServiceActivator {

	@ServiceActivator(inputChannel = "messageChannel")
	public void handle(Message<MimeMessage> message) {
		System.out.println(message);
		// TODO something
	}
}
