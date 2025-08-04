package com.joeolapurath.westcoaststorewebsite.repository;

import com.joeolapurath.westcoaststorewebsite.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> { }
