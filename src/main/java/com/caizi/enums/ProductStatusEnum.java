package com.caizi.enums;

/**
 * Created by caizizhou
 * 2018-11-24 10:48 PM
 */
public enum  ProductStatusEnum {
    UP(0, "上架"),
    DOWN(1, "下架")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
