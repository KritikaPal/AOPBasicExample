package com.kritika.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController 
{
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	@RequestMapping("/findAll")
	public String findAll()
	{
		System.out.println("Process....");
		return "welcome.jsp";
	}
}
