package employe;

public class Manager extends  Employe{

    private  double bonus;


    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(int id, String name, int address, int numberOfHoursPerMonth, double bonus) {
        super(id, name, address, numberOfHoursPerMonth);
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
