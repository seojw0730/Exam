package com.kh.hw.person.model.vo;

public class Employee extends Person {
	private int salary;
	private String dept;

//	기본 생성자
	public Employee() {
	}

//	매개변수 생성자
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}

//	각 필드 반환 메소드
	@Override
	public String toString() {
		return super.toString() + ", " + salary + ", " + dept;
	}

//	필드 값을 반환하고 대입하는 메소드
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
