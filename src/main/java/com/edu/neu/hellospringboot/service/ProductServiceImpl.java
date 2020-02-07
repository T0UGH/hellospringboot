package com.edu.neu.hellospringboot.service;

import com.edu.neu.hellospringboot.dao.ProductDao;
import com.edu.neu.hellospringboot.pojo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDao productDao;

    @Override
    public Product getProduct(int productId) {
        return productDao.getProduct(productId);
    }
}
