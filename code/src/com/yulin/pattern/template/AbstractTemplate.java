package com.yulin.pattern.template;

public abstract class AbstractTemplate {

    // 模板方法
    public final void templateMethod() {
        abstractMethod();
        if (hookMethod()) {
            concreteMethod();
        }
    }

    // 基本方法：由子类实现
    protected abstract void abstractMethod();

    // 基本方法：钩子方法，父类提供有默认实现
    protected boolean hookMethod() {
        System.out.println("钩子方法：父类提供默认实现");
        return false;
    }

    // 基本方法：已经实现
    private final void concreteMethod() {
        System.out.println("父类已实现的基本方法");
    }

}
