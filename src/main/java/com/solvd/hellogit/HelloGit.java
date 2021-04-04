package com.solvd.hellogit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class HelloGit {


	public static void main(String[] args) {
		Logger log = LogManager.getFormatterLogger(HelloGit.class);

		
		log.info("Hello Git");
		Fibonacci f = new Fibonacci(20);
		log.info(Arrays.toString(f.calculateFiboNums()));
	}

}
