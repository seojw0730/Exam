package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	StringTokenizer st;

//	기본 생성자
	public TokenController() {
	}

//	공백을 토큰으로 처리한 문자열 반환
	public String afterToken(String str) {
		st = new StringTokenizer(str, " ");
		String result = "";
		while (st.hasMoreTokens()) {
			result += st.nextToken();
		}
		return result;
//		매개변수로 받아온 str을 StringTokenizer를 이용하여
//		띄어쓰기를 없애고 없앤 문자열 반환
	}

//	첫 글자만 대문자로 바꾼 문자열 반환
	public String firstCap(String input) {
		String firstCap = Character.valueOf(input.charAt(0)).toString().toUpperCase()
				.concat(input.substring(1, input.length()));
		return firstCap;
//		매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
	}

//	문자열 안에 찾을 문자 개수가 몇 개 들어가있는지 반환
	public int findChar(String input, char one) {
		int findIndex = input.indexOf(one);
		int count = 0;
		while (findIndex >= 0) {
			findIndex = input.indexOf(one, findIndex + 1);
			count++;
		}
		return count;
//		매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
	}
}