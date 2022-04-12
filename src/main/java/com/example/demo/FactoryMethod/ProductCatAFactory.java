package com.example.demo.FactoryMethod;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProductCatAFactory extends ProductFactory {

    @Override
    ProductCatA createProduct(String name, double price) {
        ProductCatA newProductCatA = new ProductCatA(name,price);
        return newProductCatA;
    }
}
