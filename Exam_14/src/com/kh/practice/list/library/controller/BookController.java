package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> list = new ArrayList<>();

//	초기 값을 넣어줄 기본 생성자
	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암 정복기", "박신우", "의료", 21000));
	}

//	리스트에 값 저장 메소드
	public void insertBook(Book bk) {
		list.add(bk);
	}

//	모든 리스트를 출력하는 메소드
	public ArrayList selectList() {
		return (ArrayList<Book>) list;
	}

//	키워드로 책을 검색하는 메소드
	public ArrayList searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		for (Book b : list) {
			if (b.getTitle().contains(keyword)) {
				searchList.add(b);
			}
		}
		return searchList;
	}

//	책 제목과 저자 명으로 책을 삭제하는 메소드
	public Book deleteBook(String title, String author) {
		Book removeBook = new Book();
		removeBook = null;
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getTitle().equals(title)) && (list.get(i).getAuthor().equals(author))) {
				removeBook = list.get(i);
				list.remove(i);
				break;
			}
		}
		return removeBook;
	}

//	책 명 오름차순 정렬하는 메소드
	public int ascBook() {
		Collections.sort(list);
		return 1;
	}
}
