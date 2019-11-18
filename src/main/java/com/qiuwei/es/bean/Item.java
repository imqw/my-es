package com.qiuwei.es.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Date: 2019-11-18.
 */
@Data
@Document(indexName = "item",type = "docs")
public class Item {

    @Id
    private Long id;
    /**
     * 标题
     */

    @Field(type = FieldType.Text)
    private String title;
    /**
     * 分类
     */
    @Field(type = FieldType.Keyword)
    private String category;
    /**
     * 品牌
     */
    @Field(type = FieldType.Keyword)
    private String brand;
    /**
     * 价格
     */
    @Field(type = FieldType.Double)
    private Double price;
    /**
     * 图片地址
     */
    @Field(index = false,type = FieldType.Keyword)
    private String images;

}
