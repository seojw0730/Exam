package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;

public class ScoreDAO {
//	매개변수들을 DataOutputStream을 통해 파일에 저장
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		DataOutputStream dao = new 
	}
	
//	파일을 DataInputStream을 통해 읽어옴
	public DataInputStream readScore() throws FileNotFoundException {
		return null;
	}
}
