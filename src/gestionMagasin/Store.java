package gestionMagasin;


import java.util.ArrayList;
import java.util.List;
import product.FoodProduct;


public class Store {
    private int id;
    private String address;
    private int capacity;
    private List<FoodProduct> products;


    public Store(int id, String address, int capacity) {
        this.id = id;
        this.address = address;
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<FoodProduct> getProducts() {
        return products;
    }


    public boolean addProduct(FoodProduct product) {

        if ( products.size() > capacity){
            System.out.println("Full Capacity");
            return false;
        }

        if ( products.contains(product)){
            System.out.println("Product already exists");
            return false;
        }
        products.add(product);
        return true;
    }

    public boolean removeProduct(int productId) {
        for (FoodProduct product : products) {
            if (product.getId() == productId) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    public    int totalProducts() {
        return  products.size();
    }

    public String isProductInStore(FoodProduct product) {
        for (FoodProduct p : products) {
            if (p != product && p.equals(product)) {  // Skip the same object but check equality
                return "Product exists in Store!";
            }
        }
        return "New Product!";
    }


    public String  isProductInStore2(FoodProduct product1, FoodProduct product2) {
        return product1.equals(product2) ? "Product exists in Store!" : "New Product!";
    }


    public  String searchForAproduct(FoodProduct product) {
        // there is a little questions here whitch is when i create a new product and set it same values as the previous products in teh list teh
        //methdo will display yes while i dont yet add it ot teh store so i think that i must test first if oroduct exist in store or not
        // and if  will do it i will direclty use teh isProductInStore2 for both  existing products and search
        return  products.contains(product) ? "Yes" : " Product Not FOund !";
    }

    public  String removeProductFromStore(FoodProduct product) {
        return  products.remove(product) ? "Product Removed Succesfully" : " Product Not Removed  !";
    }



    public static Store findStoreWithMostProducts(List<Store> stores) {
        if (stores == null || stores.isEmpty()) {
            System.out.println("No stores to compare.");
            return null;  // Handle empty list case
        }

        Store storeWithMostProducts = stores.get(0);
        for (Store store : stores) {
            if (store.products.size() > storeWithMostProducts.products.size()) {
                storeWithMostProducts = store;
            }
        }

        return storeWithMostProducts;
    }



    @Override
    public String toString() {
        return "gestionMagasin.Store{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                ", products=" + products +
                '}';
    }
}
