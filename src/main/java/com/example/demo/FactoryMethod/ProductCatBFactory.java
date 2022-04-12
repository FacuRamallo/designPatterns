package com.example.demo.FactoryMethod;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProductCatBFactory extends ProductFactory{

    @Override
    ProductCatB createProduct(String name, double price) {
        return new ProductCatB(name, price);
    }
}
