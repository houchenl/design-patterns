package com.yulin.pattern.decorative.greatSage;

public class Fish extends Change {

	public Fish(GreatSage sage) {
		super(sage);
	}

	public void move() {
		System.out.println("Fish Move");
	}

}
