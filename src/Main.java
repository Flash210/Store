import gestionMagasin.Store;
import product.FoodProduct;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.




        FoodProduct p1 = new FoodProduct(1021,"Milk and Delight ","",0,"");

//        product.FoodProduct p2 = new product.FoodProduct(2510,"Yogurst and Vitalait ","",0,"");
//
//            product.FoodProduct p3 = new product.FoodProduct(3250,"Tomato ","Sicam ",1200,"");
//
//      System.out.println(p1.toString());
//          System.out.println(p2.toString());
//          System.out.println(p3.toString());
//
//          p1.setPrice(0.700);
//          System.out.println(p1.getPrice());
//
//          p1.setBrand("Milk ");
//          p2.setLabel("Vitalait ");
//          p2.setPrice(1.450);
//
//          System.out.println("*********After Modification  ********");
//          System.out.println(p1.toString());
//          System.out.println(p2.toString());
//          System.out.println(p3.toString());
//
//
//          p1.setExpireDate("2024/12/11");
//          p2.setExpireDate("2024/12/01");
//          p3.setExpireDate("2025/01/11");
//
//          System.out.println("******** Products after exipiration modification ");
//
//          System.out.println(p1.toString());
//          System.out.println(p2.toString());
//          System.out.println(p3.toString());




        FoodProduct product1 = new FoodProduct(101, "Milk", "Vitalait", 1.2,"");
        FoodProduct product2 = new FoodProduct(102, "Tomato", "Sicam", 0.8,"");

        // Create a store with a capacity of 5 products
        Store store = new Store(1, "123 Main Street, Horizon City", 5);

        // Add products to the store
        store.addProduct(product1);
        store.addProduct(product2);


        // Display store details
        System.out.println(store.toString());

        // Try to remove a product
        store.removeProduct(101);

        // Display updated store details
        System.out.println(store.toString());

        System.out.println("The total number is "+store.totalProducts());

    }


}