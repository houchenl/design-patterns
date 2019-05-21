package com.yulin.pattern.builder.product;

// 抽象建造者类
public interface Builder {

    void buildPart1();

    void buildPart2();

    Product result();

}
