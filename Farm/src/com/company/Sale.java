package com.company;

import java.util.ArrayList;

public class Sale {
    private ListProducts products;
    private Client client;
    private float totalValue;

    public Sale(ListProducts products, Client client) {
        this.products = products;
        this.client = client;
        this.totalValue = calculateTotalSales(products);
    }

    public ListProducts getProducts() {
        return products;
    }

    public void setProducts(ListProducts products) {
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public float getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(float totalValue) {
        this.totalValue = totalValue;
    }

    private float calculateTotalSales(ListProducts products) {
        float totalVal = 0;

        for(Product p : products.returnListProducts()) {
            float discountedValue  =  p.getPrice() - (p.getPrice() * p.getDiscount_max() / 100);
            totalVal+= discountedValue;
        }

        return totalVal;
    }

}
