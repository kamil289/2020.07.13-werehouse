package pl.camp.it;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static void main(String[] args) {
        System.out.println("cos");
    }
}
