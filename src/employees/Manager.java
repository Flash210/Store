package employees;


public class Manager extends Employe {
    private double bonus;

    public Manager(int id, String name, String address, int numberOfHoursPerMonth, double bonus) {


        super.id=id;
        super.name=name;
        super.address=address;

        super.numberOfHoursPerMonth=numberOfHoursPerMonth;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        double baseSalary = numberOfHoursPerMonth * 10;
        if (numberOfHoursPerMonth > 160) {
            int overtimeHours = numberOfHoursPerMonth - 160;
            baseSalary += overtimeHours * 10 * 0.2;
        }
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Manager{bonus=" + bonus + '}';
    }
}