package com.DesignPattern._4BuilderPattern;

public abstract class Burger implements IFoodItem {

 
	@Override
	public abstract float price();

	@Override
	public IPacking packing() {
		return new Wrapper();
	}

}
