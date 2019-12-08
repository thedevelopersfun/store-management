package com.mart;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Inventory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4187874526994558766L;
	public static final String FILE = "D:\\Proj\\Inventory.txt";
	private Map<String, Item> ItemList = new LinkedHashMap<String, Item>();
	
	public Inventory() {
//		ItemList.put("admin", new Item("Admin",
//				Role.ROLE_ADMIN, "", new Long("9999999999"), "admin@mystore.com"));
//		ItemList.put("manager", new Item("Store Manager",
//				Role.ROLE_MANAGER, "", new Long("8888888888"), "manager@mystore.com"));
//		ItemList.put("Item", new Item("Item",
//				Role.ROLE_Inventory, "", new Long("7777777777"), "Item@mystore.com"));
	}
	
	public Map<String, Item> getInventorys() {
				
		return ItemList;
	}
	
	public void addInventorys(List<Item> Items) {
		
		Items.forEach(u -> ItemList.put(u.getName(), u));
	}
	
	public void addInventory(Item item) {
		
		ItemList.put(item.getName(), item);
	}
	
	public void updateInventoryDetails(Item item) {
		
		ItemList.put(item.getName(), item);
	}
	
	public void deleteInventory(Item item) {
		
		ItemList.remove(item.getName());
	}
	
	

}
