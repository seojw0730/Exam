package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

//	메인 메뉴를 출력하는 메소드
	public void mainMenu() {
		while (true) {
			boolean exit = false;
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.PersonCount()[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.PersonCount()[1] + "명입니다.");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				studentMenu();
				break;
			case "2":
				employeeMenu();
				break;
			case "9":
				exit = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			if (exit) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}

//	학생 메뉴를 출력하는 메소드
	public void studentMenu() {
		while (true) {
			if (pc.PersonCount()[0] == 3) {
				boolean exit = false;
				System.out.println("1. 학생 추가");
				System.out.println("2. 학생 보기");
				System.out.println("9. 메인으로");
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				System.out.print("메뉴 번호: ");
				String menu = sc.nextLine();
				switch (menu) {
				case "1":
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				case "2":
					printStudent();
					break;
				case "9":
					exit = true;
					System.out.println("메인으로 돌아갑니다.");
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
				if (exit) {
					break;
				}
			} else {
				while (true) {
					boolean exit = false;
					System.out.println("1. 학생 추가");
					System.out.println("2. 학생 보기");
					System.out.println("9. 메인으로");
					System.out.print("메뉴 번호: ");
					String menu = sc.nextLine();
					switch (menu) {
					case "1":
						insertStudent();
						break;
					case "2":
						printStudent();
						break;
					case "9":
						exit = true;
						System.out.println("메인으로 돌아갑니다.");
						break;
					default:
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						break;
					}
					if (exit) {
						break;
					}
				}
			}
		}
	}

//	사원 메뉴를 출력하는 메소드
	public void employeeMenu() {
		while (true) {
			if (pc.PersonCount()[1] == 10) {
				boolean exit = false;
				System.out.println("1. 사원 추가");
				System.out.println("2. 사원 보기");
				System.out.println("9. 메인으로");
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				System.out.print("메뉴 번호: ");
				String menu = sc.nextLine();
				switch (menu) {
				case "2":
					printStudent();
					break;
				case "9":
					exit = true;
					System.out.println("메인으로 돌아갑니다.");
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
				if (exit) {
					break;
				}
			} else {
				while (true) {
					boolean exit = false;
					System.out.println("1. 사원 추가");
					System.out.println("2. 사원 보기");
					System.out.println("9. 메인으로");
					System.out.print("메뉴 번호: ");
					String menu = sc.nextLine();
					switch (menu) {
					case "1":
						insertStudent();
						break;
					case "2":
						printStudent();
						break;
					case "9":
						exit = true;
						System.out.println("메인으로 돌아갑니다.");
						break;
					default:
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						break;
					}
					if (exit) {
						break;
					}
				}
			}
		}
	}

//	사용자에게 객체배열에 저장할 학생 데이터를 받는 메소드
	public void insertStudent() {
		while (true) {
			boolean exit = false;
			System.out.print("학생 이름: ");
			String name = sc.nextLine();
			System.out.print("학생 나이: ");
			String ageStr = sc.nextLine();
			int age = Integer.parseInt(ageStr);
			System.out.print("학생 키: ");
			String heightStr = sc.nextLine();
			double height = Double.parseDouble(heightStr);
			System.out.print("학생 몸무게: ");
			String weightStr = sc.nextLine();
			double weight = Double.parseDouble(weightStr);
			System.out.print("학생 학년: ");
			String gradeStr = sc.nextLine();
			int grade = Integer.parseInt(gradeStr);
			System.out.print("학생 전공: ");
			String major = sc.nextLine();
			pc.insertStudent(name, age, height, weight, grade, major);

			if (pc.printStudent()[2] != null) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				break;
			}

			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요: ");
			String resume = sc.nextLine();
			switch (resume) {
			case "N":
			case "n":
				exit = true;
				break;
			default:
				break;
			}
			if (exit) {
				break;
			}
		}
	}

//	객체배열에 저장된 학생 데이터를 출력하는 메소드
	public void printStudent() {
		for (int i = 0; i < pc.printStudent().length; i++) {
			System.out.println(pc.printStudent()[i]);
		}
	}

//	사용자에게 객체배열에 저장할 사원 데이터를 받는 메소드
	public void insertEmployee() {
		while (true) {
			boolean exit = false;
			System.out.print("사원 이름: ");
			String name = sc.nextLine();
			System.out.print("사원 나이: ");
			String ageStr = sc.nextLine();
			int age = Integer.parseInt(ageStr);
			System.out.print("사원 키: ");
			String heightStr = sc.nextLine();
			double height = Double.parseDouble(heightStr);
			System.out.print("사원 몸무게: ");
			String weightStr = sc.nextLine();
			double weight = Double.parseDouble(weightStr);
			System.out.print("사원 급여: ");
			String salaryStr = sc.nextLine();
			int salary = Integer.parseInt(salaryStr);
			System.out.print("사원 부서: ");
			String dept = sc.nextLine();
			pc.insertEmployee(name, age, height, weight, salary, dept);

			if (pc.printStudent()[9] != null) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				break;
			}

			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요: ");
			String resume = sc.nextLine();
			switch (resume) {
			case "N":
			case "n":
				exit = true;
				break;
			default:
				break;
			}
			if (exit) {
				break;
			}
		}
	}

//	객체배열에 저장된 사원 데이터를 출력하는 메소드
	public void printEmployee() {
		for (int i = 0; i < pc.printEmployee().length; i++) {
			System.out.println(pc.printEmployee()[i]);
		}
	}
}
