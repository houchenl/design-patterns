package com.yulin.pattern.factory;

public class CarFactory implements Factory {

    @Override
    public Product produce() {
        return new Car();
    }

}
