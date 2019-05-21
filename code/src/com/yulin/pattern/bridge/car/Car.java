package com.yulin.pattern.bridge.car;

public abstract class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void installEngine();

}
