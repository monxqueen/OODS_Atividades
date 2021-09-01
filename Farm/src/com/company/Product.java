package com.company;


import java.util.Date;

public abstract class Product {
    private float price;
    private String description;
    private int stock;
    private float discount_max;
    private Date validate;
    private Provider provider;

    public Product(float price, String description, int stock, float discount_max, Date validate, Provider provider) {
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.discount_max = discount_max;
        this.validate = validate;
        this.provider = provider;
    }

    //Getters and setters
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getDiscount_max() {
        return discount_max;
    }

    public void setDiscount_max(float discount_max) throws  Exception {
        this.discount_max = discount_max;
    }

    public Date getValidate() {
        return validate;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public void setValidate(Date validate) {
        this.validate = validate;
    }


    // Metodos
    public void decreaseStock(int value) {
        int newStock = stock - value;

        if(newStock < 0) {
            this.stock = 0;
        } else {
            this.stock = newStock;
        }
    }

    public  void addStock(int value) {
        this.stock = stock + value;
    }

}
