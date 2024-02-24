package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.func.VariablePractice1;
import com.kh.practice1.func.VariablePractice2;
import com.kh.practice1.func.VariablePractice3;
import com.kh.practice1.func.VariablePractice4;

public class Run {
	public static void main(String[] args) {
		System.out.println("변수 실습문제를 풀어보겠습니다.");
		System.out.print("번호를 입력하세요 : ");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		switch (number) {
		case 1:
			System.out.println("1. 문제");
			VariablePractice1 v1 = new VariablePractice1();
			v1.method1();
			break;
		case 2:
			System.out.println("2. 문제");
			VariablePractice2 v2 = new VariablePractice2();
			v2.method2();
			break;
		case 3:
			System.out.println("3. 문제");
			VariablePractice3 v3 = new VariablePractice3();
			v3.method3();
			break;
		case 4:
			System.out.println("4. 문제");
			VariablePractice4 v4 = new VariablePractice4();
			v4.method4();
			break;
		}
	}
}