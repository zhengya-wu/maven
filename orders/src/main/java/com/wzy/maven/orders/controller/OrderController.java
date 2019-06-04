package com.wzy.maven.orders.controller;

import org.commons.util.StringUtil;

public class OrderController {

	public String getOrders(String name) {
		if (StringUtil.empty(name)) {
			System.out.println("[Order] name is empty");
			return "[Order] get orders fail";
		}
		return String.format("[Order] get %s success", name);
	}
}
