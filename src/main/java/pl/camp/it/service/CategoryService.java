package pl.camp.it.service;


import pl.camp.it.dao.IcategoryDAO;
import pl.camp.it.model.Category;
import pl.camp.it.model.Products;
import pl.camp.it.dao.categoryDAO;
import pl.camp.it.service.ProductService;

import java.util.List;
import java.util.Set;

public class CategoryService implements ICategoryService {

    static IcategoryDAO categoryDAO =new categoryDAO();

    @Override
    public void saveCategory(String categoryName){

        Category category = new Category();
        category.setCategoryName(categoryName);

        Products products = new Products();
        products.setProductsName("TV");
        products.setIloscSztuk(111);
        products.setKodKreskowy(234);

        category.getProducts().add(products);

        categoryDAO.saveCategoryToDatabase(category);







    }




}
