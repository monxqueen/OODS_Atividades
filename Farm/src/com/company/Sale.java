package com.company;

import java.util.ArrayList;

public class Sale {
    private ArrayList<ProductSale> products;
    private Client client;
    private float totalValue;

    public Sale(ArrayList<ProductSale> products, Client client) {
        this.products = products;
        this.client = client;
        this.totalValue = calculateTotalSales(products);
    }

    public ArrayList<ProductSale> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductSale> products) {
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

    private float calculateTotalSales(ArrayList<ProductSale> products) {
        float totalVal = 0;

        for(ProductSale p : products) {
            totalVal+= p.getValue();
        }

        return totalVal;
    }


    public void listProducts() {
        System.out.println("============================");
        for(ProductSale product : products) {
            String typeProduct = "";

            if(product.getProduct() instanceof Medicine)
                typeProduct = "Medicamento";
            else if(product.getProduct() instanceof Cosmetic)
                typeProduct = "Cosmético";

            System.out.println("Nome do Produto: " + product.getProduct().getDescription() + " | Tipo: " + typeProduct);
        }
        System.out.println("============================");
    }

}
