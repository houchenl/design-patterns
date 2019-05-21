package com.yulin.pattern.builder.computer;

// 创建具体的建造者：装机人员
public class ConcreteBuilder implements Builder {

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("intel core 2");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("logic");
    }

    @Override
    public void buildHd() {
        computer.setHd("hardware");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

}
