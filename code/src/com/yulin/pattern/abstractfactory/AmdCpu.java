package com.yulin.pattern.abstractfactory;

public class AmdCpu implements Cpu {

    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Amd Cpu 针脚数： " + pins);
    }

}
