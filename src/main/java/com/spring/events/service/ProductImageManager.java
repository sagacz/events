package com.spring.events.service;

import com.spring.events.event.ProductRegisteredEvent;
import domain.ProductDto;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ProductImageManager implements ApplicationListener<ProductRegisteredEvent> {

    @Override
    public void onApplicationEvent(ProductRegisteredEvent event) {
        System.out.println("Processing image of: " + event.getProductName());
        System.out.println("The grapics is: " + event.getOtherData());

    }
}
