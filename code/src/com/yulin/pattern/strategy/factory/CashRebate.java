package com.yulin.pattern.strategy.factory;

public class CashRebate implements Cash {

	private double mRebate = 1d;

	public CashRebate(double rebate) {
		mRebate = rebate;
	}

	public double acceptCash(double money) {
		return money * mRebate;
	}

}
