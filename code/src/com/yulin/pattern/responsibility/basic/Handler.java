package com.yulin.pattern.responsibility.basic;

public abstract class Handler {

    // 持有下一个处理请求的对象
    private Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    // 处理请求的方法
    public abstract void handleRequest();

}
