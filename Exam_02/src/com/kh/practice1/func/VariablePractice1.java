package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void method1() {
		System.out.println("변수 실습문제 1 시작합니다.");
		System.out.println("이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 " + "담고 출력하세요.");

		System.out.print("이름을 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.print("성별을 입력해주세요(남/여) : ");
		String gender = sc.nextLine();

		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();

		System.out.print("키를 입력해주세요. 숫자(실수)만 입력해주세요.(cm) : ");
		double height = sc.nextDouble();

//		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 "
//				+ name + "님 반갑습니다 ^^");
		System.out.printf("키 \"%.2fcm\"인 %d살 %s자 %s님 반갑습니다 ^^\n", height, age, gender, name);

		System.out.println("변수 실습문제 1 마칩니다. 결과 확인하세요.");
	}

}
