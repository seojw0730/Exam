package com.kh.practice.set.view;

import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();

	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");
		while (true) {
			boolean exit = false;
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택: ");
			String menu = sc.nextLine();
			switch(menu) {
			case "1": insertObject(); break;
			case "2": deleteObject(); break;
			case "3": winObject(); break;
			case "4": sortedWinObject(); break;
			case "5": searchWinner(); break;
			case "9": exit = true; break;
			default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
			if(exit) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	public void insertObject() {
	}

	public void deleteObject() {
	}

	public void winObject() {
	}

	public void sortedWinObject() {
	}

	public void searchWinner() {
	}

}
