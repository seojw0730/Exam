package com.kh.practice.chap01_poly.view;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

//	메인 메뉴 출력 메소드
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		String gender1 = sc.nextLine();
		char gender = gender1.charAt(0);
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);

		while (true) {
			boolean exit = false;
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			String menuNum = sc.nextLine();

			switch (menuNum) {
			case "1":
				System.out.println(lc.myInfo());
				break;
			case "2":
				selectAll();
				break;
			case "3":
				searchBook();
				break;
			case "4":
				rentBook();
				break;
			case "9":
				exit = true;
				break;
			default:
				System.out.println("다시");
				break;
			}
			if (exit) {
				System.out.println("종료");
				break;
			}
		}
	}

//	도서 전체 목록 출력 메소드
	public void selectAll() {
//		Book[] bList = new Book[5];
		Book[] bList = lc.selectAll();
		for (int i = 0; i < bList.length; i++) {
			// TODO
			System.out.println(i + "번도서 : " + bList[i]);
		}
	}

//	검색할 제목 키워드를 입력 받아 검색 결과를 출력하는 메소드
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String search = sc.nextLine();
		Book[] searchBooks = lc.searchBook(search);
		for (Book book : searchBooks) {
			if (book != null)
				System.out.println(book);
		}
	}

//	대여할 도서 인덱스를 입력 받아 LibraryController의 rentBook 메소드로 전달
//	→ 결과 값을 result로 받아 result가 0일 경우, 1일 경우, 2일 경우 각각에
//	해당하는 출력문 출력
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int rentNum = sc.nextInt();
		sc.nextLine();
		int result = lc.rentBook(rentNum);
		switch (result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
			break;
		}
	}
}
