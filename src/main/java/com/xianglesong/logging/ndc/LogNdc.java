package com.xianglesong.logging.ndc;

import org.apache.log4j.Logger;

import com.xianglesong.logging.mdc.User;

public class LogNdc {
	private static final Logger logger = Logger.getLogger(LogNdc.class);

	public static void main(String[] args) {
		logger.info("This is  demo for the Log4j NDC concept");
		UserServiceNDC userServiceNDC = new UserServiceNDC();
		User user = new User();
		user.setUserName("Rollin");
		userServiceNDC.execute(user);
		logger.debug("Just some sample messages");
	}
}
