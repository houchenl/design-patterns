package com.yulin.pattern.builder.computer;

// 定义组装的过程
public interface Builder {

    void buildCpu();

    void buildMainBoard();

    void buildHd();

    Computer getComputer();

}
