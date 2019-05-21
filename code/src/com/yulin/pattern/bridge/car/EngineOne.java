package com.yulin.pattern.bridge.car;

public class EngineOne implements Engine {

    @Override
    public void installEngine() {
        System.out.println("install engine 200");
    }

}
