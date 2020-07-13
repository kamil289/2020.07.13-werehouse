package pl.camp.it.model;

import javax.persistence.*;

@Entity(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String categoryName;
    private double delate;
    @OneToOne(cascade = CascadeType.ALL)
    private Products products;
    @OneToOne(cascade = CascadeType.ALL)
    private ProductsBrakKategori productsBrakKategori;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getDelate() {
        return delate;
    }

    public void setDelate(double delate) {
        this.delate = delate;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public ProductsBrakKategori getProductsBrakKategori() {
        return productsBrakKategori;
    }

    public void setProductsBrakKategori(ProductsBrakKategori productsBrakKategori) {
        this.productsBrakKategori = productsBrakKategori;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", delate=" + delate +
                ", products=" + products +
                ", productsBrakKategori=" + productsBrakKategori +
                '}';
    }
}
