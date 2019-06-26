package com.eshop.response;

import lombok.Data;

@Data
public class CommonReturnType {
    private String success; //success or fail
    private String message;
    private Object value;

    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "true","成功");
    }

    public static CommonReturnType create(Object result, String success,String message) {
        CommonReturnType type = new CommonReturnType();
        type.setSuccess(success);
        type.setValue(result);
        type.setMessage(message);
        return type;
    }

}
