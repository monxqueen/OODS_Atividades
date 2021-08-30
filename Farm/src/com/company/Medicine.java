package com.company;

import com.company.exception.DefaultException;

import java.util.Date;

public class Medicine extends Product {
    public Medicine(float price, String description, int stock, Date validate, Provider provider) {
        super(price, description, stock, 10, validate, provider);
    }


    @Override
    public void setDiscount_max(float discount_max) throws DefaultException {
        if(discount_max > 10) {
            throw new DefaultException("Desconto para Cosmético inválido.");
        }
        super.setDiscount_max(discount_max);
    }
}
