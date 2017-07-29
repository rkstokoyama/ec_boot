package com.example.ec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("msg", "成功");
		return "index";
	}
}
