package com.joeolapurath.westcoaststorewebsite.controller;

import com.joeolapurath.westcoaststorewebsite.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public String viewAllProducts(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "products";
    }
}
