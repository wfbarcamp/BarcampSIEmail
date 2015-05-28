package com.workfront.si;

import com.workfront.si.mail.gateway.*;
import org.springframework.context.*;
import org.springframework.context.support.*;

import javax.mail.*;
import javax.mail.internet.*;

/**
 * Created by Garik on 5/27/15.
 */
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MessageGateway gateway = (MessageGateway) context.getBean("messageGateway");

		try {
			MimeMessage message = new MimeMessage((Session) null);
			message.setFrom(new InternetAddress("garegin.chichyan@gmail.com"));
			message.setSubject("Old Company");
			message.setText("Some content");

			gateway.send(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
