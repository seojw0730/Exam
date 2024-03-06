package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		new Book().inform();
		new Book("제목", "출판사", "저자").inform();
		new Book("1", "2", "3", 4, 5.5).inform();
	}
}
