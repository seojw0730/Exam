package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	private int lotto[];

	public Lotto() {
	}

	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	public void information() {
		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = new Random().nextInt(44) + 1; // Random(): 0~1; Random().nextInt(44): 0~44;
			System.out.print(lotto[i] + " ");
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}

}
