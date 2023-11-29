package com.thesis.ecommerce.repository;


import com.thesis.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product>  findByCategoryAndStatus(String category,String status);
}
