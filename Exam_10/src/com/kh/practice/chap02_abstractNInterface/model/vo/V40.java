package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {

//	부모에게 상속받은 maker 필드를 “LG”로 초기화
	public V40() {
		super.setMaker("LG");
	}

	@Override
	public String makeCall() {
		String method = "번호를 누르고 통화버튼을 누름";
		return method;
	}

	@Override
	public String takeCall() {
		String method = "수신 버튼을 누름";
		return method;
	}

	@Override
	public String picture() {
		String method = "1200, 1600만 트리플 카메라";
		return method;
	}

	@Override
	public String charge() {
		String method = "고속 충전, 고속 무선 충전";
		return method;
	}

	@Override
	public String touch() {
		String method = "정전식";
		return method;
	}

	@Override
	public boolean bluetoothPen() {
		boolean method = false;
		return method;
	}

	public String printInformation() {
		return "V40은 " + super.getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n" + makeCall() + "\n" + takeCall() + "\n" + picture()
				+ "\n" + charge() + "\n" + touch() + "\n블루투스 펜 탑재 여부: " + bluetoothPen();
	}
}
