package com.ironManSocial.utils.test;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingTest {

	private static final Logger logger = LoggerFactory.getLogger("com.ironManSocial.logger");
	
	
	public static void main(String[] args) {

		logger.info("Example log from {}", LoggingTest.class.getSimpleName());
		
	}

}
