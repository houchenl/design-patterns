package com.yulin.pattern.observer;

// 抽象观察者角色类
public interface Observer {

    // 更新接口，主题类直接把数据告诉观察者
    void update(String state);

    // 更新接口，观察者从主题类获取数据
    void update(Subject subject);

}
