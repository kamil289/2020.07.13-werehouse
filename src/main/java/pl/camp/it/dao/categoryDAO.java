package pl.camp.it.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pl.camp.it.App;
import pl.camp.it.model.Category;

import java.util.List;

public class  categoryDAO {



    public static void saveCategoryToDatabase(Category category){

        Session session = App.sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(category);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }

    }



    public static   Category getProductByCategoryID(int id){
        Session session = App.sessionFactory.openSession();
        Query<Category> query = session.createQuery("FROM pl.camp.it.model.Category where id = " + id);
        Category category = query.getSingleResult();
        session.close();
        return category;
    }

    public static List<Category> getAllCategory(){
        Session session = App.sessionFactory.openSession();
        Query<Category> query =session.createQuery("FROM pl.camp.it.model.Category");
        List<Category> result =query.getResultList();
        session.close();
        return result;
    }




}
