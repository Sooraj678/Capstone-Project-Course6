package com.foodbox.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
/* Remember always that lombak project will create getters and setters for you
 * internally automatically, we won't be able to see these getters and setters
 * but it will work internally*/
@Entity
@Table(name="product")
@Data
public class Product {
	private Long id;
	private String sku;
	private String name;
	private String description;
	private BigDecimal unitPrice;
	private String imageUrl;
	private boolean active;
	private int unitsInStock;
	private Date dateCreated;
	private Date lastUpdated;
	

}
