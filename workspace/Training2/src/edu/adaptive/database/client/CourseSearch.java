package edu.adaptive.database.client;

import java.util.List;
import java.util.ArrayList;

import edu.adaptive.database.model.Course;
import edu.adaptive.database.service.CourseService;
import edu.adaptive.database.service.CourseServiceImpl;

public class CourseSearch {
	public void Search()
	{
		CourseService courseService = new CourseServiceImpl();
		List<Course> courseList = null;
		Course course = null;
		
		courseList = courseService.search();
		
		System.out.println("\n Course Code     Course Name     Flag");
		System.out.println("--------------------------------------------------------");
		for(int i=0; i<courseList.size(); i++)
		{
			course = courseList.get(i);
			System.out.printf(" \n%-20s%-20s%-6s",
					course.getCourseCode(),
					course.getCourseName(),
					course.getActiveFlag()
					);
		}
	}
	
}
