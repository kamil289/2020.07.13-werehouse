package pl.camp.it.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pl.camp.it.App;
import pl.camp.it.model.Category;

import java.util.List;

public interface IcategoryDAO {


    public  void saveCategoryToDatabase(Category category);

    public    Category getProductByCategoryID(int id);

    public  List<Category> getAllCategory();
}
