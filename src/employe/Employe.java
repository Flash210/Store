package employe;

public class Employe {

    private  int id;
    private  String name;
    private  int address;
    private  int numberOfHoursPerMonth;


    public Employe() {
    }

    public Employe(int id, String name, int address, int numberOfHoursPerMonth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numberOfHoursPerMonth = numberOfHoursPerMonth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getNumberOfHoursPerMonth() {
        return numberOfHoursPerMonth;
    }

    public void setNumberOfHoursPerMonth(int numberOfHoursPerMonth) {
        this.numberOfHoursPerMonth = numberOfHoursPerMonth;
    }
}
