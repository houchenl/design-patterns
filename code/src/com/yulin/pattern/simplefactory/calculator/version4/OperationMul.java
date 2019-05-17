package com.yulin.pattern.simplefactory.calculator.version4;

public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }

}
