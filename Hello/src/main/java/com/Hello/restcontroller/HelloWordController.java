package com.Hello.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
	
	@RequestMapping(value="/")
	public String example() {
		
		return "Hello World !!!!!!!!!";
		
		
	}

}
