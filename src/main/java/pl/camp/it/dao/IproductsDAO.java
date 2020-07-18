package pl.camp.it.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pl.camp.it.App;
import pl.camp.it.model.Products;

import java.util.List;

public interface IproductsDAO {

    void saveProductsToDatabase(Products products);

    Products getProductByIdName(int id);

    List<Products> getAllProducts();
}
