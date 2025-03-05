package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/test")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="HelloWorld") String name, Model model) {
		LocalDateTime nowDate = LocalDateTime.now();
		DateTimeFormatter dtf1 =
	    DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS"); // ①
	    String formatNowDate = dtf1.format(nowDate);
	    model.addAttribute("nowdate", formatNowDate);
		model.addAttribute("name", name);
		return "greeting";
	}

}
