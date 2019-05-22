package com.yulin.pattern.prototype.object;

// 使用java提供的clone功能
public class Prototype implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
