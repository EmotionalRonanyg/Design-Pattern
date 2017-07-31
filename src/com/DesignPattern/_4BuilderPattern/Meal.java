package com.DesignPattern._4BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<IFoodItem> fooditems = new ArrayList<IFoodItem>( );
	
	public void addItem (IFoodItem foodItem) {
		fooditems.add(foodItem);
	}
	
	public float getCost() {
		float cost = 0.0f;
		
		for (IFoodItem foodItem : fooditems) {
			cost += foodItem.price();
			
		}
		return cost;
	}
	
	public void showItems() {
		
		for (IFoodItem foodItem : fooditems) {
			
			System.out.print("foodItem :"+foodItem.name());
			System.out.print(",Packing :"+foodItem.packing().pack());
			System.out.println(",Price :"+foodItem.price());
			
		}
	}
	
	
	
	
}
