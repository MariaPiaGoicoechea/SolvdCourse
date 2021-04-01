package com.solvd.hellogit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloGit {


	public static void main(String[] args) {
		Logger log = LogManager.getFormatterLogger(HelloGit.class);

		
		log.info("Hello Git");
	}

}
