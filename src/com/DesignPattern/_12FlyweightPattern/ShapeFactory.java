package com.DesignPattern._12FlyweightPattern;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String, IShape> circleMap = new HashMap<String, IShape>();

	public static IShape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
