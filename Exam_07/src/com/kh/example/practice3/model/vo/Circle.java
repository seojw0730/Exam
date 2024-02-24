package com.kh.example.practice3.model.vo;

public class Circle {
	// static final 동시에 있으면 반드시 명시적초기화 해야함. 생성자 초기화 불가능.
	private final static double PI = 3.14;
	private static int radius = 1;
	private int lotto[];

	public Circle() {
		this.radius = radius;
		this.lotto = lotto;
	}

	public void incrementRadius() {
		this.radius++;
	}

	public void getAreaOfCircle() {
		double areaOfCircle = this.PI * this.radius * this.radius;
		System.out.println("넓이 : " + areaOfCircle);
	}

	public void getSizeOfCircle() {
		double sizeOfCircle = 2 * this.PI * this.radius;
		System.out.println("둘레 : " + sizeOfCircle);
	}
}
