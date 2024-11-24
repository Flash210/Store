package employees;


public class Cashier extends Employe {
    private int cashRegisterNumber;

    public Cashier(int id, String name, String address, int numberOfHoursPerMonth, int cashRegisterNumber) {


        super.id = id;
        super.name = name;
        super.address = address;
        super.numberOfHoursPerMonth = numberOfHoursPerMonth;

        this.cashRegisterNumber = cashRegisterNumber;
    }

    @Override
    public double calculateSalary() {
        double baseSalary = numberOfHoursPerMonth * 5;
        if (numberOfHoursPerMonth > 180) {
            int overtimeHours = numberOfHoursPerMonth - 180;
            baseSalary += overtimeHours * 5 * 0.15;
        }
        return baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cashier{cashRegisterNumber=" + cashRegisterNumber + '}';
    }
}