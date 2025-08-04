package com.joeolapurath.westcoaststorewebsite.repository;

import com.joeolapurath.westcoaststorewebsite.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
