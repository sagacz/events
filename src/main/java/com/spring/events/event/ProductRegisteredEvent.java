package com.spring.events.event;

import org.springframework.context.ApplicationEvent;

public class ProductRegisteredEvent extends ApplicationEvent {
    private final String productName;
    private final String otherData;

    public ProductRegisteredEvent(Object source, String productName, String otherData){
        super(source);
        this.productName = productName;
        this.otherData = otherData;
    }

    public String getProductName() {
        return productName;
    }

    public String getOtherData() {
        return otherData;
    }
}
