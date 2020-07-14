package pl.camp.it.service;

import pl.camp.it.model.Products;
import pl.camp.it.dao.productsDAO;

import java.util.List;

public class ProductService {

    private static final ProductService productService = new ProductService();
    private static List<Products> products;
    private static productsDAO productsDAO = new productsDAO();


    public static void generateProduct(String categoryName, String productsName,
                                String iloscSztuk, String kodKreskowy){


        Products products = new Products();
        products.setCategoryName(categoryName);
        products.setProductsName(productsName);
        products.setIloscSztuk(Integer.parseInt(iloscSztuk));
        products.setKodKreskowy(Integer.parseInt(kodKreskowy));




        productsDAO.saveProductsToDatabase(products);


    }
}
