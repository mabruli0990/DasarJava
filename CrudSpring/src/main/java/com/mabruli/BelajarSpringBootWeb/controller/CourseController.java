package com.mabruli.BelajarSpringBootWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mabruli.BelajarSpringBootWeb.model.Course;
import com.mabruli.BelajarSpringBootWeb.service.CourseService;


@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/course")
	public String course(Model model)
	{
		model.addAttribute("Course", courseService.listCourse() );
		return "course";
		
	}
	
	
	@RequestMapping(value = "/course/add", method = RequestMethod.GET)
	public String formCourse(Model model)
	{
		model.addAttribute("Course", new Course());
		return "addEditCourse";
	}
	
	@RequestMapping(value = "/course/add", method = RequestMethod.POST)
	public String addCourse(Model model, Course course)
	{
		model.addAttribute("Course", courseService.addOrUpdate(course));
	
		return "redirect:/course";
	}
	
	@RequestMapping(value = "/course/edit/{courseCode}", method = RequestMethod.GET)
	public String editCourse(@PathVariable String courseCode,Model model)
	{
		model.addAttribute("Course", courseService.getCourseCode(courseCode));
		return "addEditCourse";
	}
	
	@RequestMapping(value = "/course/remove/{courseCode}", method = RequestMethod.GET)
	public String removeCourse(@PathVariable String courseCode)
	{
		courseService.removeCourse(courseCode);
		return "redirect:/course";
	}

}
