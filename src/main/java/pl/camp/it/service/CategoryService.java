package pl.camp.it.service;


import pl.camp.it.dao.IcategoryDAO;
import pl.camp.it.model.Category;
import pl.camp.it.model.Products;
import pl.camp.it.dao.categoryDAO;

import java.util.List;

public class CategoryService implements ICategoryService {

    static IcategoryDAO categoryDAO =new categoryDAO();

    private List<Category> categories;
    private static final CategoryService categoryService = new CategoryService();

    public List<Category> getCategories() {
        return this.categories;
    }

    public CategoryService getCategoryService() {
        categories = categoryDAO.getAllCategory();
        return categoryService;
    }



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
    @Override
    public CategoryService getCategoryServiceUpgrade() {
        categories = categoryDAO.getAllCategory();
        return getCategoryServiceUpgrade();

    }


}
