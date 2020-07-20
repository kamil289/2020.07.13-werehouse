package pl.camp.it.dao;

import pl.camp.it.model.Category;

import java.util.List;

public interface IcategoryDAO {


    public  void saveCategoryToDatabase(Category category);

    public    Category getProductByCategoryID(int id);

    public  List<Category> getAllCategory();

    void delateCustomer(String category);
}
