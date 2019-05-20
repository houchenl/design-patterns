package com.yulin.pattern.template;

public class ConcreteTemplate extends AbstractTemplate {

    @Override
    protected void abstractMethod() {
        System.out.println("子类提供实现的基本方法");
    }

    @Override
    protected boolean hookMethod() {
        System.out.println("子类复写钩子方法");
        return true;
    }

}
