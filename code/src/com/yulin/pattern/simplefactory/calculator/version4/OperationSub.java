package com.yulin.pattern.simplefactory.calculator.version4;

public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }

}
