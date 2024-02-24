package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {

		while (true) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝");
			System.out.print("번호 : ");
			String menuNum = sc.nextLine();
			boolean exit = false;
			switch (menuNum) {
			case "1":
				circleMenu();
				continue;
			case "2":
				rectangleMenu();
				continue;
			case "9":
				exit = true;
				break;
			default:
				System.out.println("다시 누르세요");
			}
			if (exit)
				System.out.println("종료");
			break;
		}
	}

	public void circleMenu() {
		while (true) {
			System.out.println("=== 원 메뉴 ===");
			System.out.println("1. 둘레");
			System.out.println("2. 넓이");
			System.out.println("9. 메인");
			System.out.print("번호 : ");
			String menuNum = sc.nextLine();

			switch (menuNum) {
			case "1":
				calcCircum();
				break;
			case "2":
				calcCircleArea();
				break;
			case "9":
				System.out.println("메인");
				break;
			default:
				System.out.println("다시");
			}
			break;
		}
	}

	public void rectangleMenu() {
		while (true) {
			boolean exit = false;
			System.out.println("=== 사각형 메뉴 ===");
			System.out.println("1. 둘레");
			System.out.println("2. 넓이");
			System.out.println("9. 메인");
			System.out.print("번호 : ");
			String menuNum = sc.nextLine();

			switch (menuNum) {
			case "1":
				calcPerimeter();
				exit = true;
				break;
			case "2":
				calcRectArea();
				exit = true;
				break;
			case "9":
				System.out.println("메인");
				exit = true;
				break;
			default:
				System.out.println("다시");
				break;
			}
			if (exit) {
				break;
			}
		}
	}

	public void calcCircum() {
		System.out.print("x : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("y : ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.print("r : ");
		int r = sc.nextInt();
		sc.nextLine();
		System.out.println(cc.calcCircum(x, y, r));
	}

	public void calcCircleArea() {
		System.out.print("x : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("y : ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.print("r : ");
		int r = sc.nextInt();
		sc.nextLine();
		System.out.println(cc.calcArea(x, y, r));
	}

	public void calcPerimeter() {
		System.out.print("x : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("y : ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		sc.nextLine();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		sc.nextLine();
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}

	public void calcRectArea() {
		System.out.print("x : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("y : ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		sc.nextLine();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		sc.nextLine();
		System.out.println(rc.calcArea(x, y, height, width));
	}
}
