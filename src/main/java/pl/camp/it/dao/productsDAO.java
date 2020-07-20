package pl.camp.it.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pl.camp.it.App;
import pl.camp.it.model.Products;

import java.util.List;

public class productsDAO implements IproductsDAO{

    @Override
    public void saveProductsToDatabase(Products products){

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
    public Products getProductByIdName(int id){
        Session session = App.sessionFactory.openSession();
        Query<Products> query = session.createQuery("FROM pl.camp.it.model.Products where id = :id");
        query.setParameter("id", id);
        Products products = query.getSingleResult();
        session.close();
        return products;
    }
    @Override
    public List<Products> getProductByIdName2(String categoryName){
        Session session = App.sessionFactory.openSession();
        Query<Products> query = session.createQuery("FROM pl.camp.it.model.Products where categoryName = :categoryName");
        query.setParameter("categoryName", categoryName);
        List<Products> products = query.getResultList();
        session.close();
        return products;
    }

    @Override
    public List<Products> getAllProducts(){
        Session session = App.sessionFactory.openSession();
        Query<Products> query =session.createQuery("FROM pl.camp.it.model.Products");
        List<Products> result =query.getResultList();
        session.close();
        return result;
    }
    @Override
    public  void delateProducts(String products){
        Session session = App.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.delete(products);
            tx.commit();
        }catch (Exception e){
            if (tx != null){
                tx.rollback();
            }
        }finally {
            session.close();
        }
    }

}
