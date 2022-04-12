package com.example.demo.FactoryMethod;

public class ProductCatB implements IProduct{

    private double price;
    private String name;

    public ProductCatB(String name, double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void updatePrice() {

    }

    @Override
    public double getPrice() {
        return 0;
    }


}
