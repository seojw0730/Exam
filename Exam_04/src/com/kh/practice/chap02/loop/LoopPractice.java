package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			while (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				System.out.print("1이상의 숫자를 입력하세요 : ");
				num = sc.nextInt();
			}
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print((num - i + 1) + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice4() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print((num - i + 1) + " ");
			}
		} else {
			while (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				System.out.print("1이상의 숫자를 입력하세요 : ");
				num = sc.nextInt();
				if (num >= 1) {
					break;
				}
			}
			for (int i = 1; i <= num; i++) {
				System.out.print((num - i + 1) + " ");
			}
		}
	}

	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num - 1; i++) {
			sum += i;
			System.out.print(i + " + ");
		}
		System.out.print(num + " = " + (sum + num));
	}

	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if ((num1 < 1) || (num2 < 1)) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if (num1 <= num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else if (num1 >= num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println(num1);
		}
	}

	public void practice7() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		while ((num1 < 1) || (num2 < 1)) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
		}
		if (num1 <= num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else if (num1 >= num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println(num1);
		}
	}

	public void practice8() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.printf("===== %d단 =====\n", num);
		for (int i = 1; i <= 9; i++) {
			int result = i * num;
			System.out.printf("%d * %d = %d\n", num, i, result);
		}
	}

	public void practice9() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num <= 9) {
			for (int j = num; j <= 9; j++) {
				System.out.printf("===== %d단 =====\n", j);
				for (int i = 1; i <= 9; i++) {
					int result = i * num;
					System.out.printf("%d * %d = %d\n", j, i, result);
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num <= 9) {
			for (int j = num; j <= 9; j++) {
				System.out.printf("===== %d단 =====\n", j);
				for (int i = 1; i <= 9; i++) {
					int result = j * i;
					System.out.printf("%d * %d = %d\n", j, i, result);
				}
			}
		} else {
			while (num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				System.out.print("숫자 : ");
				num = sc.nextInt();
				if (num <= 9) {
					break;
				}
			}
			for (int j = num; j <= 9; j++) {
				System.out.printf("===== %d단 =====\n", j);
				for (int i = 1; i <= 9; i++) {
					int result = j * i;
					System.out.printf("%d * %d = %d\n", j, i, result);
				}
			}
		}
	}

	public void practice11() {
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int diff = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", start + diff * i);
		}
	}

	public void practice12() {
		System.out.print("연산자(+, -, *, /, %) : ");
		String operator = sc.nextLine();
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		int result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("없는 연산자입니다. 다시 입력해주세요.");
		}
		System.out.printf("%d %s %d = %d", num1, operator, num2, result);
	}

	public void practice13() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice14() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}