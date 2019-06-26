package com.eshop.service.model;

import lombok.Data;

@Data
public class UserModel {
    private Integer id;
    private String name;
    private Byte gender;
    private Integer age;
    private String telephone;
    private String registerMode;
    private String thirdPartyId;
    private String encrptPassword;
}
