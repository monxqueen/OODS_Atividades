package com.company;

public enum CosmeticType {
    OLHOS_LABIOS("Olhos e lábios"),
    TRATAMENTO_FACIL("Tratamento fácil"),
    MAOS_PES("Mãos e pés"),
    CABELOS_UNHAS("Cabelos e unhas");

    private String description;

    CosmeticType(String description){
        this.description = description;
    }

    public String getCosmeticTypeDescription(){
        return description;
    }
}
