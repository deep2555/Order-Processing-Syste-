package com.deepanshu.orderprocessingsystem.entity;

/*
 * an entity class hold the id and the name of the item
*/
public class Item {

	private int id;
	private String itemName;
	
	public Item(int id, String itemName) {
		super();
		this.id = id;
		this.itemName = itemName;
	}

	public int getId() {
		return id;
	}

	public String getItemName() {
		return itemName;
	}
	
	
	
}
