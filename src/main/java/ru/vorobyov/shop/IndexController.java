package ru.vorobyov.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@GetMapping({"", "/"})
	private String showIndexPage(Model model) {
		return "index";
	}

}
