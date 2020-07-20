package pl.camp.it.service;

import pl.camp.it.dao.IproductsDAO;
import pl.camp.it.model.Category;
import pl.camp.it.model.Products;
import pl.camp.it.dao.productsDAO;

import java.util.List;

public class ProductService implements IProductService{

    public static final ProductService productService = new ProductService();
    private List<Products> productsList;
    public List<Products> getProdusts() { return this.productsList; }
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
    @Override
    public CategoryService getProductsServiceUpgrade() {
        productsList = productsDAO.getAllProducts();
        return getProductsServiceUpgrade();

    }
}
