package com.qiuwei.es.bean;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Date: 2019-11-18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemTest {


    @Autowired
    ElasticsearchTemplate template;

    /**
     * 创建索引
     */

    @Test
    public void createIndex() {

        boolean index = template.createIndex(Item.class);

        System.out.println(index);


    }


    /**
     * 删除索引
     */

    @Test
    public void delIndex() {
    }
}
