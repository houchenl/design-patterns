package com.yulin.pattern.singleton.lazy;

// 懒汉式：在使用时创建实例
// 线程安全
public class SingletonB {

    private static volatile SingletonB sInstance = null;

    private SingletonB() {
    }

    // 双重检查null，避免多线程访问生成多个对象
    public static SingletonB getInstance() {
        if (sInstance == null) {
            synchronized (SingletonB.class) {
                if (sInstance == null) {
                    sInstance = new SingletonB();
                }
            }
        }
        return sInstance;
    }

}
