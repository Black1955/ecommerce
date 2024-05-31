package com.ecommerce.core.entity;



public class OrderItem {
    private final long id;
    private float price;
    private Product product;

    public OrderItem(Product product) {
        this.id = 1;
        this.product = product;
        this.price = product.getPrice();
    }
    long getId() {
        return this.id;
    }
    float getPrice() {
        return this.price;
    }
    void setPrice(float price) {
        this.price = price;
    }
} 
