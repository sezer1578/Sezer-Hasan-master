package com.example.Sezer;

/**
 * Created by SEZER on 3.06.2017.
 */

import model.Product;

import java.util.List;

public interface Medify {

    void createProduct(Integer id, String name, Integer price);
    List<Product> findAllProducts();


}
