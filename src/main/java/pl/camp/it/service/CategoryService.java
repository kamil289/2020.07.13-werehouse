package pl.camp.it.service;

import pl.camp.it.model.Category;
import pl.camp.it.model.Products;
import pl.camp.it.dao.categoryDAO;

import java.util.List;

public class CategoryService {

    private static List<Category> categories;
    private static final ProductService productService = new ProductService();
    private static List<Products> products;
    private static final CategoryService categoryService = new CategoryService();
    private static categoryDAO categoryDAO = new categoryDAO();

    public static void generateCategory(String categoryName) {

        Category category = new Category();
        category.setCategoryName(categoryName);


        Products products = new Products();
        products.setProductsName(productsName);
        products.setIloscSztuk(iloscSztuk);
        products.setKodKreskowy(kodKreskowy);

        category.setProducts(products);


        categoryDAO.saveCategoryToDatabase(category);

    }


}
