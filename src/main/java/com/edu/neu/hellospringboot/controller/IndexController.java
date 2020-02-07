package com.edu.neu.hellospringboot.controller;

import com.edu.neu.hellospringboot.dao.ProductDao;
import com.edu.neu.hellospringboot.pojo.Product;
import com.edu.neu.hellospringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
public class IndexController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/index")
    public ModelAndView index(Integer product_id){
        ModelAndView mv = new ModelAndView();
        Product product = productService.getProduct(product_id);
        mv.addObject("product", product);
        mv.setView(new MappingJackson2JsonView());
        return mv;
    }

}
