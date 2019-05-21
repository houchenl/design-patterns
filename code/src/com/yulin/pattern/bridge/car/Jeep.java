package com.yulin.pattern.bridge.car;

public class Jeep extends Car {

    public Jeep(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        this.getEngine().installEngine();
    }

}
