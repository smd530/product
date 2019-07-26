package com.smd.product.service;

import com.smd.product.bean.ProductInfo;

import java.util.List;

/**
 * @Description: 商品Serivice
 * @Author: shanmingda
 * @Date: 2019-07-26 11:09
*/

public interface ProductService {

    /**
     * @Description: 查询所有上架商品
     *
     * @param
     * @Return:
     * @Author: shanmingda
     * @Date: 2019-07-25 16:44
    */
    List<ProductInfo> findUpAll();
}
