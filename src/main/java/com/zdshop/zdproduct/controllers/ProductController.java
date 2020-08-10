package com.zdshop.zdproduct.controllers;

import com.zdshop.zdproduct.beans.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Mono<Product> find (@PathVariable String id) {
        logger.info("looking product with id : " + id);
        return Mono.just(
                Product.builder()
                .id("0001")
                .name("chemise")
                .description("chemise cool")
                .build());
    }
}
