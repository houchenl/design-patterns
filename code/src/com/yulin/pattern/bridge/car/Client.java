package com.yulin.pattern.bridge.car;

public class Client {

    public static void main(String[] args) {
        EngineOne one = new EngineOne();
        EngineTwo two = new EngineTwo();

        Bus bus = new Bus(one);
        Jeep jeep = new Jeep(two);

        bus.installEngine();
        jeep.installEngine();
    }

}
