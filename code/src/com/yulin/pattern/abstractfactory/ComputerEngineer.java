package com.yulin.pattern.abstractfactory;

public class ComputerEngineer {

    private Cpu cpu = null;
    private MainBoard mainBoard = null;

    public void makeComputer(AbstractFactory af) {
        prepareHardware(af);
    }

    private void prepareHardware(AbstractFactory af) {
        this.cpu = af.createCpu();
        this.mainBoard = af.createMainBoard();

        this.cpu.calculate();
        this.mainBoard.installCpu();
    }

}
