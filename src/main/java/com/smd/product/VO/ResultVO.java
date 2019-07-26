package com.smd.product.VO;

import lombok.Data;

/**
 * @Description: http请求返回的最外层对象
 *
 * @Author: shanmingda
 * @Date: 2019-07-26 11:55
*/

@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;


}
