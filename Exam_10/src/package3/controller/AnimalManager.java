package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] animal = new Animal[5];
		animal[0] = (Dog) new Dog("개1", "잡종", 500);
		animal[1] = (Dog) new Dog("개2", "순종", 300);
		animal[2] = (Cat) new Cat("고양이1", "잡종", "서울", "갈색");
		animal[3] = (Cat) new Cat("고양이2", "순종", "분당", "흑색");
		animal[4] = (Cat) new Cat("고양이3", "별종", "역삼", "흰색");

		for (int i = 0; i < animal.length; i++) {
			animal[i].speak();
		}
	}
}
