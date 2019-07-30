package com.smd.product.service.impl;

import com.smd.product.bean.ProductInfo;
import com.smd.product.enums.ProductStatusEnum;
import com.smd.product.repository.ProductInfoRepository;
import com.smd.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        List<ProductInfo> list = productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getStatus());
        return list;
    }
}
