package com.kh.practice.list.music.model.vo;

import java.io.Serializable;
import java.util.Objects;

public class Music implements Serializable, Comparable<Music> {
//	The serializable class Music does not declare a static final serialVersionUID field of type long
	/**
	 * 
	 */
	private static final long serialVersionUID = -6534978395195382553L;
	private String title, singer;

//	기본 생성자
	public Music() {
	}

//	매개변수가 있는 생성자
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

//	객체의 정보를 리턴하는 메소드
	@Override
	public String toString() {
		return singer + " - " + title;
	}

//	해시코드 오버라이딩한 메소드
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}

//	equals 오버라이딩한 메소드
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}

//	정렬 기준을 가지고 있는 메소드
	@Override
	public int compareTo(Music o) {
		int result = this.singer.compareTo(o.getSinger());
		return -result; // 음수: 내림차순
	}
}
