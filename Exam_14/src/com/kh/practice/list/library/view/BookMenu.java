package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private BookController bc = new BookController();
	private Scanner sc = new Scanner(System.in);

//	사용자가 직접 메인 메뉴를 선택 할 수 있음. 종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동.
	public void mainMenu() {
		System.out.println("===== Welcome KH Library =====");
		while (true) {
			boolean exit = false;
			System.out.println();
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			String menuNum = sc.nextLine();

			switch (menuNum) {
			case "1":
				insertBook();
				break;
			case "2":
				selectList();
				break;
			case "3":
				searchBook();
				break;
			case "4":
				deleteBook();
				break;
			case "5":
				ascBook();
				break;
			case "9":
				System.out.println("프로그램을 종료합니다.");
				exit = true;
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				break;
			}
			if (exit) {
				System.out.println("종료");
				break;
			}
		}
	}

//	도서 추가를 위해 정보를 받는 메소드
	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서명: ");
		String bookName = sc.nextLine();
		System.out.print("저자명: ");
		String authorName = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타): ");
		int genre = sc.nextInt();
		sc.nextLine();
		System.out.print("가격: ");
		int price = sc.nextInt();
		sc.nextLine();
		Book bk = new Book();
		switch (genre) {
		case 1:
			bk = new Book(bookName, authorName, "인문", price);
			break;
		case 2:
			bk = new Book(bookName, authorName, "과학", price);
			break;
		case 3:
			bk = new Book(bookName, authorName, "외국어", price);
			break;
		case 4:
			bk = new Book(bookName, authorName, "기타", price);
			break;
		}
		bc.insertBook(bk);
	}

//	전체 도서 목록 출력 성공을 알리는 메소드
	public void selectList() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		System.out.println("=== 도서 전체 조회 ===");
		bookList = bc.selectList();
		if (bookList == null) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (Book b : bookList) {
				System.out.println(b);
			}
		}
	}

//	특정 도서 검색 결과를 보여주는 메소드
	public void searchBook() {
		System.out.println("=== 도서 검색 ===");
		System.out.print("검색 키워드: ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = new ArrayList<Book>();
		searchList = bc.searchBook(keyword);
		if (searchList == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Book b : searchList) {
				System.out.println(b);
			}
		}
	}

//	특정 도서 삭제 성공을 알리는 메소드
	public void deleteBook() {
		System.out.print("삭제할 도서명: ");
		String delTitle = sc.nextLine();
		System.out.print("삭제할 저자명: ");
		String delAuthor = sc.nextLine();

		Book remove = bc.deleteBook(delTitle, delAuthor);

		if (remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}

//	책 명 오름차순 정렬 성공을 알리는 메소드
	public void ascBook() {
		bc.ascBook();
		if (bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
