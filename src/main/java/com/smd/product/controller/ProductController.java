package com.smd.product.controller;

import com.smd.product.VO.ProductInfoVO;
import com.smd.product.VO.ProductVO;
import com.smd.product.VO.ResultVO;
import com.smd.product.bean.ProductCategory;
import com.smd.product.bean.ProductInfo;
import com.smd.product.service.CategotyService;
import com.smd.product.service.ProductService;
import com.smd.product.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategotyService categotyService;

    /**
     * @Description: 商品list
     *
     * @Return:
     * @Author: shanmingda
     * @Date: 2019-07-24 23:32
    */

    @GetMapping("/list")
    public ResultVO list() {

        //查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //获取类目type列表
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        //从数据库查询类目
        List<ProductCategory> categoryList = categotyService.findByCategoryTypeIn(categoryTypeList);
        //构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<ProductInfoVO>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }
}
