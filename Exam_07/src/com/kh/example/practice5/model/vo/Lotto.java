package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	private int lotto[];

	public Lotto() {
		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 1 + new Random().nextInt(44); // 0~1;
		}

	}

	public void information() {
	}

}
