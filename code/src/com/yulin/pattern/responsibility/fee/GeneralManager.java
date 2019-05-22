package com.yulin.pattern.responsibility.fee;

// 总经理，额度不限
public class GeneralManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String result = "";

        if (fee >= 1000) {
            if ("张三".equals(user)) {
                result = "成功：总经理同意了[" + user + "]的聚餐费用，金额为" + fee + "元";
            } else {
                result = "失败：总经理不同意[" + user + "]的聚餐费用，金额为" + fee + "元";
            }
        } else {
            // 如果还有后继处理对象，继续传递
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }

        return result;
    }

}
