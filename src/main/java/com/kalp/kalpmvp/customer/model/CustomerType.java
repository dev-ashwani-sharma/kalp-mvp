package com.kalp.kalpmvp.customer.model;

public enum CustomerType {
	DAILY("daily"),
	WEEKLY("weekly"),
	MONTHLY("monthly");

	private final String type;
	
	private CustomerType(String type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
