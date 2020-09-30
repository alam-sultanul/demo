package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String showIndex()  {
		return "view";
	}
	
	@RequestMapping(value = "/second", method = RequestMethod.GET)
	public String showSecond()  {
		return "second";
	}
	
	@RequestMapping(value = "/third", method = RequestMethod.POST)
	public String showThird()  {
		return "third";
	}
}
// localhost:8080/index
// fbhost:90 -> facebook.com/user
// localhost:8080/api/v1/product/
// 404 -> page not found