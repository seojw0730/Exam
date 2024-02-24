package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void method2() {
		System.out.println("변수 실습문제 2 시작합니다.");

		System.out.print("첫 번째 정수 : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		System.lineSeparator();

		int 더하기 = num1 + num2;
		System.out.println("더하기 결과 : " + 더하기);

		int 빼기 = num1 - num2;
		System.out.println("빼기 결과 : " + 빼기);

		int 곱하기 = num1 * num2;
		System.out.println("곱하기 결과 : " + 곱하기);

		int 몫 = num1 / num2;
		System.out.println("나누기 몫 결과 : " + 몫);

		System.out.println("변수 실습문제 2 마칩니다. 결과 확인하세요.");
	}

}