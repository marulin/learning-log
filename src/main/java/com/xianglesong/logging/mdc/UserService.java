package com.xianglesong.logging.mdc;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

public class UserService {
	private static final Logger logger = Logger.getLogger(UserService.class);

	public void execute(User user) {
		MDC.put("userName", user.getUserName());
		logger.info("From www.91tianwu.com");
		MDC.remove("userName");
	}
}
