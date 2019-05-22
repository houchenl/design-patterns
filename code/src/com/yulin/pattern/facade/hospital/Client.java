package com.yulin.pattern.facade.hospital;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.guahao();
        facade.consult();
        facade.medicine();
        facade.pay();
    }

}
