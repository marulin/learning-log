package com.xianglesong.logging.ndc;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

import com.xianglesong.logging.mdc.User;

public class UserServiceNDC {
	private static final Logger logger = Logger.getLogger(UserServiceNDC.class);

	public void execute(User user) {
		NDC.push("ndcflag:" + user.getUserName());
		logger.info("From www.91tianwu.com");
		logger.info("TO");
		NDC.pop();
	}
}
