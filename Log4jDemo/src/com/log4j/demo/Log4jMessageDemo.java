package com.log4j.demo;

/***********************************************************************************
*                 Log4j Message implementation
* This program give an overview of implementation of user define log message into  
* the console view or in file.Before implementation please read the README file once. 
* 
* 
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Ramen Guchhait
* @version 1.0
* date     July 29,2018
************************************************************************************/
import java.io.File;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jMessageDemo {

	/*
	 * we have to initialize one logger object for each java class for using the
	 * logger method to generate different log statement and Log4j provides
	 * factory method to get logger objects
	 */
	static Logger logger = Logger.getLogger(Log4jMessageDemo.class);

	public static void main(String[] args) {

		/*
		 * get the file path from project folder to read the Log4j configuration
		 * this configuration can be defined in xml file or even java code
		 */
		String log4jConfigFile = System.getProperty("user.dir").concat("\\configure") + File.separator
				+ "log4j.properties";
		/*
		 * based on the configuration in log4j.properties it decided which for
		 * message should print where to generate the log file
		 */
		PropertyConfigurator.configure(log4jConfigFile);

		/*
		 * this are the logger statement which will print into the console and
		 * file based on debugger/info/warn/fatal
		 */
		logger.debug("this is a debug log message ");
		logger.info("this is a information log message 2");
		logger.warn("this is a warning log message 3");
		logger.fatal("This is the fatal message");

		/*
		 * This is the basic configuration of message properties. when the
		 * Log4j.properties file is not provided then the BasicConfiguration do
		 * all default configuration Note : at the same time two configuration
		 * should not use otherwise same message will be printed two times
		 */
		Logger logger = Logger.getLogger(Log4jMessageDemo.class);
		BasicConfigurator.configure();
		logger.info("This is my first log4j's statement");
	}
}
