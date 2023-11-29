package com.thesis.ecommerce.model.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDetail {
    private Long id;
    private String name;
    private String description;
    private String price;
    private BigDecimal discountPrice;
    private BigDecimal ppn;
    private BigDecimal admin;
    private BigDecimal totalAmount;
}
