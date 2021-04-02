package com.solvd.hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class hello {
    private final static Logger logger = LogManager.getLogger(hello.class);
    public static String main(String[] args) {
        if(args != null){
            logger.info("Greeting returned");
            return "Hello " + args[0] + "!";
        } else{
            logger.info("Greeting returned");
            return "Hello git!";
        }
    }
}
