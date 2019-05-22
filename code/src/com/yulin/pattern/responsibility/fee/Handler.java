package com.yulin.pattern.responsibility.fee;

public abstract class Handler {

    private Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐请求
     *
     * @param user 申请人
     * @param fee  申请的钱数
     */
    public abstract String handleFeeRequest(String user, double fee);

}
