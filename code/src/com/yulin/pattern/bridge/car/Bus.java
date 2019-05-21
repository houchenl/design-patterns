package com.yulin.pattern.bridge.car;

public class Bus extends Car {

    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        this.getEngine().installEngine();
    }

}
