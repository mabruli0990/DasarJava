package edu.adaptive.database.model;

import java.util.Date;

public class Student extends BaseModel{
	private String studentNo;
	private String studentName;
	private String gender;
	private String birthPlace;
	private Date birthDate;
	private String address;
	
	public void setStudentNo(String studentNo)
	{
		this.studentNo = studentNo;
	}
	public String getStudentNo()
	{
		return this.studentNo;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	public String getStudentName()
	{
		return this.studentName;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getGender()
	{
		return this.gender;
	}
	
	
	public void setBirthPlace(String birthPlace)
	{
		this.birthPlace = birthPlace;
	}
	public String getBirthPlace()
	{
		return this.birthPlace;
	}
	
	public void setBirtDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}
	public Date getBirthDate()
	{
		return this.birthDate;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return this.address;
	}
	
	
}
