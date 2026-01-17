package com.deepanshu.orderprocessingsystem.valueobject;

import com.deepanshu.orderprocessingsystem.enumlist.OrderStatus;

public class DataResult {

	
	private int id;
	private OrderStatus status;
	private String reason;
	
	public DataResult(int id, OrderStatus status, String reason) {
		super();
		this.id = id;
		this.status = status;
		this.reason = reason;
	}

	public int getId() {
		return id;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public String getReason() {
		return reason;
	}
	
	
	
}
