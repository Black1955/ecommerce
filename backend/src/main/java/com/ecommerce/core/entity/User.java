package main.java.com.ecommerce.core.entity;


class User {
    private final long id;
    private String email;
    private String password;
    private String name;
    
   public User(String email, String password, String name) {
        this.id = 1;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public long getId() {
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
