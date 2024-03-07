package com.kh.practice.leap.run;

import java.util.Calendar;

import com.kh.practice.leap.view.LeapView;

public class Run {
	public static void main(String[] args) {
		Calendar a = Calendar.getInstance();
		a.set(a.YEAR, a.MONTH, a.DATE);
		Calendar b = Calendar.getInstance();
		b.set(1, 1, 1);
		System.out.println(a.getTime().getYear());
		
	}
}
