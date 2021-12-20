package com.example.Hospital.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class DoctorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "d_name")
	private String name;
	@Column(name = "d_gender")
	private String gender;
	@Column(name = "d_birthday")
	private Date birthday;
	@Column(name = "d_seniority")
	private String seniority;
	@Column(name = "idnumber")
	private String idnumber;
	@Column(name = "d_level")
	private String level;
	@Column(name = "d_phone")
	private String phone;
	@Column(name = "d_address")
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSeniority() {
		return seniority;
	}
	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public DoctorEntity(int id, String name, String gender, Date birthday, String seniority, String idnumber,
			String level, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.seniority = seniority;
		this.idnumber = idnumber;
		this.level = level;
		this.phone = phone;
		this.address = address;
	}
	public DoctorEntity() {
		super();
	}
	
	
}
