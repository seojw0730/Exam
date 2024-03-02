package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.model.vo.Point;

public class CircleController {
	private Circle c = new Circle();
	final float PI = 3.14f;

	public String calcArea(int x, int y, int radius) {
		double Area = PI * radius * radius;
		return x + ", " + y + ", " + radius + " / " + Area;
	}

	public String calcCircum(int x, int y, int radius) {
		double Circum = 2 * PI * radius;
		return x + ", " + y + ", " + radius + " / " + Circum;
	}
}
