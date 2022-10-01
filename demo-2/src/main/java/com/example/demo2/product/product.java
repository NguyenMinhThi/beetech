package com.example.demo2.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer product_ID;
	@Column(name = "product_Name", nullable = false)
    private String product_Name;
	@Column(name = "product_Description", nullable = false)
    private String product_Description;
    @Column(name = "product_Category", nullable = false)
    private String product_Category;
    @Column(name = "product_date", nullable = false)
    private String product_Date;
	public Integer getProduct_ID() {
		return product_ID;
	}
	public void setProduct_ID(Integer product_ID) {
		this.product_ID = product_ID;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getProduct_Description() {
		return product_Description;
	}
	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}
	public String getProduct_Category() {
		return product_Category;
	}
	public void setProduct_Category(String product_Category) {
		this.product_Category = product_Category;
	}
	public String getProduct_Date() {
		return product_Date;
	}
	public void setProduct_Date(String product_Date) {
		this.product_Date = product_Date;
	}
    

}
