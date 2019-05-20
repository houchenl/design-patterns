package com.yulin.pattern.singleton.byenum;

// 使用单例创建单例
public enum SingletonC {

    INSTANCE;  // 在static代码块前创建实例

    public static SingletonC getInstance() {
        return INSTANCE;
    }

}
