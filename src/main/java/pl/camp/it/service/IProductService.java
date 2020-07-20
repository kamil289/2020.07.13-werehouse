package pl.camp.it.service;

import pl.camp.it.model.Products;

import java.util.List;

public interface IProductService {
    void generateProduct(String categoryName, String productsName,
                         String iloscSztuk, String kodKreskowy);
    CategoryService getProductsServiceUpgrade();
    List<Products> getProdusts();


}
