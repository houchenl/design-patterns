package com.yulin.pattern.strategy.factory;

public class CashReturn implements Cash {

	private double mCondition = 0d;
	private double mReturn = 0d;

	public CashReturn(double condition, double returnVal) {
		mCondition = condition;
		mReturn = returnVal;
	}

	public double acceptCash(double money) {
		double tResult = money;

		if (money > mCondition) {
			tResult = money - Math.floor(money / mCondition) * mReturn;
		}

		return tResult;
	}

}
