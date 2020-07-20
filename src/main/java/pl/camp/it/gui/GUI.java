package pl.camp.it.gui;

import pl.camp.it.dao.IcategoryDAO;
import pl.camp.it.dao.IproductsDAO;
import pl.camp.it.dao.categoryDAO;
import pl.camp.it.dao.productsDAO;
import pl.camp.it.model.Category;
import pl.camp.it.model.Products;
import pl.camp.it.service.CategoryService;
import pl.camp.it.service.ICategoryService;
import pl.camp.it.service.IProductService;
import pl.camp.it.service.ProductService;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GUI {


    public static ICategoryService categoryService = new CategoryService();
    public static IProductService productService = new ProductService();
    public static IcategoryDAO categoryDAO = new categoryDAO();
    public static IproductsDAO productsDAO = new productsDAO();
    public static final Scanner scanner = new Scanner(System.in);

    public static void showMainMenu() {
        System.out.println("--------------------------------------");
        System.out.println("1. Kategorie Produktów");
        System.out.println("2. Produkty");
        System.out.println("3. Exit");
        System.out.println("--------------------------------------");

        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                showKategorieProduktow();
                break;
            case "2":
                showStockProduktow();
                break;
            case "3":

                System.exit(0);
            default:
                System.out.println("Nieprawidłowy wybór !!");
                showMainMenu();
                break;
        }
    }

    public static void showKategorieProduktow() {
        System.out.println("--------------------------------------");
        System.out.println("1. Wpisz Kategorie");
        System.out.println("2. Wpisz Wybrana Kategorie po Id");
        System.out.println("3. Dodaj Kategorie");
        System.out.println("4. Usuń Kategorie");
        System.out.println("5. Powrót");
        System.out.println("--------------------------------------");

        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                showCategories();
                break;
            case "2":
                showProductsByCategoryId();
                showKategorieProduktow();
                // dorobić żeby pokazywalo liste produktow !!!!
                break;
            case "3":
                saveCategoryUpgrade();
                showKategorieProduktow();
                break;
            case "4":
                delateCategorybyID();
                showKategorieProduktow();
                break;
            case "5":
                showMainMenu();
                break;
            default:
                System.out.println("Nieprawidłowy wybór !!");
                showMainMenu();
                break;
        }
    }

    public static void showStockProduktow() {
        System.out.println("--------------------------------------");
        System.out.println("1. Wypisz Produkt po Id Kategorii");
        System.out.println("2. Wypisz Wszystkie Produkty");
        System.out.println("3. Dodaj Produkt");
        System.out.println("4. Usuń Produkt");
        System.out.println("5. Powrót");
        System.out.println("--------------------------------------");

        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                showProductsByCategory();
                showStockProduktow();
                break;
            case "2":
                showProducts();
                showStockProduktow();
                break;
            case "3":
                saveProductsToCategoryUpgrade();
                showStockProduktow();
                break;
            case "4":
                delateProductbyID();
                showStockProduktow();
                break;
            case "5":
                showMainMenu();
                break;
            default:
                System.out.println("Nieprawidłowy wybór !!");
                showMainMenu();
                break;
        }
    }


    public static void saveCategoryUpgrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe Kategorii");
        String categoryName = scanner.nextLine();


        categoryService.saveCategory(categoryName);

        System.out.println("Kategoria Dodana");

    }

    public static void saveProductsToCategoryUpgrade() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe Kategorii:");
        String categoryName = scanner.nextLine();
        System.out.println("Podaj nazwe Produktu:");
        String productsName = scanner.nextLine();
        System.out.println("Podaj ilość sztuk:");
        String iloscSztuk = scanner.nextLine();
        System.out.println("Podaj kod kreskowy:");
        String kodKreskowy = scanner.nextLine();

        productService.generateProduct(categoryName, productsName, iloscSztuk, kodKreskowy);
        categoryService.saveCategory(categoryName);

        System.out.println("Dodałeś produkt");

    }
    public static void delateCategorybyID(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Id Kategorii:");
        String Id = scanner.nextLine();

        categoryDAO.delateCustomer(Id);

        System.out.println("Usunieto kategorie !!!");
    }


    public static List<Category> showCategories() {


        List <Category> category = categoryDAO.getAllCategory();

        System.out.println("Wypisuje kategorie !!");
        System.out.print(category);

        System.out.println("Wypisano wszystkie kategorie !!");
        showKategorieProduktow();
        return showCategories();

    }
    public static List<Products> showProductsByCategoryId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Id Kategorii:");
        String Id = scanner.nextLine();

        Category category = categoryDAO.getProductByCategoryID(Integer.parseInt(Id));

        System.out.println("Wypisuje produkty z kategorie !!");
        System.out.println(category);
        System.out.println("Wypisano produkty z kategorii !!");

        showKategorieProduktow();
        return showProductsByCategoryId();

    }
    public static List<Products> showProductsByCategory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Id Produktu:");
        String Id = scanner.nextLine();

        Products products = productsDAO.getProductByIdName(Integer.parseInt(Id));

        System.out.println("Wypisuje  Produkty !!");
        System.out.println(products);
        System.out.println("Wypisano produkty z kategorii !!");

        showStockProduktow();
        return showProductsByCategoryId();

    }
    public static List<Products> showProducts() {


        List <Products> products = productsDAO.getAllProducts();

        System.out.println("Wypisuje produkty !!");
        System.out.print(products);

        System.out.println("Wypisano wszystkie produkty !!");
        showStockProduktow();
        return showProducts();

    }
    public static void delateProductbyID(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Id Produktu:");
        String Id = scanner.nextLine();

        productsDAO.delateProducts(Id);

        System.out.println("Usunieto kategorie !!!");
    }





}
