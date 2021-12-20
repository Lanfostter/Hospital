package com.example.Hospital.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine")
public class MedicineEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "m_name")
	private String name;
	@Column(name = "m_importdate")
	private Date importdate;
	@Column(name = "m_expireddate")
	private Date expireddate;
	@Column(name = "m_quantity")
	private int quantity;
	@Column(name = "m_price")
	private double price;
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
	public Date getImportdate() {
		return importdate;
	}
	public void setImportdate(Date importdate) {
		this.importdate = importdate;
	}
	public Date getExpireddate() {
		return expireddate;
	}
	public void setExpireddate(Date expireddate) {
		this.expireddate = expireddate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public MedicineEntity(int id, String name, Date importdate, Date expireddate, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.importdate = importdate;
		this.expireddate = expireddate;
		this.quantity = quantity;
		this.price = price;
	}
	public MedicineEntity() {
		super();
	}
	

}
