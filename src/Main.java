import exceptions.FullStoreException;
import gestionMagasin.Store;
import product.FoodProduct;


import employees.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

       //  labThree();

       // labFour();









    }

    public  static void labFour() {


        Store carrefour = new Store(1, "Carrefour", "City Center", 100);
        Store monoprix = new Store(2, "Monoprix", "Menzah 6", 100);

        carrefour.addEmployee(new Cashier(1, "Salma", "Tunis", 190, 5));
        carrefour.addEmployee(new Cashier(2, "Sara", "Ariana", 175, 6));
        carrefour.addEmployee(new SalesPerson(3, "Amal", "Marsa", 160, 1.2));
        carrefour.addEmployee(new Manager(4, "Wiem", "Lac2", 170, 500));

        monoprix.addEmployee(new Cashier(5, "Salwa", "Sousse", 185, 3));
        monoprix.addEmployee(new SalesPerson(6, "Lina", "Mahdia", 150, 1.1));
        monoprix.addEmployee(new SalesPerson(7, "Rania", "Bizerte", 180, 1.3));
        monoprix.addEmployee(new SalesPerson(8, "Imen", "Gabes", 140, 1.05));
        monoprix.addEmployee(new Manager(9, "Ameni", "Sfax", 160, 700));

        System.out.println("Carrefour Employees:");
        carrefour.displayEmployeesDetails();
        System.out.println("\nMonoprix Employees:");
        monoprix.displayEmployeesDetails();




    }

//
//   public static  void labThree(){
//
//
//
//        FoodProduct p1 = new FoodProduct(1021, "Milk and Delight ", "", 0, "");
//        FoodProduct p2 = new FoodProduct(1021, "Milk and Delight ", "", 0, "");
//        FoodProduct p3 = new FoodProduct(1023, "Milk and Delight ", "", 0, "");
//
//
//        Store store1 = new Store(1, "01", "SOusse",30);
//
//        store1.addProduct(p1);
//        store1.addProduct(p2);
//
//        System.out.println("Compare method two "+store1.isProductInStore2(p1, p2));
//        System.out.println("Compare method one  "+store1.isProductInStore(p1));
//
//        System.out.println(store1.searchForAproduct(p3));
//
//
//        Store store2 = new Store(2, "011", "Tunis",30);
//        FoodProduct pp1 = new FoodProduct(1021, "Milk and Delight ", "", 0, "");
//        FoodProduct pp2 = new FoodProduct(1021, "Milk and Delight ", "", 0, "");
//        FoodProduct pp3 = new FoodProduct(1021, "Milk and Delight ", "", 0, "");
//
//        store2.addProduct(pp1);
//
//        store2.addProduct(pp2);
//        store2.addProduct(pp3);
//
//
//        List<Store> storesList = new ArrayList<>();
//
//        storesList.add(store2);
//        storesList.add(store1);
//
////System.out.println(store1.removeProductFromStore(p1));
//
//        Store storeWithMostProducts= Store.findStoreWithMostProducts(storesList);
//        System.out.println("The store with most product is : ID= "+storeWithMostProducts.getId());
//
//    }

public static void labThree() {
    Store store = new Store(1, "Small Store", "Downtown", 2);

    FoodProduct p1 = new FoodProduct(101, "Milk", "BrandA", 1.5, "2024-12-31");
    FoodProduct p2 = new FoodProduct(102, "Bread", "BrandB", 0.8, "2024-12-25");
    FoodProduct p3 = new FoodProduct(103, "Eggs", "BrandC", 2.5, "2024-12-20");

//    try {
//        store.addProduct(p1);
//        store.addProduct(p2);
//        store.addProduct(p3); // This should throw an exception
//    } catch (FullStoreException e) {
//        System.out.println(e.getMessage());
//    }

    System.out.println("Total products in store: " + store.totalProducts());
}

}