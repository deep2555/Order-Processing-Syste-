package com.deepanshu.orderprocessingsystem.domainservice;

import java.util.Map;

import com.deepanshu.orderprocessingsystem.entity.Item;
import com.deepanshu.orderprocessingsystem.entity.Orders;
import com.deepanshu.orderprocessingsystem.enumlist.OrderStatus;
import com.deepanshu.orderprocessingsystem.valueobject.DataResult;

/*
 * a domain service class holding the map data structure 
 * holding the key value pair of items and integer(quantity)
 * also a method to check and update the stocks
*/
public class Inventory {

	private Map<Item, Integer> stockMap;

	public Inventory(Map<Item, Integer> stockMap) {
		super();
		this.stockMap = stockMap;
	}

	/*
	 * this method first fetch the item name and quantity than check and update the
	 * stock first the condition check if the given order present in the inventory
	 * or not also check the quantity requested is available or not if not than
	 * return the result or status if yes than add in map with the updated field and
	 * quantity.
	 * 
	 */
	public DataResult checkAndUpdateStocks(Orders order) {

		Item itemList = order.getItem();
		int requestedQuantity = order.getQuantity();
		int availableQuantity = stockMap.get(itemList);

		if (!stockMap.containsKey(itemList)) {
			return new DataResult(order.getOrderid(), 
					OrderStatus.FAILED, 
					"item not found in the inventory");
		}
		if(requestedQuantity > availableQuantity) {
			return new DataResult(order.getOrderid(), 
					OrderStatus.FAILED, 
					"Insufficent stock");
		}
		 // update stock if all are fine
		stockMap.put(itemList, requestedQuantity-availableQuantity);

		return new DataResult(order.getOrderid(), 
					OrderStatus.SUCCESS, 
					"Order successfully placed");

	}
}
