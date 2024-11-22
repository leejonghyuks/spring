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
//컨트롤로 외부 클래스로 맵핑!!
class abc{
	
	@GetMapping("/top.do")
	public String top() {
		return null;
	}
}
