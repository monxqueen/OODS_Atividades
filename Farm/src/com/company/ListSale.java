package com.company;

import java.util.ArrayList;

public class ListSale {
    ArrayList<Sale> saleArray;

    public ListSale() {
        this.saleArray = new ArrayList<Sale>();
    }

    public void add (Sale sale) {
        this.saleArray.add(sale);
    }

    public void remove(Sale sale) {
        this.saleArray.remove(sale);
    }

    public void list() {
        for(Sale sale : saleArray) {
            System.out.println("CPF do Cliente: " + sale.getClient().getCpf());
            System.out.println("Lista de produtos: ");
            sale.getProducts().list();
        }
    }
}
