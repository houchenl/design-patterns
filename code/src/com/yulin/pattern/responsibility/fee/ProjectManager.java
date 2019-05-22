package com.yulin.pattern.responsibility.fee;

// 项目经理，额度小于500，否则传给上级经理
public class ProjectManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String result = "";

        if (fee < 500) {
            if ("张三".equals(user)) {
                result = "成功：项目经理同意了[" + user + "]的聚餐费用，金额为" + fee + "元";
            } else {
                result = "失败：项目经理不同意[" + user + "]的聚餐费用，金额为" + fee + "元";
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
