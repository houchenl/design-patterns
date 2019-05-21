package com.yulin.pattern.bridge.car;

public class EngineTwo implements Engine {

    @Override
    public void installEngine() {
        System.out.println("install engine 1300");
    }

}
