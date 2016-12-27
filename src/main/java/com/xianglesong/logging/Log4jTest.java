package com.xianglesong.logging;

import org.apache.log4j.Logger;

public class Log4jTest {

	private static final Logger logger = Logger.getLogger(Log4jTest.class);

	public static void main(String[] args) {
		logger.info("start");
		logger.error("我的测试邮件");
		logger.info("end");
	}

}
