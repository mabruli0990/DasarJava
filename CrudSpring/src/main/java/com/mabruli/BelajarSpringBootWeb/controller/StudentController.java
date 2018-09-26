package com.mabruli.BelajarSpringBootWeb.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mabruli.BelajarSpringBootWeb.model.Student;
import com.mabruli.BelajarSpringBootWeb.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/student")
	public String student(Model model )
	{
		model.addAttribute("Student", studentService.listStudent());
		return "student";
	}
	
	@RequestMapping(value= "/student/add", method = RequestMethod.GET)
	public String formStudent(Model model)
	{
		model.addAttribute("Student", new Student());
		return "addEditStudent";
	}
	
	@RequestMapping(value= "/student/add", method = RequestMethod.POST)
	public String add(Model model, Student student) 
	{	
		student.setCreateBy("admin");
		student.setCreateOn(new Date());
		
		model.addAttribute("Student", studentService.addEditStudent(student));
		return "redirect:/student";
	}
	
	@RequestMapping(value= "/student/edit/{studentNo}", method = RequestMethod.GET)
	public String edit(@PathVariable String studentNo, Model model) 
	{
		model.addAttribute("Student",studentService.getStudentNo(studentNo));
		return "addEditStudent";
	}
	
	@RequestMapping(value= "/student/remove/{studentNo}", method = RequestMethod.GET)
	public String remove(@PathVariable String studentNo) 
	{
		studentService.removeStudent(studentNo);
		return "redirect:/student";
	}
	

}
