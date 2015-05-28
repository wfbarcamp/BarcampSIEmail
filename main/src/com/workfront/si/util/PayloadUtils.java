package com.workfront.si.util;

import javax.mail.*;
import javax.mail.internet.*;

/**
 * Created by Garik on 5/28/15.
 */
public class PayloadUtils {

	public String getCompanyType(MimeMessage message) throws MessagingException {
		String subject = message.getSubject();

		if (subject != null) {
			if (subject.startsWith("New Company")) {
				return "current";
			} else if (subject.startsWith("Old Company")) {
				return "previous";
			}
		}
		return null;
	}
}
