package pl.camp.it.dao;


import pl.camp.it.model.Category;

import java.util.List;

public interface IcategoryDAO {

      void saveCategoryToDatabase(Category category);

      Category getProductByCategoryID(int id);

      List<Category> getAllCategory();

}
