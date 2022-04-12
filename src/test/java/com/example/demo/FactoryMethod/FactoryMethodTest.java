package com.example.demo.FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryMethodTest {
    @Test
    void productCreatorOfEachCatFactoryShouldReturnAnInstanceOfTheProductsClass(){
        ProductCatBFactory productCatBFactory= new ProductCatBFactory();
        ProductCatAFactory productCatAFactory= new ProductCatAFactory();

        var productB = productCatBFactory.createProduct("productB", 10.50);
        var productA = productCatAFactory.createProduct("productA", 13.50);

       assertTrue(productB instanceof ProductCatB);
       assertTrue(productA instanceof ProductCatA);
    }

}
