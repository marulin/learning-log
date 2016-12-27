package com.xianglesong.logging.mdc;

import org.apache.log4j.Logger;

public class LogMdc {
	private static final Logger logger = Logger.getLogger(LogMdc.class);

	public static void main(String[] args) {
		logger.info("This is  demo for the Log4j MDC concept");
		UserService userService = new UserService();

		User user = new User();
		user.setUserName("Rulin");
		user.setAge(19);
		userService.execute(user);
		
		logger.debug("Just some sample messages");
	}
}
