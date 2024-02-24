package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void method1() {
		System.out.print("문자 : ");
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		System.out.printf("%s unicode : %s", first, first);
	}
}
