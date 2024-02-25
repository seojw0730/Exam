package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		String[][] arr1 = { { "(0, 0)", "(0, 1)", "(0, 2)" }, { "(1, 0)", "(1, 1)", "(1, 2)" },
				{ "(2, 0)", "(2, 1)", "(2, 2)" } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] arr2 = new int[4][4];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				arr2[i][j] = 4 * i + j + 1;
				System.out.printf("%d\t", arr2[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
		int[][] arr3 = new int[4][4];
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				arr3[i][j] = 4 * (4 - i) - j;
				System.out.printf("%d\t", arr3[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr4 = new int[4][4];
		arr4[0][0] = 6;
		arr4[0][1] = 6;
		arr4[0][2] = 1;

		arr4[1][0] = 4;
		arr4[1][1] = 10;
		arr4[1][2] = 8;

		arr4[2][0] = 8;
		arr4[2][1] = 6;
		arr4[2][2] = 5;

		int sum03 = 0;
		int sum13 = 0;
		int sum23 = 0;
		int sum30 = 0;
		int sum31 = 0;
		int sum32 = 0;
		int sum33 = 0;
		for (int i = 0; i < arr4.length - 1; i++) {
			sum03 += arr4[0][i];
			arr4[0][3] = sum03;

			sum13 += arr4[1][i];
			arr4[1][3] = sum13;

			sum23 += arr4[2][i];
			arr4[2][3] = sum23;

			sum30 += arr4[i][0];
			arr4[3][0] = sum30;

			sum31 += arr4[i][1];
			arr4[3][1] = sum31;

			sum32 += arr4[i][2];
			arr4[3][2] = sum32;

			for (int j = 0; j < arr4[0].length - 1; j++) {
				sum33 += (2 * arr4[i][j]);
			}
			arr4[3][3] = sum33;
		}
		for (int m = 0; m < arr4.length; m++) {
			for (int n = 0; n < arr4[0].length; n++) {
				System.out.printf("%d\t", arr4[m][n]);
			}
			System.out.println();
		}
	}

	public void practice5() {
		Random rd = new Random();
		do {
			System.out.print("행 크기 : ");
			String row = sc.nextLine();
			int iRow = Integer.parseInt(row);

			if ((iRow < 1) || (iRow > 10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}

			System.out.print("열 크기 : ");
			String col = sc.nextLine();
			int iCol = Integer.parseInt(col);

			if ((iCol < 1) || (iCol > 10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			int[][] arr5 = new int[iRow][iCol];

			for (int m = 0; m < arr5.length; m++) {
				for (int n = 0; n < arr5[0].length; n++) {
					arr5[m][n] = rd.nextInt(26) + 65;
					int num = arr5[m][n];
					System.out.print((char) num + " ");
				}
				System.out.println();
			}
			break;
		} while (true);
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int n = 0; n < strArr[0].length; n++) {
			for (int m = 0; m < strArr.length; m++) {
				System.out.print(strArr[m][n] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		sc.nextLine();
		int m = 0;
		int n = 0;
		int value = 97;
		char[][] arr7 = new char[row][];
		for (int i = 0; i < row; i++) {
			System.out.printf("%d행의 열 크기 : ", i);
			int col = sc.nextInt();
			sc.nextLine();
			arr7[i] = new char[col];
			for (int j = 0; j < col; j++) {
				arr7[i][j] = (char) value;
				value++;
			}
		}
		for (int i = 0; i < arr7.length; i++) {
			for (int j = 0; j < arr7[i].length; j++) {
				System.out.print(arr7[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {
		String[] arr8 = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
				"홍하하" };
		System.out.println("== 1분단 ==");
		String[][] group1 = new String[3][2];
		for (int i = 0; i < group1.length; i++) {
			for (int j = 0; j < group1[i].length; j++) {
				group1[i][j] = arr8[2 * i + j];
				System.out.print(group1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		String[][] group2 = new String[3][2];
		for (int i = 0; i < group2.length; i++) {
			for (int j = 0; j < group2[i].length; j++) {
				group2[i][j] = arr8[6 + 2 * i + j];
				System.out.print(group2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice9() {
		String[] arr8 = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
				"홍하하" };
		System.out.println("== 1분단 ==");
		String[][] group1 = new String[3][2];
		for (int i = 0; i < group1.length; i++) {
			for (int j = 0; j < group1[i].length; j++) {
				group1[i][j] = arr8[2 * i + j];
				System.out.print(group1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		String[][] group2 = new String[3][2];
		for (int i = 0; i < group2.length; i++) {
			for (int j = 0; j < group2[i].length; j++) {
				group2[i][j] = arr8[6 + 2 * i + j];
				System.out.print(group2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		System.out.print("검색할 학생 이름을 입력하세요: ");
		String name = sc.nextLine();
		int group = 0;
		String row = null;
		String col = null;
		for(int i = 0; i<arr8.length;i++) {
			switch(Arrays.asList(arr8).indexOf(name)) {
			case 0:
				group = 1; row = "첫"; col = "왼";
				break;
			case 1:
				group = 1; row = "첫"; col = "오른";
				break;
			case 2:
				group = 1; row = "두"; col = "왼";
				break;
			case 3:
				group = 1; row = "두"; col = "오른";
				break;
			case 4:
				group = 1; row = "세"; col = "왼";
				break;
			case 5:
				group = 1; row = "세"; col = "오른";
				break;
			case 6:
				group = 2; row = "첫"; col = "왼";
				break;
			case 7:
				group = 2; row = "첫"; col = "오른";
				break;
			case 8:
				group = 2; row = "두"; col = "왼";
				break;
			case 9:
				group = 2; row = "두"; col = "오른";
				break;
			case 10:
				group = 2; row = "세"; col = "왼";
				break;
			case 11:
				group = 2; row = "세"; col = "오른";
				break;
			}
		}
		System.out.printf("검색하신 %s 학생은 %d분단 %s 번째 줄 %s쪽에 있습니다.", name, group, row, col);
	}

	public void practice10() {
		String[][] arr10 = new String[6][6];
		System.out.print("행 인덱스 입력: ");
		String rowStr = sc.nextLine();
		int row = Integer.parseInt(rowStr);
		System.out.print("열 인덱스 입력: ");
		String colStr = sc.nextLine();
		int col = Integer.parseInt(colStr);

		// 모든 값 " "으로 초기화
		for (int i = 0; i < arr10.length; i++) {
			for (int j = 0; j < arr10[i].length; j++) {
				arr10[i][j] = " ";
			}
		}

		// 1열 인덱스
		for (int i = 1; i < arr10.length; i++) {
			arr10[i][0] = Integer.valueOf(i - 1).toString();
		}

		// 1행 인덱스
		for (int i = 1; i < arr10[0].length; i++) {
			arr10[0][i] = Integer.valueOf(i - 1).toString();
		}

		// X표시
		arr10[row + 1][col + 1] = "X";

		for (int i = 0; i < arr10.length; i++) {
			for (int j = 0; j < arr10[i].length; j++) {
				System.out.print(arr10[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice11() {
		while (true) {
			String[][] arr11 = new String[6][6];
			System.out.print("행 인덱스 입력: ");
			String rowStr = sc.nextLine();
			int row = Integer.parseInt(rowStr);

			if (row == 99) {
				break;
			}

			System.out.print("열 인덱스 입력: ");
			String colStr = sc.nextLine();
			int col = Integer.parseInt(colStr);

			// 모든 값 " "으로 초기화
			for (int i = 0; i < arr11.length; i++) {
				for (int j = 0; j < arr11[i].length; j++) {
					arr11[i][j] = " ";
				}
			}

			// 1열 인덱스
			for (int i = 1; i < arr11.length; i++) {
				arr11[i][0] = Integer.valueOf(i - 1).toString();
			}

			// 1행 인덱스
			for (int i = 1; i < arr11[0].length; i++) {
				arr11[0][i] = Integer.valueOf(i - 1).toString();
			}

			// X표시
			arr11[row + 1][col + 1] = "X";

			for (int i = 0; i < arr11.length; i++) {
				for (int j = 0; j < arr11[i].length; j++) {
					System.out.print(arr11[i][j] + " ");
				}
				System.out.println();
			}
		}
		System.out.println("프로그램 종료");
	}
}
