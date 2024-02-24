package com.kh.employee.view;

import java.util.Scanner;

import com.kh.employee.controller.EmployeeController;
import com.kh.employee.model.vo.Employee;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	public EmployeeMenu() {
		while (true) {
			boolean isExitMenu = false;
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			String num = sc.nextLine();
			switch (num) {
			case "1":
				insertEmp();
				break;
			case "2":
				updateEmp();
				break;
			case "3":
				deleteEmp();
				break;
			case "4":
				printEmp();
				break;
			case "9":
				isExitMenu = true;
				break;
			default:
				System.out.println("번호 잘못 입력");
			}
			if (isExitMenu) {
				System.out.println("종료");
				break;
			}
		}
	}

	public void insertEmp() {
		System.out.print("사원 번호 : ");
		String empNo = sc.nextLine();
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 성별 : ");
		String gender = sc.nextLine();
		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		String add = sc.nextLine();
		if ((add.equals("y")) || (add.equals("Y"))) {
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			System.out.print("사원 연봉 : ");
			String salary = sc.nextLine();
			System.out.print("보너스 율 : ");
			String bonus = sc.nextLine();
			ec.add(Integer.parseInt(empNo), name, gender.charAt(0), phone, dept, Integer.parseInt(salary),
					Double.parseDouble(bonus));
		} else{
			ec.add(Integer.parseInt(empNo), name, gender.charAt(0), phone);
		}
	}

	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		String menuNum = sc.nextLine();
		switch (menuNum) {
		case "1":
			System.out.print("수정할 전화번호 : ");
			String modPhone = sc.nextLine();
			ec.modify(modPhone);
			break;
		case "2":
			System.out.print("수정할 사원연봉 : ");
			String modSalary = sc.nextLine();
			ec.modify(Integer.parseInt(modSalary));
			break;
		case "3":
			System.out.print("수정할 보너스율 : ");
			String modBonus = sc.nextLine();
			ec.modify(Double.parseDouble(modBonus));
			break;
		case "9":
			break;
		default:
			System.out.println("번호 잘못 입력");
		}
	}

	public void deleteEmp() {
		System.out.print("정말 삭제? : ");
		String del = sc.nextLine();
		if ((del.equals("Y")) || (del.equals("y"))) {
			ec.remove();
			if (ec.inform() == null) {
				System.out.println("삭제 성공");
			}
		}
	}

	public void printEmp() {
		if (ec.inform() == null) {
			System.out.println("사원 데이터가 없습니다.");
		} else {
			System.out.println(ec.inform());
		}
	}

}
