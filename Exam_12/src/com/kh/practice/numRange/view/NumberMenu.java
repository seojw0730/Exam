package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);

	public void menu() {
		System.out.print("정수1: ");
		String num1Str = sc.nextLine();
		int num1 = Integer.parseInt(num1Str);
		System.out.print("정수2: ");
		String num2Str = sc.nextLine();
		int num2 = Integer.parseInt(num2Str);
		boolean result;
		try {
			result = new NumberController().checkDouble(num1, num2);
			System.out.print(num1 + "은(는) " + num2 + "의 배수인가? " + result);
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
	}
}
