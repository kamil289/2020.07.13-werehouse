package pl.camp.it.dao;

import pl.camp.it.model.Products;
import pl.camp.it.model.ProductsBrakKategori;

import java.util.List;

public interface iproductsDAO {

    void saveProductsToDatabase(Products products);
    void saveProductsBrakKategoriiToDatabase(ProductsBrakKategori productsBrakKategori);
    Products getProductByIdName(String nameProduct);
    List<Products> getAllProducts();
}
