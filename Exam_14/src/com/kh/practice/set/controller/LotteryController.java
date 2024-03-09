package com.kh.practice.set.controller;

import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<Lottery>();
	private HashSet<Lottery> win = new HashSet<Lottery>();

	public boolean insertObject(Lottery l) {
		boolean result;
		result = lottery.add(l);
		return result;
	}

	public boolean deleteObject(Lottery l) {
		boolean result = true;
		return result;
	}

	public HashSet<Lottery> winObject() {
		HashSet<Lottery> result = null;
		return result;
	}

	public TreeSet<Lottery> sortedWinObject() {
		TreeSet<Lottery> result = null;
		return result;
	}

	public boolean searchWinner(Lottery l) {
		boolean result = true;
		return result;
	}
}
