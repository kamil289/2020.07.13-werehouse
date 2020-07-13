package pl.camp.it.model;

import javax.persistence.*;

@Entity(name = "Products BrakKategori")
public class ProductsBrakKategori {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String categoryName = "Brak Kategorii";
    @Column(nullable = false)
    private String productsName;
    @Column(nullable = false)
    private int iloscSztuk;
    @Column(unique = true, nullable = false)
    private int kodKreskowy;
    private boolean delate;

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

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public void setIloscSztuk(int iloscSztuk) {
        this.iloscSztuk = iloscSztuk;
    }

    public int getKodKreskowy() {
        return kodKreskowy;
    }

    public void setKodKreskowy(int kodKreskowy) {
        this.kodKreskowy = kodKreskowy;
    }

    public boolean isDelate() {
        return delate;
    }

    public void setDelate(boolean delate) {
        this.delate = delate;
    }

    @Override
    public String toString() {
        return "ProductsBrakKategori{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", productsName='" + productsName + '\'' +
                ", iloscSztuk=" + iloscSztuk +
                ", kodKreskowy=" + kodKreskowy +
                ", delate=" + delate +
                '}';
    }
}
