package com.mabruli.BelajarSpringBootWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class studentCourseController {
	
	@RequestMapping("/studentCourse")
	public String studentCourse()
	{
		return "studentCourse";
	}

}
