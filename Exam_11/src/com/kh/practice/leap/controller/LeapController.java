package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		boolean result = false;
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public long LeapDate(Calendar c) {
		return 0;
	}

}
