package com.solvd.hellogit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloGit {
	private static final Logger log = LogManager.getFormatterLogger(HelloGit.class);

	public static void main(String[] args) {

		log.info("Hello Git");
		Fibonacci f = new Fibonacci();

		if (System.console() != null && args != null) {

			Pattern pattern = Pattern.compile("[0-9]+");
			Matcher m = pattern.matcher(args[0]);

			if(m.matches()){
				log.info("Computing Fibonacci");
				f.assignFiboNums(Integer.parseInt(args[0]));
				log.info(Arrays.toString(f.calculateFiboNums()));

				log.info("Computing Collatz");
				log.info(Collatz.calculateSteps(Integer.parseInt(args[0])));

			}else genericInput(f);
		}else genericInput(f);
	}

	public static void genericInput(Fibonacci f){
		log.info("Generic Fibonacci and Collatz with 20");
		f.assignFiboNums(20);
		log.info(Arrays.toString(f.calculateFiboNums()));
		log.info(Collatz.calculateSteps(20));
	}
}
