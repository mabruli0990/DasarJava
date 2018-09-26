package edu.adaptive.database.model;

public class StudentCourse extends BaseModel{
	private String studentNo;
	private String courseCode;
	private String semester;
	private int result;
	private String studentName;
	private String courseName;
	
	public void setStudentNo(String studentNo)
	{
		this.studentNo = studentNo;
	}
	public String getStudentNo()
	{
		return studentNo;
	}
	
	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}
	public String getCourseCode()
	{
		return courseCode;
	}
	
	public void setSemester(String semester)
	{
		this.semester = semester;
	}
	public String getSemester()
	{
		return semester;
	}
	
	public void setResult (int result)
	{
		this.result = result;
	}
	public int getResult()
	{
		return result;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	public String getStudentName()
	{
		return this.studentName;
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