package com.example.demo.product;


import com.example.demo.product.model.Product;
import com.example.demo.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = GET)
    public List<Product> getProducts() {
        log.info("Return all products.");
        return productRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = GET)
    public Product getProduct(@PathVariable("id") long id) {
        log.info("Get product with id: {}", id);
        return productRepository.getById(id);
    }

}
