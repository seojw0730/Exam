package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
//	DAO에 매개변수를 전달하고, DAO로부터
//	전달받은 값을 다시 반환
	public boolean checkName(String file) {
		// TODO
		// FileDAO(fd)의 checkName() 매개변수로 file을 넘겨주고
		// 그리고 그 반환 값을 그대로 받아 또 반환해줌
		return true;
	}
	
//	전달받은 매개변수를 변경하고 DAO에 전
//	달
	public void fileSave(String file, StringBuilder sb) {
		// TODO
		// 매개변수로 넘어온 sb를 String으로 바꿔 fd의 fileSave()메소드 매개변수로
		// file과 String을 넘김
	}
	
//	DAO에 매개변수를 전달하고, DAO로부터
//	전달받은 값을 다시 반환
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		return sb;
		// TODO
		// fd의 fileOpen() 매개변수로 file을 넘겨주고 그 반환 값을 그대로 받아 또 반환
	}
	
//	전달받은 매개변수를 변경하고 DAO에 전
//	달
	public void fileEdit(String file, StringBuilder sb) {
		// TODO
		// 매개변수로 넘어온 sb를 String으로 바꿔 fd의 fileEdit()메소드 매개변수로
		// file과 String을 넘김
	}
}
