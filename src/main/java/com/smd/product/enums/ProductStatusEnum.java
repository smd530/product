package com.smd.product.enums;

import lombok.Data;
import lombok.Getter;

/**
 * @Description: 商品状态枚举类
 *
 * @Author: shanmingda
 * @Date: 2019-07-25 17:18
*/

@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer status;

    private String message;


    ProductStatusEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}
