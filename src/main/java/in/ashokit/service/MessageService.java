package in.ashokit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
private Logger logger = LoggerFactory.getLogger(MessageService.class);
	  
	public String createMessage() {
		logger.trace("this is tracing messasge...");
		logger.debug("this is debug message...");
		
		logger.info("createMessage()- (info) started....");
		String msg = "Welcome to Ashok it...!!";
		logger.info("createMessage()- (info) ended....");
		
		logger.warn("This is warn message..");
		logger.error("This is error message...");
		return msg;
	}
}
