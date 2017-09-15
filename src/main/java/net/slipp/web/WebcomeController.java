package net.slipp.web;

import org.springframework.stereotype.Controller;

@Controller
public class WebcomeController {
	
	public String welcome() {
		return "welcome";
	}
}
