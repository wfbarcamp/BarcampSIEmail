package com.workfront.si.util;

/**
 * Created by Garik on 5/28/15.
 */
public class StringUtils {

	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}
}
