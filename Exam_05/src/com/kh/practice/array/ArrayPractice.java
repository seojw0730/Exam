package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int arr1[] = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.print(arr1[i] + " ");
		}
	}

	public void practice2() {
		int arr2[] = new int[10];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 10 - i;
			System.out.print(arr2[i] + " ");
		}
	}

	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int arr3[] = new int[num];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = i + 1;
			System.out.print(arr3[i] + " ");
		}
	}

	public void practice4() {
		String arr4[] = new String[] { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(arr4[1]);
	}

	public void practice5() {
		System.out.print("문자열 : ");
		String word = sc.nextLine();
		char arr5[] = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			arr5[i] = word.charAt(i);
		}
		System.out.print("문자 : ");
		String alphabet = sc.nextLine();
		int findIndex = word.indexOf(alphabet);
		System.out.print(word + "에 " + alphabet + "가 존재하는 위치(인덱스) : ");
		int count = 0;
		while (findIndex >= 0) {
			System.out.print(findIndex + " ");
			findIndex = word.indexOf(alphabet, findIndex + 1);
			count++;
		}
		System.out.println();
		System.out.println(alphabet + " 개수 : " + count);
	}

	public void practice6() {
		String arr6[] = new String[] { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		if ((num >= 0) && (num <= 6)) {
			System.out.println(arr6[num]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice7() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int arr7[] = new int[num];
		int sum = 0;
		for (int i = 0; i < arr7.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr7[i] = sc.nextInt();
			sum += arr7[i];
		}
		for (int j = 0; j < arr7.length; j++) {
			System.out.print(arr7[j] + " ");
		}
		System.out.println();
		System.out.println("총  합 : " + sum);
	}

	public void practice8() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if ((num >= 3) && (num % 2 != 0)) {
			for (int i = 0; i < (num / 2 + 1); i++) {
				System.out.print((i + 1) + ", ");
			}
			for (int i = 0; i < (num / 2 - 1); i++) {
				System.out.print((num / 2 - i) + ", ");
			}
			System.out.print(1);
		} else {
		}
	}
}
