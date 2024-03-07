package com.kh.practice.numRange.exception;

public class NumRangeException extends Throwable {
	public NumRangeException() {
	}

	public NumRangeException(String msg) throws NumRangeException {
		super(msg);
	}
}
