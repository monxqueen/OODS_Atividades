package com.company;

import java.util.Date;

import static com.company.util.DateUtil.parseDate;

public class Main {

    public static void main(String[] args)  {

        //Novo fornecedor
        Provider provider1 = new Provider("Fornecedor");

        //Novo Cliente
        Client client1 = new Client("433.229.200-62");

        //Produtos
        Product product1 = new Product(40, "Produto para queda de cabelos", 10, 12, parseDate("2022-09-09"), provider1);
        Cosmetic cosmetic1 = new Cosmetic(12, "Batom", 12, parseDate("2023-01-01"), provider1);
        Medicine medicine1 = new Medicine(4, "Dipirona", 20, parseDate("2024-10-12"), provider1);


        //Lista para a primeira venda
        ListProducts listProductsToSale = new ListProducts();
        listProductsToSale.add(product1);
        listProductsToSale.add(cosmetic1);
        listProductsToSale.add(medicine1);

        //Mostrando os produtos da venda
        listProductsToSale.list();

        //Cadastrando uma venda
        Sale sale = new Sale(listProductsToSale, client1);



        //Lista de vendas
        ListSale listSale = new ListSale();
        listSale.add(sale);
        listSale.list();



    }
}
