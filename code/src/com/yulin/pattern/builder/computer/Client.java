package com.yulin.pattern.builder.computer;

/**
 * 背景：小成去电脑城买一台组装的台式主机
 * 过程：
 * 1. 电脑城老板(Director)和小成(Client)进行需求沟通
 * 2. 了解需求后，电脑城老板将小成需求的主机分成各个部件(Builder)的建造请求(CPU、主板。。。)
 * 3. 指挥装机人员(ConcreteBuilder)去构建组件
 * 4. 将组件组装起来成小城需要的电脑(Product)
 * */
public class Client {

    public static void main(String[] args) {
        // 小成发现一家合适的电脑店，找到该店的老板和装机人员
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        // 沟通需求后，老板叫装机人员去装电脑
        director.construct(builder);

        // 装完后，组装人员搬来组装好的电脑
        Computer computer = builder.getComputer();
        // 组装人员展示电脑给小成看
        computer.show();
    }

}
