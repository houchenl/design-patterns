package com.yulin.pattern.simplefactory.calculator.version1;

import java.io.Console;
import java.util.Scanner;

// 计算器
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数字A：");
        double numA = Double.parseDouble(scanner.nextLine());    // one: 命令不规范

        System.out.println("请选择运算符号(+、-、*、/)：");
        String operator = scanner.nextLine();

        System.out.println("请输入数字B：");
        double numB = Double.parseDouble(scanner.nextLine());

        double result = 0;

        if (operator.equals("+"))
            result = numA + numB;
        if (operator.equals("-"))  // 每个条件都判断一次，计算机做了三次无用功
            result = numA - numB;
        if (operator.equals("*"))
            result = numA * numB;
        if (operator.equals("/"))  // 如果客户输入了0，或者输入字符不是数字怎么办
            result = numA / numB;

        System.out.println("结果是： " + result);
    }

}
