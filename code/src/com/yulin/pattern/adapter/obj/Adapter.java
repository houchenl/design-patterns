package com.yulin.pattern.adapter.obj;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void operation1() {
        if (this.adaptee != null) {
            this.adaptee.operation1();
        }
    }

    @Override
    public void operation2() {
        System.out.println("Adapter operation2()");
    }

}
