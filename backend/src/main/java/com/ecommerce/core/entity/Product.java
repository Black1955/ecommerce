package com.ecommerce.core.entity;



public class Product {
    private final long id;
    private String name;
    private String description;
    private float price;

    public Product( String name, String description, float price) {
        this.id = 123;
         this.name = name;
       this.description = description;
        this.price = price;
    }


    // geters and setters 

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    // getters and setters 

}
