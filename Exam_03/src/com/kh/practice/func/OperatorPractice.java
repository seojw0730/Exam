package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("정수 : ");
		int 정수 = sc.nextInt();
		if (정수 > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}
	}

	public void practice2() {
		System.out.print("정수 : ");
		int 정수 = sc.nextInt();
		if (정수 > 0) {
			System.out.println("양수다");
		} else if (정수 == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}
	}

	public void practice3() {
		System.out.print("정수 : ");
		int 정수 = sc.nextInt();
		if (정수 % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}

	public void practice4() {
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + candy / people);
		System.out.println("남는 사탕 개수 : " + candy % people);
	}

	public void practice5() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classNumber = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		System.out.print("성별(M/F) : ");
		String gender = sc.next();
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		if (gender == "M") {
			System.out.printf("%d학년 %d반 %d번 남학생 %s의 성적은 %.2f이다.", grade, classNumber, number, name, score);
		} else {
			System.out.printf("%d학년 %d반 %d번 여학생 %s의 성적은 %.2f이다.", grade, classNumber, number, name, score);
		}
	}

	public void practice6() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println();
		if (age <= 13) {
			System.out.println("어린이");
		} else if (age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
	}

	public void practice7() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		int sum = kor + eng + math;
		double average = sum / 3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		if ((kor >= 40) & (eng >= 40) & (math >= 40) & (average >= 60)) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

	public void practice8() {
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String personalNumber = sc.next();
		System.out.println();
		if ((personalNumber.charAt(7) == 1) | (personalNumber.charAt(7) == 3)) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}

	public void practice9() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int input = sc.nextInt();
		System.out.println();
		if ((input <= num1) | (input > num2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public void practice10() {
		System.out.print("입력1 : ");
		int input1 = sc.nextInt();
		System.out.print("입력2 : ");
		int input2 = sc.nextInt();
		System.out.print("입력3 : ");
		int input3 = sc.nextInt();
		System.out.println();
		if ((input1 == input2) & (input2 == input3)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public void practice11() {
		System.out.print("A사원의 연봉 : ");
		int moneyA = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int moneyB = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int moneyC = sc.nextInt();

		double incentiveA = moneyA * (1 + 0.4);
		double incentiveB = moneyB;
		double incentiveC = moneyC * (1 + 0.15);

		if (incentiveA >= 3000) {
			System.out.println("A사원 연봉/연봉+a : " + moneyA + "/" + incentiveA);
			System.out.println("3000 이상");
		} else {
			System.out.println("A사원 연봉/연봉+a : " + moneyA + "/" + incentiveA);
			System.out.println("3000 미만");
		}
		if (incentiveB >= 3000) {
			System.out.println("B사원 연봉/연봉+a : " + moneyB + "/" + incentiveB);
			System.out.println("3000 이상");
		} else {
			System.out.println("B사원 연봉/연봉+a : " + moneyB + "/" + incentiveB);
			System.out.println("3000 미만");
		}
		if (incentiveC >= 3000) {
			System.out.println("C사원 연봉/연봉+a : " + moneyC + "/" + incentiveC);
			System.out.println("3000 이상");
		} else {
			System.out.println("C사원 연봉/연봉+a : " + moneyC + "/" + incentiveC);
			System.out.println("3000 미만");
		}

	}
}
