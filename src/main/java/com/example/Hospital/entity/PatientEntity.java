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
@Table(name = "patient")
public class PatientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "idnumber")
	private String idnumber;
	@Column(name = "p_birthday")
	private Date birthday;
	@Column(name = "p_phone")
	private String phone;
	@Column(name = "p_address")
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
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
	public PatientEntity(int id, String name, String idnumber, Date birthday, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.idnumber = idnumber;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
	}
	public PatientEntity() {
		super();
	}
	
}
