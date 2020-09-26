package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// intercepting http requests with certain url pattern
	
	@GetMapping("/home")
	public String goHome() {
		System.out.println("in home controller");
		return "index"; // name of the view (resolved by viewReolver)
	}

}
