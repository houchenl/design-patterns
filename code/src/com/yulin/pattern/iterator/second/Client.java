package com.yulin.pattern.iterator.second;

public class Client {

	public static void main(String[] args) {
		Container container = new ConcreteContainer();
		Iterator iterator = container.createIterator();
		System.out.println(iterator.first());
		while (!iterator.isDone()) {
			System.out.println(iterator.next());
		}
	}

}
