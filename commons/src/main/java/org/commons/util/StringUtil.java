package org.commons.util;

public class StringUtil {

	/**
	 * 判断对象是否为空
	 * @param object
	 * @return
	 */
	public static boolean empty(Object object) {
		return (object == null || "".equals(object));
	}
}
