package com.smd.product.service.impl;

import com.smd.product.bean.ProductCategory;
import com.smd.product.repositry.ProductCategoryRepository;
import com.smd.product.service.CategotyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategotyServiceImpl implements CategotyService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        List<ProductCategory> list = productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
        return list;
    }
}
