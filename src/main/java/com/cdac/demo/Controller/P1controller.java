package com.cdac.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class P1controller {
	@GetMapping("/")
	public String test()
	{
		String name="ABC";
		return "get api call working";
	}

}
