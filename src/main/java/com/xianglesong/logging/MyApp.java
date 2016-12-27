package com.xianglesong.logging;

// Import log4j classes.
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

import com.foo.Bar;

public class MyApp {
	// Define a static logger variable so that it references the
	// Logger instance named "MyApp".
	static Logger logger = Logger.getLogger(MyApp.class);

	public static void main(String[] args) {
		// Set up a simple configuration that logs on the console.
		// BasicConfigurator.configure();
		// String parm = "/Users/rollin/tools/workspace/logdemo/"
		// + "src/main/resources/log4j.simple";
		String parm = "/Users/rollin/tools/workspace/logdemo/"
				+ "src/main/resources/log4j.complex";
		PropertyConfigurator.configure(parm);

		logger.info("Entering application.");
		Bar bar = new Bar();
		bar.doIt();
		logger.info("Exiting application.");
	}
}