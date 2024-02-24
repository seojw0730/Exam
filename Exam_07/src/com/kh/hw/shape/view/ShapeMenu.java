package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		// TODO
		int faultInputCount = 0;
		while (true) { // break 반드시 있어야함
			boolean isExitMenu = false;
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			String menuNum = sc.nextLine();
			switch (menuNum) {
			case "3":
				faultInputCount = 0;
				triangleMenu();
				break;
			case "4":
				faultInputCount = 0;
				squareMenu();
				break;
			case "9":
				faultInputCount = 0;
				isExitMenu = true;
				break;
			default:
				faultInputCount++;
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				if (faultInputCount > 5) {
					System.out.println("매뉴얼 다시 숙지하고 실행해 주세요.");
					isExitMenu = true;
//					if (isExitMenu) {
//						break;
//					}
				}
			}
			if (isExitMenu) {
				System.out.println("종료");
				break;
			}
		}
	}

	public void triangleMenu() {
		// TODO
		while (true) {
			boolean isExitMenu = false;
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			String menuNum = sc.nextLine();
			switch (menuNum) {
			case "1":
			case "2":
				inputSize(3, Integer.parseInt(menuNum));
				break;
			case "3":
				printInformation(3);
				break;
			case "9":
				// 안됨! inputMenu();
				isExitMenu = true;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				break;
			}
			if (isExitMenu) {
				System.out.println("메인으로");
				break; // 반복문 while 끝냄
			}
		} // while
	}

	public void squareMenu() {
		// TODO
		while (true) {
			boolean isExitMenu = false;
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			String menuNum = sc.nextLine();
			switch (menuNum) {
			case "1":
				// String str = String.valueOf(0.3);
			case "2":
			case "3":
				inputSize(4, Integer.parseInt(menuNum));
				break;
			case "4":
				printInformation(4);
				break;
			case "9":
				// 안됨! inputMenu();
				isExitMenu = true;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				break;
			}
			if (isExitMenu) {
				System.out.println("메인으로");
				break; // 반복문 while 끝냄
			}
		} // while
	}

	public void inputSize(int type, int menuNum) {
		// TODO
		String typeStr = "";
		if (type == 3) {
			typeStr = "삼각형";
		} else if (type == 4) {
			typeStr = "사각형";
		}
		if ((type == 3 && menuNum == 2) || (type == 4 && menuNum == 3)) {
			System.out.print("색깔을 입력하세요 : ");
			String colorStr = sc.nextLine();
			if (type == 3) {
				tc.paintColor(colorStr);
			} else if (type == 4) {
				scr.paintColor(colorStr);
			}

			System.out.println("색이 수정되었습니다.");
		} else {
			System.out.print("높이 : ");
			String heightStr = sc.nextLine();
			System.out.print("너비 : ");
			String widthStr = sc.nextLine();

			double height = Double.parseDouble(heightStr);
			double width = Double.parseDouble(widthStr);
			if (type == 4 && menuNum == 1) {
				System.out.println(typeStr + " 둘레 : " + scr.calcPerimeter(height, width));
			} else if (type == 4 && menuNum == 2) {
				System.out.println(typeStr + " 면적 : " + scr.calcArea(height, width));
			} else if (type == 3 && menuNum == 1) {
				System.out.println(typeStr + " 면적 : " + tc.calcArea(height, width));
			}
		}

//		if (type == 3) {
//			if (menuNum == 1) {
//			} else if (menuNum == 2) {
//			}
//		} else if (type == 4) {
//			if (menuNum == 1) {
//			} else if (menuNum == 2) {
//			} else if (menuNum == 3) {
//				System.out.print("색깔을 입력하세요 : ");
//			}
//		}
	}

	public void printInformation(int type) {
		// TODO
		if (type == 3) {
			System.out.println(tc.print());
		} else if (type == 4) {
			System.out.println(scr.print());
		}
	}
}
