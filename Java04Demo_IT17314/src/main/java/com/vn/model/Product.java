package com.vn.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_product")
	private Integer id;
	
	@Column(name = "product_name", length = 100, nullable = false)
	private String name;
	
	@Column(length = 500, nullable = true)
	private String description;
	
	@Column(length = 100, nullable = false)
	private String image;
	
	@Column(precision = 18, scale = 2)
	private Double price;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "create_date")
	private Date createDate;
	
	public Product() {
		super();
	}
	
	public Product(Integer id, String name, String description, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.createDate = createDate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
