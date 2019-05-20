package com.yulin.pattern.abstractfactory;

public class IntelMainBoard implements MainBoard {

    private int cpuHoles = 0;

    public IntelMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("Intel主板的CPU插槽孔数是： " + cpuHoles);
    }

}
