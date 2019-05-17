package com.yulin.pattern.decorative.greatSage;

public class Client {

	public static void main(String[] args) {
		GreatSage sage = new Monkey();

		GreatSage bird = new Bird(sage);
		GreatSage fish = new Fish(bird);

		fish.move();
	}

}
