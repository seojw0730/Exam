package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreDAO {
//	매개변수들을 DataOutputStream을 통해 파일에 저장
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		try {
			File f = new File("score.txt");
			f.createNewFile();
			FileWriter fw = new FileWriter(f, true);
//			dos.writeChars(name);
//			dos.writeInt(kor);
//			dos.writeInt(eng);
//			dos.writeInt(math);
//			dos.writeInt(sum);
//			dos.writeDouble(avg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
//	파일을 DataInputStream을 통해 읽어옴
	public DataInputStream readScore() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dis;
	}
}
