package com.kh.practice.set.controller;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<Lottery>();
	private HashSet<Lottery> win = new HashSet<Lottery>();

	public boolean insertObject(Lottery l) {
		boolean result;
		if (lottery.contains(l)) {
			result = false;
		} else {
			result = lottery.add(l);
		}
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
		HashSet<Lottery> result = win;
		return result;
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
