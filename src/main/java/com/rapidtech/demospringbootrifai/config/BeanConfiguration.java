package com.rapidtech.demospringbootrifai.config;

import com.rapidtech.demospringbootrifai.model.Foo;
import com.rapidtech.demospringbootrifai.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Created bean foo...!");
        return foo;
    }

    @Bean
    public Product product(){
        Product product = new Product();
        return product;
    }
}

