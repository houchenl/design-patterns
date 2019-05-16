package com.yulin.pattern.strategy.duck;

public class DuckTest {

    public static void main(String[] args) {
        Duck duck = new GreenHeadDuck();
        duck.display();
        duck.quack();
        duck.fly();

        duck = new RedHeadDuck();
        duck.display();
        duck.quack();
        duck.fly();

        duck = new RubberDuck();
        duck.display();
        duck.quack();
        duck.fly();

        duck = new BigYellowDuck();
        duck.display();
        duck.quack();
        duck.fly();

        duck = new SpaceDuck();
        duck.display();
        duck.quack();
        duck.fly();
    }

}
