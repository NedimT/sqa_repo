package basiclearning;

import org.apache.log4j.Logger;


public class LogExample {
	private static final Logger log = Logger.getLogger(LogExample.class);
	
	public static void main(String args[]){
		log.debug("Hello world from debug");
		log.info("Hello world from inffo");
		log.warn("Hello world from warning");
		log.error("Hello world from error");
	}
}
