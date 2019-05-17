package com.yulin.pattern.simplefactory.calculator.version3;

// 运算操作类，可被不同的运算器复用
public class Operation {

    // 问题：加减乘除运算耦合在一起，应该分离，分离后互不影响
    public static double calculate(double numberA, double numberB, String operator) {
        double result = 0d;

        switch (operator) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                if (numberB != 0)
                    result = numberA / numberB;
                break;
        }

        return result;
    }

}
