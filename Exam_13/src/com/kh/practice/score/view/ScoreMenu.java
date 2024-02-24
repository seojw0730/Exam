package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

//	메인 메뉴 출력
	public void mainMenu() {
		while (true) {
			boolean isExit = false;
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			String menuNum = sc.nextLine();

			switch (menuNum) {
			case "1":
				saveScore();
				break;
			case "2":
				readScore();
				break;
			case "9":
				isExit = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if (isExit) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

//	사용자에게 점수를 입력 받음
	public void saveScore() {
		int num = 0; // 학생 숫자
		while (true) {
			System.out.println("");
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("국어 점수: ");
			int kor = sc.nextInt();
			sc.nextLine();
			System.out.print("영어 점수: ");
			int eng = sc.nextInt();
			sc.nextLine();
			System.out.print("수학 점수: ");
			int math = sc.nextInt();
			sc.nextLine();
			int sum = kor + eng + math;
			double avg = (double) sum / 3;
			num++;
			scr.saveScore(name, kor, eng, math, sum, avg);
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요: ");
			String resume = sc.nextLine();
			if (resume.equals("N") || resume.equals("n"))
				break;
		}

	}

//	저장된 점수 출력
	public void readScore() {
		int count = 0; // 몇 명의 학생인지(반복문 횟수) 담을 변수
		int sumAll = 0;
		double avgAll = 0; // 모든 학생들의 합과 평균을 담을 변수
		
		
	}
}
