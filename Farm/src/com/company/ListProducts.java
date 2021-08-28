package com.company;

import java.util.ArrayList;

public class ListProducts {
    ArrayList<ProductSale> saleProductArray;

    public ListProducts() {
        this.saleProductArray = new ArrayList<ProductSale>();
    }

    public void add (ProductSale product) {
        this.saleProductArray.add(product);
    }

    public void remove(ProductSale product) {
        this.saleProductArray.remove(product);
    }

    public ArrayList<ProductSale> returnListProducts () {
        return saleProductArray;
    }

    public void list() {
        System.out.println("============================");
        for(ProductSale product : saleProductArray) {
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
