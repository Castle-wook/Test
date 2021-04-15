package com.sw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("one", "변성욱 노트");
		model.addAttribute("two", "지금 당신의 기분은?");
		return "notebook";
	}
}