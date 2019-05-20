package com.yulin.pattern.singleton.hungry;

/**
 * 饿汉式：在类初始化时(使用前)创建实例
 * 类初始化在类加载之后执行，类静态方法在类初始化之后执行
 */
public class SingletonAA {

    private static SingletonAA sInstance = null;

    static {
        sInstance = new SingletonAA();
    }

    private SingletonAA() {
    }

    public static SingletonAA getInstance() {
        // 在static代码之后执行
        return sInstance;
    }

}
