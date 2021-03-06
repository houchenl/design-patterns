package com.yulin.pattern.responsibility.fee;

public class Client {

    public static void main(String[] args) {
        Handler h1 = new GeneralManager();
        Handler h2 = new DeptManager();
        Handler h3 = new ProjectManager();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        String test1 = h3.handleFeeRequest("张三", 300);
        System.out.println(test1);
        String test2 = h3.handleFeeRequest("李四", 300);
        System.out.println(test2);

        String test3 = h3.handleFeeRequest("张三", 700);
        System.out.println(test3);
        String test4 = h3.handleFeeRequest("李四", 700);
        System.out.println(test4);

        String test5 = h3.handleFeeRequest("张三", 1700);
        System.out.println(test5);
        String test6 = h3.handleFeeRequest("李四", 1700);
        System.out.println(test6);
    }

}
