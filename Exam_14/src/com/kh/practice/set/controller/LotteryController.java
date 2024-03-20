package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<Lottery>();
	private HashSet<Lottery> win = new HashSet<Lottery>();

	public boolean insertObject(Lottery l) {
		boolean result = lottery.add(l);
		return result;
	}

	public boolean deleteObject(Lottery l) {
		boolean result = true;
		result = lottery.remove(l);
		if ((!(result)) && (win != null)) {
			win.remove(l);
		}
		return result;
	}

	public HashSet<Lottery> winObject() {
		ArrayList<Lottery> list = new ArrayList<Lottery>();
		for (int i = 0; i < 4; i++) {
			list.add(lottery.iterator().next());
		}
		for (Lottery l : list) {
			win.add(l);
		}
		HashSet<Lottery> result = win;

		return win;
	}

	public TreeSet<Lottery> sortedWinObject() {
		TreeSet<Lottery> result = null;
		return result;
	}

	public boolean searchWinner(Lottery l) {
		boolean result = win.contains(l);
		return result;
	}
}
