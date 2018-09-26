package com.mabruli.BelajarSpringBootWeb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tbl_course")
public class Course {
	
	@Id
	@Column(name = "course_code")
	private String courseCode;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "active_flag")
	private String activeFlag;

	@Column(name = "create_by")
	private String createBy;

	@Column(name = "create_on")
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date createOn;

	@Column(name = "update_by")
	private String updateBy;

	@Column(name = "update_on")
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date updateOn;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}
	
	

}
