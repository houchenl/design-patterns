package com.yulin.pattern.adapter.clz;

// 适配器角色，继承并扩展Adaptee，同时又实现了目标接口
public class Adapter extends Adaptee implements Target {

    @Override
    public void operation2() {
        System.out.println("Adapter operation2()");
    }

}
