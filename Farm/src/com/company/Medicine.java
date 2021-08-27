package com.company;

import java.util.Date;

public class Medicine extends Product {
    public Medicine(float price, String description, int stock, Date validate, Provider provider) {
        super(price, description, stock, 20, validate, provider);
    }
}
