package product;

public class FoodProduct {

    private int id;
    private String label;
    private String brand;
    private double price;
private  String      expireDate;

    public FoodProduct(int id, String  label, String brand, double price , String expireDate) {
        this.id = id;
        this.label = label;
        this.brand = brand;
        this.price = price;
        this.expireDate = expireDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String  getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product.FoodProduct{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}


