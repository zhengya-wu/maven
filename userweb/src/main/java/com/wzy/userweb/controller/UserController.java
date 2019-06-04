package com.wzy.userweb.controller;


import org.commons.util.StringUtil;

import com.wzy.userweb.vo.User;

public class UserController {

	public User getUser(String name) {
		if (StringUtil.empty(name)) {
			System.out.println("[User] name is empty");
			return null;
		}
		return new User(name, "nanjing");
	}
}
