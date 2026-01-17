package com.deepanshu.orderprocessingsystem.entity;


/*
 * an entity concrete class having the association relation to the items
 * also the condition on the quantity if it is not smaller
 * 
*/
public class Orders {

	private int Orderid;
	private Item item;
	private int quantity;
	
	public Orders(int orderid, Item item, int quantity) {
		if(quantity <= 0) {
			throw new IllegalArgumentException("quanntity cannot be smaller than zero:");
		}
		Orderid = orderid;
		this.item = item;
		this.quantity = quantity;
	}

	public int getOrderid() {
		return Orderid;
	}

	public Item getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
	
}
