package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int height, int width) {
		int Area = height * width;
		return x + ", " + y + ", " + height + ", " + width + " / " + Area;
	}

	public String calcPerimeter(int x, int y, int height, int width) {
		int perimeter = 2 * (height + width);
		return x + ", " + y + ", " + height + ", " + width + " / " + perimeter;
	}

}
