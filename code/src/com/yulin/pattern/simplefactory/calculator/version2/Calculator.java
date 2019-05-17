package com.yulin.pattern.simplefactory.calculator.version2;

import java.util.Scanner;

// 计算器
// 问题：没有使用面向对象实现计算器。耦合度过高，不容易扩展、维护、复用性差、灵活性差
public class Calculator {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入数字A：");
            double numA = Double.parseDouble(scanner.nextLine());

            System.out.println("请选择运算符号(+、-、*、/)：");
            String operator = scanner.nextLine();

            System.out.println("请输入数字B：");
            double numB = Double.parseDouble(scanner.nextLine());

            double result = 0;

            switch (operator) {
                case "+":
                    result = numA + numB;
                    break;
                case "-":
                    result = numA - numB;
                    break;
                case "*":
                    result = numA * numB;
                    break;
                case "/":
                    if (numB != 0)
                        result = numA / numB;
                    else {
                        System.out.println("除数不能为0");
                        return;
                    }
                    break;
            }

            System.out.println("结果是： " + result);
        } catch (Exception e) {
            System.out.println("您的输入有错： " + e.getMessage());
        }
    }

}
