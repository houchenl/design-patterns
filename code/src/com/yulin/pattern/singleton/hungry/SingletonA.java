package com.yulin.pattern.singleton.hungry;

/**
 * 饿汉式：在类加载时(使用前)创建实例
 * 可以使用反射机制攻击
 * 线程安全（多个类加载器除外）
 */
public class SingletonA {

    private static final SingletonA sInstance = new SingletonA();  // 在static代码块之前执行

    private SingletonA() {
    }

    public static SingletonA getInstance() {
        return sInstance;
    }

}
