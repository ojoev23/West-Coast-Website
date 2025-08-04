package com.joeolapurath.westcoaststorewebsite;

import com.joeolapurath.westcoaststorewebsite.model.Product;
import com.joeolapurath.westcoaststorewebsite.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class WestCoastStoreWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(WestCoastStoreWebsiteApplication.class, args);
    }

}


