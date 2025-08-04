package com.joeolapurath.westcoaststorewebsite.controller;

import com.joeolapurath.westcoaststorewebsite.service.CartService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/cart")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("/view")
    public String viewCart(Model model) {
        model.addAttribute(cartService.getCartItems());
        return "cart";
    }

    @PostMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, HttpSession session) {
        cartService.AddItem(id, session);
        return "redirect:/cart/view";
    }

}
