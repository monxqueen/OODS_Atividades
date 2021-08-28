package com.company;

import java.text.DecimalFormat;
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
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");

        for(Sale sale : saleArray) {
            DecimalFormat df = new DecimalFormat("0.00");

            System.out.println("CPF do Cliente: " + sale.getClient().getCpf());
            System.out.println("Valor total: R$" + df.format(sale.getTotalValue()));
            System.out.println("Lista de produtos: ");
            sale.getProducts().list();

            System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
        }
    }
}
