package com.company;

import java.util.ArrayList;

public class ListProducts {
    ArrayList<Product> saleProductArray;

    public ListProducts() {
        this.saleProductArray = new ArrayList<Product>();
    }

    public void add (Product product) {
        this.saleProductArray.add(product);
    }

    public void remove(Product product) {
        this.saleProductArray.remove(product);
    }

    public ArrayList<Product> returnListProducts () {
        return saleProductArray;
    }

    public void list() {
        System.out.println("============================");
        for(Product product : saleProductArray) {
            String typeProduct = "";

            if(product instanceof Medicine)
                typeProduct = "Medicamento";
            else if(product instanceof Cosmetic)
                typeProduct = "Cosmético";
            else
                typeProduct = "Produto";


            System.out.println("Nome do Produto: " + product.getDescription() + " | Tipo: " + typeProduct);
        }
        System.out.println("============================");
    }
}
