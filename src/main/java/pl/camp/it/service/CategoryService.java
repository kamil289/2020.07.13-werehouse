package pl.camp.it.service;

import pl.camp.it.model.Category;
import pl.camp.it.model.Products;
import pl.camp.it.dao.categoryDAO;

public class CategoryService {

    public static void generateCategory(String categoryName) {

        Category category = new Category();
        category.setCategoryName(categoryName);


        Products products = new Products();
        products.setProductsName();
        products.setIloscSztuk();
        products.setKodKreskowy();

        category.setProducts(products);


        categoryDAO.saveCategoryToDatabase(category);
    }


}
