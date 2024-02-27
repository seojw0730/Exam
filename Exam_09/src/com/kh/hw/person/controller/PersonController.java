package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

//	각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
	public int[] PersonCount() {
		int lastStudent = 0;
		int lastEmployee = 0;
		int[] result = new int[2];

		if (s[0] != null) {
			for (int i = 1; i < s.length; i++) {
				if (s[i] == null) {
					lastStudent = i;
					break;
				} else {
					lastStudent = 3;
				}
			}
		}

		if (e[0] != null) {
			for (int i = 1; i < e.length; i++) {
				if (e[i] == null) {
					lastEmployee = i;
					break;
				} else {
					lastEmployee = 10;
				}
			}
		}

		result[0] = lastStudent;
		result[1] = lastEmployee;
		return result;
	}

//	매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메소드
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		Student insertStudent = new Student(name, age, height, weight, grade, major);
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = insertStudent;
				break;
			}
		}
	}

//	학생 객체 배열의 주소를 반환하는 메소드
	public Student[] printStudent() {
		return s;
	}

//	매개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장되는 메소드
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		Employee insertEmployee = new Employee(name, age, height, weight, salary, dept);
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				e[i] = insertEmployee;
				break;
			}
		}
	}

//	사원 객체 배열의 주소를 반환하는 매소드
	public Employee[] printEmployee() {
		return e;
	}
}
