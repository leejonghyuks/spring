package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class main_controller {

	@GetMapping("/index.do")
	public String index() {
		return null;
	}
	
}