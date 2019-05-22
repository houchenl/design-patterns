package com.yulin.pattern.responsibility.fee;

// 部门经理，额度小于1000，否则传给上级经理
public class DeptManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String result = "";

        if (fee < 1000) {
            if ("张三".equals(user)) {
                result = "成功：部门经理同意了[" + user + "]的聚餐费用，金额为" + fee + "元";
            } else {
                result = "失败：部门经理不同意[" + user + "]的聚餐费用，金额为" + fee + "元";
            }
        } else {
            // 超过额度权限，继续传递给级别更高的人处理
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }

        return result;
    }

}
