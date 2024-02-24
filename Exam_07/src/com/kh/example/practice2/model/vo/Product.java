package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;

	public String getPName() {
		return pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Product() {
	}

	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}

	public void information() {
		Product p = new Product("아이폰", 1500000, "Apple");
		System.out.println("이름: " + p.getPName());
		System.out.println("가격: " + p.getPrice());
		System.out.println("브랜드: " + p.getBrand());
	}
}
