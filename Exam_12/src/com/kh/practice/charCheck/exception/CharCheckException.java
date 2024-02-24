package com.kh.practice.charCheck.exception;

public class CharCheckException extends Throwable {
//	기본 생성자
	public CharCheckException() {
	}

//	매개변수로 받은 값을 부모
//	생성자로 넘기는 생성자
	public CharCheckException(String msg) {
		super(msg);
	}
}