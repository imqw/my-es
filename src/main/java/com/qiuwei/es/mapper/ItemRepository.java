package com.qiuwei.es.mapper;

import com.qiuwei.es.bean.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Item 商品增删改查类
 *
 * @Author: qiuwei@19pay.com.cn
 * @Date: 2019-11-18.
 */
public interface ItemRepository extends ElasticsearchRepository<Item, Long> {

}
