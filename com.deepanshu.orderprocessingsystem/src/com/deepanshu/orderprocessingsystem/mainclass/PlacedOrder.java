package com.deepanshu.orderprocessingsystem.mainclass;

import java.util.HashMap;
import java.util.Map;

import com.deepanshu.orderprocessingsystem.domainservice.Inventory;
import com.deepanshu.orderprocessingsystem.entity.Item;
import com.deepanshu.orderprocessingsystem.entity.Orders;
import com.deepanshu.orderprocessingsystem.valueobject.DataResult;

public class PlacedOrder {

	
	public static void main(String[] args) {
		
		
		Item laptop  = new Item(1, "Laptop");
		Item mobile  = new Item(2, "mobile");
		Item tablet  = new Item(3, "tablet");
		Item ac  = new Item(4, "ac");
		
		Map<Item, Integer> mapStock = new HashMap<>();
		mapStock.put(ac, 3);
		mapStock.put(laptop, 3);
		mapStock.put(mobile, 3);
		mapStock.put(tablet, 3);
		
		Inventory inverInventory = new Inventory(mapStock);
		
		
		Orders order1 = new Orders(1, laptop, 2);
		Orders order2 = new Orders(2, mobile, 3);
		Orders order3 = new Orders(3, tablet, 3);
		
		// check the order
		
		DataResult result = inverInventory.checkAndUpdateStocks(order1);
		System.out.println(result.getId()+" the status is : "+ result.getStatus() + " the reason is:" + result.getReason());
		

	}
}
