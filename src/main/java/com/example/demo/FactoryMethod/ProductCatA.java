package com.example.demo.FactoryMethod;

public class ProductCatA implements IProduct{

    private String name;
    private double price;
    private String subCategory;

    public ProductCatA(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void updatePrice() {

    }

    @Override
    public double getPrice() {
        return 0;
    }

}
