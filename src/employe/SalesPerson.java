package employe;

public class SalesPerson extends  Employe{


    private String saleRate;

    public SalesPerson(String saleRate) {
        this.saleRate = saleRate;
    }

    public SalesPerson(int id, String name, int address, int numberOfHoursPerMonth, String saleRate) {
        super(id, name, address, numberOfHoursPerMonth);
        this.saleRate = saleRate;
    }

    public String getSaleRate() {
        return saleRate;

    }
    public void setSaleRate(String saleRate) {
        this.saleRate = saleRate;

    }
}
