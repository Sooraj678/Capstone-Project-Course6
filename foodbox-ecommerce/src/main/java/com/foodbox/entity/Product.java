package com.foodbox.entity;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "units_in_stock")
	private int unitsInStock;
	
	@Column(name = "date_created")
	@CreationTimestamp
	/* By This annotation Hibernate will automatically manage the timestamps, No need for developer
	 * to manually call these methods to set these fields*/
	private Date dateCreated;
	
	@Column(name = "last_updated")
	@UpdateTimestamp
	/* By This annotation Hibernate will automatically manage the timestamps, No need for developer
	 * to manually call these methods to set these fields*/
	private Date lastUpdated;
	

}
