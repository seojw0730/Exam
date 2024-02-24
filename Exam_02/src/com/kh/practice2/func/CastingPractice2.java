package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.printf("국어 : ");
		double 국어 = sc.nextDouble();
		System.out.printf("영어 : ");
		double 영어 = sc.nextDouble();
		System.out.printf("수학 : ");
		double 수학 = sc.nextDouble();

		int 총점 = (int) (국어 + 영어 + 수학);
		int 평균 = (int) (총점 / 3);

		System.out.printf("총점 : %d\n", 총점);
		System.out.printf("평균 : %d", 평균);
	}
}
