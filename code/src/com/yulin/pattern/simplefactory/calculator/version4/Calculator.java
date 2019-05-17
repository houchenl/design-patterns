package com.yulin.pattern.simplefactory.calculator.version4;

import java.util.Scanner;

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

            Operation operation = OperationFactory.createOperate(operator);
            if (operation != null) {
                operation.setNumberA(numA);
                operation.setNumberB(numB);
                double result = operation.getResult();
                System.out.println("结果是： " + result);
            }
        } catch (Exception e) {
            System.out.println("您的输入有错： " + e.getMessage());
        }
    }

}
