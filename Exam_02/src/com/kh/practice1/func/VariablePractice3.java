package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void method3() {
		System.out.println("변수 실습문제 3 시작합니다.");
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 : ");
		double length = sc.nextDouble();

		System.out.print("세로 : ");
		double height = sc.nextDouble();

		System.out.println("면적 : " + length * height);
		System.out.println("둘레 : " + 2 * (length + height));

		System.out.println("변수 실습문제 3 마칩니다. 결과 확인하세요.");
	}
}
