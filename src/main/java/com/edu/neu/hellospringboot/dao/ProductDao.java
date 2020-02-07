package com.edu.neu.hellospringboot.dao;

import com.edu.neu.hellospringboot.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductDao {

    @Select("select * from product where product_id = #{productId}")
    Product getProduct(int productId);
}
