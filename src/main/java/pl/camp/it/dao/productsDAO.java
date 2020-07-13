package pl.camp.it.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pl.camp.it.App;
import pl.camp.it.model.Products;
import pl.camp.it.model.ProductsBrakKategori;

import java.util.List;

public class productsDAO implements iproductsDAO {

    @Override

    public  void saveProductsToDatabase(Products products){

        Session session = App.sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(products);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }

    }

    @Override

    public  void saveProductsBrakKategoriiToDatabase(ProductsBrakKategori productsBrakKategori){

        Session session = App.sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(productsBrakKategori);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }

    }

    @Override
    public Products getProductByIdName(String nameProduct){
        Session session = App.sessionFactory.openSession();
        Query<Products> query = session.createQuery("FROM pl.camp.it.model.Products, pl.camp.it.model.ProductsBrakKategorii where id = " + nameProduct);
        Products products = query.getSingleResult();
        session.close();
        return products;
    }
    @Override
    public List<Products> getAllProducts(){
        Session session = App.sessionFactory.openSession();
        Query<Products> query =session.createQuery("FROM pl.camp.it.model.Products, pl.camp.it.model.ProductsBrakKategorii");
        List<Products> result =query.getResultList();
        session.close();
        return result;
    }
}
