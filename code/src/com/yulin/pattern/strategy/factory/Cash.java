package com.yulin.pattern.strategy.factory;

public interface Cash {

	/**
	* @param money origin meoney
	* @return final charge
	*/
	double acceptCash(double money);

}
