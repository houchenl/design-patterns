package com.yulin.pattern.singleton.inner;

// 登记式，使用静态内部类
public class SingletonD {

    private SingletonD() {
    }

    private static class Holder {
        private static final SingletonD sInstance = new SingletonD();
    }

    public static SingletonD getInstance() {
        // 外部类可以访问静态内部类的静态私有成员
        return Holder.sInstance;
    }

}
