package edu.adaptive.database.model;

public class Course extends BaseModel{
	private String courseCode;
	private String courseName;
	
	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}
	public String getCourseCode()
	{
		return courseCode;
	}
	
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	public String getCourseName()
	{
		return courseName;
	}
}
