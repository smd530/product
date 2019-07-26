package com.smd.product.service.impl;

import com.smd.product.ProductApplicationTests;
import com.smd.product.bean.ProductCategory;
import com.smd.product.service.CategotyService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
public class CategotyServiceImplTest extends ProductApplicationTests {

    @Autowired
    private CategotyService categotyService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categotyService.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(list.size() > 0);
    }
}