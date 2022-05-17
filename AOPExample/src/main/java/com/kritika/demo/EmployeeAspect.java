package com.kritika.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect 
{
	@Before("execution(public * com.kritika.demo.MyController.findAll())")
	public void input()
	{
		System.out.println("Some input Operations....");
	}
	public void output()
	{
		System.out.println("Some output Operations...");
	}
}
