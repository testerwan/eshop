package com.eshop.error;

public enum EmBusinessError implements CommonError {
    //错误信息定义
    PARAMETER_VALID_ERROR(0000, "参数异常"),
    USER_NOT_EXIST(10002, "用户不存在"),
    UNKNOW_ERROR(10000, "系统错误"),
    ;


    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        this.errCode = errCode;
        return this;
    }
}
