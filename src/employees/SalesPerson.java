package employees;


public class SalesPerson extends Employe {
    private double salesRate;



    public SalesPerson(int id, String name, String address, int numberOfHoursPerMonth, double salesRate) {

        super.id=id;
        super.name=name;
        super.address=address;
        super.numberOfHoursPerMonth=numberOfHoursPerMonth;


        this.salesRate = salesRate;
    }


    @Override
    public double calculateSalary() {
        return 450 * salesRate;
    }
}