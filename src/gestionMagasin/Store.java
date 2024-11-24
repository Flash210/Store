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
        if (products.size() < capacity) {
            products.add(product);
            return true;
        } else {
            System.out.println("full capacity!");
            return false;
        }
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

    public boolean isProductInStore(FoodProduct product1, FoodProduct product2) {
        return product1.equals(product2);
    }

    public boolean isProductInStore2(FoodProduct product1, FoodProduct product2) {
        return product1.equals(product2);
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
