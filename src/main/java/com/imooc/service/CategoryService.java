package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by 贺永明
 * 2019-05-09 10:12
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
