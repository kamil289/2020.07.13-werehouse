package pl.camp.it.gui;

import pl.camp.it.model.Category;
import pl.camp.it.model.Products;
import pl.camp.it.service.CategoryService;
import pl.camp.it.service.ProductService;

import javax.persistence.Id;
import java.util.Scanner;

public class GUI {

    public static CategoryService categoryService = new CategoryService();
    public static ProductService productService = new ProductService();
    public static final Scanner scanner = new Scanner(System.in);

    public static void showMainMenu() {
        System.out.println("1. Kategorie Produktów");
        System.out.println("2. Produkty");
        System.out.println("3. Exit");

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
        System.out.println("1. Wpisz Kategorie");
        System.out.println("2. Wpisz Wybrana Kategorie po Id");
        System.out.println("3. Dodaj Kategorie");
        System.out.println("4. Usuń Kategorie");
        System.out.println("5. Powrót");

        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                showCategoryBETA();
                break;
            case "2":
                //showProductsByCategoryId();
                break;
            case "3":
                //addCategoryUpgrade();
                break;
            case "4":
                //Brak metody;
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
        System.out.println("1. Wypisz Produkt po Id Kategorii");
        System.out.println("2. Wypisz Wszystkie Produkty");
        System.out.println("3. Dodaj Produkt");
        System.out.println("4. Usuń Produkt");
        System.out.println("5. Powrót");

        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                //showProductsByCategory();
                break;
            case "2":
                //showProducts();
                break;
            case "3":
               // addProductUpgrade();
                break;
            case "4":
                //addProductUpgrade();
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


    public static void showCategoryBETA(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Id Kategorii");
        String category = scanner.nextLine();


        categoryService.generateCategory(category);
        System.out.println("Z!");

        showMainMenu();


    }



}
