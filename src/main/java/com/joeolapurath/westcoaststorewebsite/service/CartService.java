package com.joeolapurath.westcoaststorewebsite.service;

import com.joeolapurath.westcoaststorewebsite.model.CartItem;
import com.joeolapurath.westcoaststorewebsite.model.Product;
import com.joeolapurath.westcoaststorewebsite.repository.CartItemRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    private final CartItemRepository cartItemRepository;
    private final ProductService productService;

    public CartService(CartItemRepository cartItemRepository, ProductService productService) {
        this.cartItemRepository = cartItemRepository;
        this.productService = productService;
    }

    public void AddItem(Long id, HttpSession session) {
        List<CartItem> cart = getCart(session);
        Product product = productService.getProductById(id);
        if(product == null){return;}
        CartItem cartItem = CartItem.builder().product(product).build();
        this.cartItemRepository.save(cartItem);
        cart.add(cartItem);
        session.setAttribute("cart", cart);
    }

    public List<CartItem> getCartItems() {
        return this.cartItemRepository.findAll();
    }

    public List<CartItem> getCart(HttpSession session) {
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        if(cart == null){
            cart = new ArrayList<>();
        }
        return cart;
    }
}
