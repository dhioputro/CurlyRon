package com.thesis.ecommerce.controller;


import com.thesis.ecommerce.model.request.ProductRequest;
import com.thesis.ecommerce.model.response.ProductResponse;
import com.thesis.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    @GetMapping(path = "/product-list")
    public ProductResponse insertIntoTransactionDeuction(@RequestParam String category, String status) {
        return productService.productList(ProductRequest.builder().category(category).status(status).build());
    }


}
