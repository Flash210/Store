import gestionMagasin.Store;
import product.FoodProduct;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

       //  labThree();

        labFour();









    }

    public  static void labFour() {


             Store st1=new Store(1,"Carefour","City Center");
             Store st2=new Store(2,"Monoprix","Manzeh 6" );




    }


   public static  void labThree(){



        FoodProduct p1 = new FoodProduct(1021, "Milk and Delight ", "", 0, "");
        FoodProduct p2 = new FoodProduct(1021, "Milk and Delight ", "", 0, "");
        FoodProduct p3 = new FoodProduct(1023, "Milk and Delight ", "", 0, "");


        Store store1 = new Store(1, "01", "SOusse",30);

        store1.addProduct(p1);
        store1.addProduct(p2);

        System.out.println("Compare method two "+store1.isProductInStore2(p1, p2));
        System.out.println("Compare method one  "+store1.isProductInStore(p1));

        System.out.println(store1.searchForAproduct(p3));


        Store store2 = new Store(2, "011", "Tunis",30);
        FoodProduct pp1 = new FoodProduct(1021, "Milk and Delight ", "", 0, "");
        FoodProduct pp2 = new FoodProduct(1021, "Milk and Delight ", "", 0, "");
        FoodProduct pp3 = new FoodProduct(1021, "Milk and Delight ", "", 0, "");

        store2.addProduct(pp1);

        store2.addProduct(pp2);
        store2.addProduct(pp3);


        List<Store> storesList = new ArrayList<>();

        storesList.add(store2);
        storesList.add(store1);

//System.out.println(store1.removeProductFromStore(p1));

        Store storeWithMostProducts= Store.findStoreWithMostProducts(storesList);
        System.out.println("The store with most product is : ID= "+storeWithMostProducts.getId());

    }

}