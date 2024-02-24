package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
//	 기본 생성자
	public CharacterController() {

	}

//	매개변수로 들어온 값에 영문
//	자가 몇 개 들어있는지 반환
	public int countAlpha(String s) throws CharCheckException {
		char[] arrUp = new char[26];
		char[] arrDown = new char[26];
		int countUp = 0;
		int countDown = 0;
		int count = 0;
		for (int i = 0; i < arrUp.length; i++) {
			arrUp[i] = (char) (i + 65);
			arrDown[i] = (char) (i + 97);
		}
		for (int i = 0; i < arrUp.length; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (arrUp[i] == s.charAt(j)) {
					countUp++;
				}
			}
		}
		for (int i = 0; i < arrDown.length; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (arrDown[i] == s.charAt(j)) {
					countDown++;
				}
			}
		}
		count = countUp + countDown;
		if (s.contains(" "))
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		return count;
//		매개변수로 들어온 값에 있는 영문자를 세어 반환
//		문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
	}
}
