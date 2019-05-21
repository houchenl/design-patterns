package com.yulin.pattern.builder.computer;

// 电脑城老板委派任务给装机人员
public class Director {

    public void construct(Builder builder) {
        builder.buildCpu();
        builder.buildMainBoard();
        builder.buildHd();
    }

}
