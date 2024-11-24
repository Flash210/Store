package employe;

public class Cashier extends  Employe{


    private double cash;

    public Cashier(double cash) {
        this.cash = cash;
    }

    public Cashier(int id, String name, int address, int numberOfHoursPerMonth, double cash) {
        super(id, name, address, numberOfHoursPerMonth);
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;

    }
}
