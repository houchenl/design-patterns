package com.yulin.pattern.strategy.factory;

public class CashNormal implements Cash {

	public double acceptCash(double money) {
		return money;
	}

}
