package com.mart;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2294960768481362832L;
	
	private String name;
	private String price; 
	private Long availableQuantity; 
	private String batch;
	private Date batchDate;
	
	public Item(String name, String price, Long availableQuantity, String batch, Date batchDate) {
		super();
		this.name = name;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.batch = batch;
		this.batchDate = batchDate;
	}

	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}

	public Long getAvailableQuantity() {
		return availableQuantity;
	}

	public String getBatch() {
		return batch;
	}

	public Date getBatchDate() {
		return batchDate;
	}
	
	
	
	
	
	

}
