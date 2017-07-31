package com.DesignPattern._7BridgePattern;

public class GreenCircle implements IDrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {

		 System.out.println("Drawing Circle[ color: GreenCircle, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}
