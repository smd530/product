package com.smd.product.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Description: 商品类目实体类
 *
 * @Author: shanmingda
 * @Date: 2019-07-25 11:46
*/

@Data
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
