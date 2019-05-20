package com.yulin.pattern.template;

public class Client {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.templateMethod();
    }

}
