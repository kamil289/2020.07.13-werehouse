package pl.camp.it.service;

import pl.camp.it.dao.IproductsDAO;
import pl.camp.it.model.Products;
import pl.camp.it.dao.productsDAO;

import java.util.List;

public class ProductService implements IProductService{

    public static final ProductService productService = new ProductService();
    public static List<Products> products;
    public static IproductsDAO productsDAO = new productsDAO();


    public  void generateProduct(String categoryName, String productsName,
                                String iloscSztuk, String kodKreskowy){


        Products products = new Products();
        products.setCategoryName(categoryName);
        products.setProductsName(productsName);
        products.setIloscSztuk(Integer.parseInt(iloscSztuk));
        products.setKodKreskowy(Integer.parseInt(kodKreskowy));




        productsDAO.saveProductsToDatabase(products);


    }
}
