package com.company;

import java.util.ArrayList;

import com.company.MedicineType;

import static com.company.util.DateUtil.parseDate;

public class Main {

    public static void main(String[] args) throws Exception {
        //Novo fornecedor
        Provider provider1 = new Provider("Fornecedor");

        //Novo Cliente
        Client client1 = new Client("433.229.200-62");
        Client client2 = new Client("134.751.714-65");

        //Produtos
        Cosmetic cosmetic1 = new Cosmetic(12, "Batom", 12, parseDate("2023-01-01"), provider1, CosmeticType.OLHOS_LABIOS.getCosmeticTypeDescription());
        Medicine medicine1 = new Medicine(4, "Digest Plus", 20, parseDate("2024-10-12"), provider1, MedicineType.DIGESTAO.getMedicineTypeDescription());

//        cosmetic1.setDiscount_max(25);

        //Produtos para a venda
        ProductSale cosmeticSale = new ProductSale(cosmetic1, 10);
        ProductSale medicineSale = new ProductSale(medicine1, 10);

        //Lista para a primeira venda
        ArrayList<ProductSale> listProductsToSale = new ArrayList();
        listProductsToSale.add(cosmeticSale);
        listProductsToSale.add(medicineSale);

        //Segunda a venda
        ArrayList<ProductSale> productsToSale2 = new ArrayList();
        productsToSale2.add(cosmeticSale);


        //Cadastrando uma venda
        Sale sale = new Sale(listProductsToSale, client1);

        //Cadastrando outra venda
        Sale sale2 = new Sale(productsToSale2, client2);

        //Lista de vendas
        ListSale listSale = new ListSale();
        listSale.add(sale);
        listSale.add(sale2);
        listSale.list();

    }
}
