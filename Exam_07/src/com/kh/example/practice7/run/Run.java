package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee jw = new Employee();
		jw.setAge(100);
		System.out.println(jw.getAge());
	}
}
