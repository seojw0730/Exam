package com.kh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	public Student() {

	}

	public Student(int classroom, String name, double height, char gender) {
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void information() {
		Student s = new Student(11, "이름", 200, 'M');
		System.out.println("반: " + s.getClassroom());
		System.out.println("이름: " + s.getName());
		System.out.println("키: " + s.getHeight());
		System.out.println("성별: " + s.getGender());
	}

}
