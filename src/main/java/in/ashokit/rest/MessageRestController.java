package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.MessageService;

@RestController
public class MessageRestController {

	@Autowired
	private MessageService service;
        
	@GetMapping("/message")
	public String getMessage() {
		String createMessage = service.createMessage();
		return createMessage;
	}
       
}
