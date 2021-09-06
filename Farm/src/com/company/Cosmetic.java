package com.company;


import java.util.Date;

public class Cosmetic extends Product {
    public Cosmetic(float price, String description, int stock, Date validate, Provider provider, String type) {
        super(price, description, stock, 20, validate, provider, type);
    }

    @Override
    public void setDiscount_max(float discount_max) throws Exception {
        if(discount_max > 20) {
            throw new Exception("Desconto para Cosmético inválido.");
        }
        super.setDiscount_max(discount_max);
    }
}
