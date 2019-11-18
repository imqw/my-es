package com.qiuwei.es.bean;


import com.qiuwei.es.mapper.ItemRepository;
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

    @Autowired
    ItemRepository itemRepository;


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
        boolean b = template.deleteIndex(Item.class);
        System.out.println(b);


    }


    /**
     * 添加记录
     */

    @Test
    public void addRecord() {
        Item item = new Item();

        item.setId(2L);
        item.setTitle("小米手机7");
        item.setBrand("小米");
        item.setCategory("手机");
        item.setPrice(3499.00);
        item.setImages("http://image.baidu.com/13123.jpg");


        boolean b = itemRepository.existsById(2L);

        System.out.println("是否存在 " + b);

        if (b) {
            itemRepository.delete(item);
            System.out.println("已经存在先删除");
        }


        itemRepository.save(item);
        System.out.println("保存成功");


    }
}
