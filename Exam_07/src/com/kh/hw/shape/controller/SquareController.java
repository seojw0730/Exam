package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();

	public double calcPerimeter(double height, double width) {
		double result = 0.0;
		// TODO ? 생성자로...
		s.setHeight(height);
		s.setWidth(width);
		// 둘레: 너비*2 + 높이*2
		result = height * 2 + width * 2;
		return result;
	}

	public double calcArea(double height, double width) {
		double result = 0.0;
		// TODO
		s.setHeight(height);
		s.setWidth(width);
		result = height * width;
		return result;
	}

	public void paintColor(String color) {
		s.setColor(color);
		// TODO
	}

	public String print() {
		String result = "";
		result = "사각형 : " + s.information();
		// TODO
		return result;
	}

}
