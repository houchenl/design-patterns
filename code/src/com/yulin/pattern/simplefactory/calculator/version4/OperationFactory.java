package com.yulin.pattern.simplefactory.calculator.version4;

public class OperationFactory {

    public static Operation createOperate(String operator) {
        Operation operation = null;
        switch (operator) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }

}
