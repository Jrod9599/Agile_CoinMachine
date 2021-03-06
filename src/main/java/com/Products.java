package com;

public class Products {

    private String id; //needs to be unique
    private String name;
    private String description;
    private double wsalePrice; //cost of item to vending machine company
    private double retailPrice; //price vending machine is using

    public Products(String id, String name, String description, double salePrice, double retailPrice){
        this.id = id;
        this.name = name;
        this.description = description;
        this.wsalePrice  = salePrice;
        this.retailPrice = retailPrice;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWholeSalePrice() {
        return wsalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

}
