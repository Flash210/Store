package employees;

 public abstract  class Employe {

    protected   int id;
    protected  String name;
    protected  String  address;
    protected  int numberOfHoursPerMonth;


    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", hoursPerMonth=" + numberOfHoursPerMonth +
                '}';
    }
}
