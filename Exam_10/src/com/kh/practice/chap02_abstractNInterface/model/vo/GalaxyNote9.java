package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

//	부모에게 상속받은 maker 필드를 “삼성”으로 초기화
	public GalaxyNote9() {
		super.setMaker("삼성");
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
		String method = "1200만 듀얼 카메라";
		return method;
	}

	@Override
	public String charge() {
		String method = "고속 충전, 고속 무선 충전";
		return method;
	}

	@Override
	public String touch() {
		String method = "정전식, 와콤펜 지원";
		return method;
	}

	@Override
	public boolean bluetoothPen() {
		boolean method = true;
		return method;
	}

	public String printInformation() {
		return null;
	}
}
