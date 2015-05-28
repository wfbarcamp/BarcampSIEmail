package com.workfront.si.mail.filter;

import com.workfront.si.util.*;
import org.springframework.integration.annotation.*;

import javax.mail.internet.*;

@MessageEndpoint
public class EmptySubjectFilter {

	@Filter
	public boolean accept(MimeMessage message) throws javax.mail.MessagingException {

		if (StringUtils.isEmpty(message.getSubject())) {
			return false;
		}
		return true;
	}
}
