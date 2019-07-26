package com.smd.product.service;

import com.smd.product.bean.ProductCategory;

import java.util.List;

/**
 * @Description: 类目Service
 * @Author: shanmingda
 * @Date: 2019-07-26 11:09
*/

public interface CategotyService {

    List<ProductCategory> findByCategoryTypeIn (List<Integer> categoryTypeList);
}
