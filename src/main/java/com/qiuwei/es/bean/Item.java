package com.qiuwei.es.bean;

import lombok.Data;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Date: 2019-11-18.
 */
@Data
public class Item {

    private Long id;
    /**
     * 标题
     */

    private String title;
    /**
     * 分类
     */
    private String category;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 价格
     */
    private Double price;
    /**
     * 图片地址
     */
    private String images;

}
