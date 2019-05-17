package com.yulin.pattern.simplefactory.calculator.version4;

public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }

}
