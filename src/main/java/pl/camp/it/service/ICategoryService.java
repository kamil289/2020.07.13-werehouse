package pl.camp.it.service;

import pl.camp.it.model.Category;

import java.util.List;

public interface ICategoryService {

    void saveCategory(String categoryName);
    List<Category> getCategories();
    CategoryService getCategoryServiceUpgrade();
}
