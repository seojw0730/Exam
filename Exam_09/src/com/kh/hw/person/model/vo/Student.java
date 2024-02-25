package com.kh.hw.person.model.vo;

public class Student extends Person {
	private int grade;
	private String major;

//	기본 생성자
	public Student() {
	}

//	매개변수 생성자
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}

//	각 필드 반환 메소드
	@Override
	public String toString() {
		return super.toString() + ", " + grade + ", " + major;
	}

	// 필드 값을 반환하고 대입하는 메소드
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
