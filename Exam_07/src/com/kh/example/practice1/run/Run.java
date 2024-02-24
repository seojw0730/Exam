package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member jw = new Member();
		jw.setMemberName("이름1");
		jw.printName();
		jw.changeName("이름2");
		jw.printName();
	}
}
