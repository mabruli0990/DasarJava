package com.mabruli.BelajarSpringBootWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/tables")
	public String tables()
	{
		return "tables";
	}
	
	@RequestMapping("/forms")
	public String forms()
	{
		return "forms";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/blank")
	public String blank()
	{
		return "blank";
	}
	
	@RequestMapping("/buttons")
	public String buttons()
	{
		return "buttons";
	}
	
	@RequestMapping("/flot")
	public String flot()
	{
		return "flot";
	}
	
	@RequestMapping("/grid")
	public String grid()
	{
		return "grid";
	}
	
	@RequestMapping("/icons")
	public String icons()
	{
		return "icons";
	}
	
	@RequestMapping("/morris")
	public String morris()
	{
		return "morris";
	}
	
	@RequestMapping("/notifications")
	public String notifications()
	{
		return "notifications";
	}
	
	@RequestMapping("/panels-wells")
	public String panels()
	{
		return "panels-wells";
	}
	
	@RequestMapping("/typography")
	public String typography()
	{
		return "typography";
	}
	
}
