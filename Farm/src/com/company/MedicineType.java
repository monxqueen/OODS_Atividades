package com.company;

public enum MedicineType {
    BEM_ESTAR("Bem estar"),
    PELE_CABELO_UNHAS("Pele, cabelo, unhas"),
    VISAO("Visão"),
    DIGESTAO("Digestão");

    private String description;

    MedicineType(String description){
        this.description = description;
    }

    public String getMedicineTypeDescription(){
        return description;
    }
}