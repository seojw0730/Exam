package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();

//	리스트 마지막에 값 저장 메소드
	public int addList(Music music) {
		list.add(music);
		return 1;
	}

//	리스트 첫 번째에 값 저장 메소드
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}

//	모든 리스트를 반환하는 메소드
	public List printAll() {
		return list;
	}

//	곡 명을 검색하는 메소드
	public Music searchMusic(String title) {
		Music search = null;
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				search = list.get(list.indexOf(m));
				break;
			} else {
				search = null;
			}
		}
		return search;
	}

//	곡 명으로 찾아 삭제하는 메소드
	public Music removeMusic(String title) {
		Music remove = new Music();
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				remove = m;
				list.remove(m);
				break;
			} else {
				remove = null;
			}
		}
		return remove;
//		곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
	}

//	곡 명으로 찾아 내용을 수정하는 메소드
	public Music setMusic(String title, Music music) {
		Music set = new Music();
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				set = list.set(list.indexOf(m), music);
				System.out.println(m.getSinger() + " - " + m.getTitle() + "의 값이 변경되었습니다.");
			} else {
				set = null;
				System.out.println("수정할 곡이 없습니다.");
			}
		}
		return set;
//		곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
	}

//	곡 명 오름차순 정렬하는 메소드
	public int ascTitle() {
//		Collections.sort(list, new MusicController()); // 뭐야 왜 다 던져
//		Collections.sort(list, this); // 뭐야 왜 다 던져2
		Collections.sort(list, new AscTitle()); // Collections.sort(list모양의 매개인자, list<T>의 T보다 더 상위의 자료형만 쓸수있음) 혹은 Collections.sort(list, new MusicController()); 로 하고 컨트롤러 안에 compare 메소드 재정의 해줘도 됨, new MusicController() 대신 this 도 가능
		return 1;
	}

//	가수 명을 내림차순 정렬하는 메소드
	public int descSinger() {
		Collections.sort(list);
		return 1;
	}
}
