package pl.camp.it.dao;

import pl.camp.it.model.Products;

import java.util.List;

public interface IproductsDAO {

    void saveProductsToDatabase(Products products);

    Products getProductByIdName(int id);

    List<Products> getAllProducts();
    void delateProducts(String products);
    List<Products> getProductByIdName2(String categoryName);
}
