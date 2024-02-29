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

	public void practice15() {
		System.out.print("숫자: ");
		String numStr = sc.nextLine();
		int num = Integer.parseInt(numStr);
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		} else if (count == 1) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

	public void practice16() {
		while (true) {
			System.out.print("숫자: ");
			String numStr = sc.nextLine();
			int num = Integer.parseInt(numStr);
			int count = 0;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (num < 2) {
				System.out.println("잘못 입력하셨습니다.");
			} else if (count == 1) {
				System.out.println("소수입니다.");
				break;
			} else {
				System.out.println("소수가 아닙니다.");
				break;
			}
		}
	}

	public void practice17() {
		System.out.print("숫자: ");
		String numStr = sc.nextLine();
		int num = Integer.parseInt(numStr);
		int count = 0;
		int prime = 2;
		int numOfPrime = 0;
		while (prime < num + 1) {
			for (int i = 1; i < prime; i++) {
				if (prime % i == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(prime + " ");
				numOfPrime++;
			}
			count = 0;
			prime++;
		}
		System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개입니다.", num, numOfPrime);
	}

	public void practice18() {
		System.out.print("자연수 하나를 입력하세요: ");
		String numStr = sc.nextLine();
		int num = Integer.parseInt(numStr);
		int count = 0;
		for (int i = 1; i < num + 1; i++) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				System.out.print(i + " ");
			}
			if ((i % 2 == 0) && (i % 3 == 0)) {
				count++;
			}
		}
		System.out.println("\ncount: " + count);
	}

	public void practice19() {
		System.out.print("정수 입력: ");
		String integerStr = sc.nextLine();
		int integer = Integer.parseInt(integerStr);
		for (int i = 0; i < integer; i++) {
			for (int k = integer - 1; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = integer - i; j < integer + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice20() {
		System.out.print("정수 입력: ");
		String integerStr = sc.nextLine();
		int integer = Integer.parseInt(integerStr);
		for (int i = 0; i < integer; i++) {
			for (int j = integer - i; j < integer + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int m = 0; m < integer - 1; m++) {
			for (int n = m; n < integer - 1; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice21() {
		System.out.print("정수 입력: ");
		String integerStr = sc.nextLine();
		int integer = Integer.parseInt(integerStr);
		for (int i = 0; i < integer; i++) {
			for (int j = 0; j < integer - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice22() {
		System.out.print("정수 입력: ");
		String integerStr = sc.nextLine();
		int integer = Integer.parseInt(integerStr);
		for (int i = 0; i < integer; i++) {
			if ((i == 0) || (i == integer - 1)) {
				for (int j = 0; j < integer; j++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int k = 0; k < integer - 2; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}