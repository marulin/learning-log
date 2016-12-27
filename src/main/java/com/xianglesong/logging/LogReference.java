package com.xianglesong.logging;

import org.apache.log4j.Logger;

public class LogReference {

	public static void main(String[] args) {
		Logger x = Logger.getLogger("wombat");
		Logger y = Logger.getLogger("wombat");
		Logger z = Logger.getLogger("a");
		System.out.println(x == y);
		System.out.println(x == z);
	}

}
