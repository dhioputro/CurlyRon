package com.thesis.ecommerce.service;


import com.thesis.ecommerce.model.request.ProductRequest;
import com.thesis.ecommerce.model.response.ProductDetail;
import com.thesis.ecommerce.model.response.ProductResponse;
import com.thesis.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponse productList(ProductRequest request) {
        var products = productRepository.findByCategoryAndStatus(request.getCategory(), request.getStatus())
                .stream().map(data -> ProductDetail.builder()
                        .id(data.getId())
                        .name(data.getName())
                        .description(data.getDescription())
                        .build())
                .toList();

        return ProductResponse.builder()
                .productList(products)
                .build();
    }
}
