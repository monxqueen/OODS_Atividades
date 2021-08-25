package com.company;

import java.util.Date;

public class Product {
    private float price;
    private String description;
    private int stock;
    private float discount_max;
    private Date validate;

    public Product(float price, String description, int stock, float discount_max, Date validate) {
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.discount_max = discount_max;
        this.validate = validate;
    }

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

    public void setDiscount_max(float discount_max) {
        this.discount_max = discount_max;
    }

    public Date getValidate() {
        return validate;
    }

    public void setValidate(Date validate) {
        this.validate = validate;
    }
}
