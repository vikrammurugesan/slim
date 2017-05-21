package com.slim.kafka.appender;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	static Logger log = LogManager.getLogger(new Main().getClass());
	public static void main(String[] args) throws InterruptedException {
		while(true){
			log.info("Logger a random value" + new Random().nextInt() );
			TimeUnit.SECONDS.sleep(2);
		}

	}

}
