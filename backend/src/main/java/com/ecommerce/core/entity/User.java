package com.ecommerce.core.entity;

import java.util.UUID;

public class User {
    private final UUID id;
    private String email;
    private String password;
    private String name;
    
   public User(String email, String password, String name) {
        this.id = UUID.randomUUID();
        this.email = email;
        this.name = name;
        this.password = password;
    }
    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }
}
