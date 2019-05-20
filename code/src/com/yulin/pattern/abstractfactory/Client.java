package com.yulin.pattern.abstractfactory;

public class Client {

    public static void main(String[] args) {
        // 创建装机工程师对象
        ComputerEngineer ce = new ComputerEngineer();
        // 选择产品对象
        AbstractFactory af = new IntelFactory();
        // 告诉装机工程师选择的产品，让装机工程师组装电脑
        ce.makeComputer(af);
    }

}
