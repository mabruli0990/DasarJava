package com.mabruli.BelajarSpringBootWeb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tbl_student")
public class Student {

	@Id
	@Column(name = "student_no")
	private String studentNo;

	@Column(name = "student_name")
	private String studentName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "birth_date")
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date birthDate;

	@Column(name = "birth_place")
	private String birthPlace;

	@Column(name = "address")
	private String address;

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

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
