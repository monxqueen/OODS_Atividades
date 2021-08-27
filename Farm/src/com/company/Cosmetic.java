package com.company;

import java.util.Date;

public class Cosmetic extends Product {
    public Cosmetic(float price, String description, int stock, Date validate, Provider provider) {
        super(price, description, stock, 20, validate, provider);
    }
}
