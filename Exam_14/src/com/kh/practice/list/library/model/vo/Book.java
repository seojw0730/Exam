package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book implements Comparable<Book> {
	private String title, author, category;
	private int price;

//	기본 생성자
	public Book() {

	}

//	매개변수가 있는 생성자
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

//	객체의 정보를 리턴하는 메소드
	@Override
	public String toString() {
		return "\t" + "(" + title + "/" + author + "/" + category + "/" + price + ")";
	}

//	해시코트를 리턴하는 메소드
	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}

//	객체가 같은지 여부를 리턴하는 메소드
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		Book other = (Book) obj;
		if (!title.equals(other.title))
			return true;
		return false;
	}

//	정렬 기준을 가지고 있는 메소드
	@Override
	public int compareTo(Book o) {
		int result = this.title.compareTo(o.getTitle());
		return result;
	}
}
