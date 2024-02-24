package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void method4() {
		System.out.println("변수 실습문제 4 시작합니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.next();
		System.out.printf("첫 번째 문자 : %c\n", word.charAt(0));
		System.out.printf("두 번째 문자 : %c\n", word.charAt(1));
		System.out.printf("세 번째 문자 : %c\n", word.charAt(2));
		System.out.println("변수 실습문제 4 마칩니다. 결과 확인하세요.");
	}
}
