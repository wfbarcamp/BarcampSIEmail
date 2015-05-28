package com.workfront.si.mail.gateway;

import javax.mail.internet.*;

public interface MessageGateway {

	public void send(MimeMessage message);
}
