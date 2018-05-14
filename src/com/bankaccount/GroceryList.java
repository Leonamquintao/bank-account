package com.bankaccount;

import java.util.ArrayList;


public class GroceryList {
	
	private ArrayList<String> groceryList = new ArrayList<>();
	
	//----------------------------------------------------------------
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	//----------------------------------------------------------------
	public void printGroceryList() {
		System.out.println("You have "+ groceryList.size() + " items in you grocery list!");
		
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1)+ " . " + groceryList.get(i));
		}
	}
	
	//----------------------------------------------------------------
	public void updateGroceryItem(int pos, String item) {
		groceryList.set(pos, item);
		System.out.println("Grocery item " + (pos+1) + " has been updated!");
	}
	
	//----------------------------------------------------------------
	public void removeGroceryItem(int pos) {
		String itm = groceryList.get(pos);
		groceryList.remove(pos);
	}

	//----------------------------------------------------------------
	public String findItem(String item) {

		boolean exists = groceryList.contains(item);

		if(exists) {
			int idx = groceryList.indexOf(item);
			return groceryList.get(idx);
		}

		return null;
	}



}
