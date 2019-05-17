package com.yulin.pattern.decorative.greatSage;

public class Change implements GreatSage {

	private GreatSage mSage;

	public Change(GreatSage sage) {
		mSage = sage;
	}

	public void move() {
		mSage.move();
	}

}
