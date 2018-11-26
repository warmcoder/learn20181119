package com.caizi.dto;

import lombok.Data;

/**
 * Created by caizizhou
 * 2018-11-26 12:08 PM
 */
@Data
public class CartDTO {

    /**
     * 商品Id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
