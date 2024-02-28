package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		String[] main = new PhoneController().method();
		for (String s : main) {
			System.out.println(s);
			System.out.println();
		}
	}
}
