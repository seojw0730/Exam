package com.kh.example.practice5.run;

import java.util.Random;

import com.kh.example.practice5.model.vo.Lotto;

public class Run {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 1 + new Random().nextInt(44);
			System.out.print(lotto[i] + " ");
		}
	}
}
