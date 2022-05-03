package pl.sda;

public class Foreman extends AbstractForeman{



    public Foreman(String name, String surname, String ID) {
        super(name, surname, ID);
        this.employee = EmployeesEnum.FOREMAN;
    }


    @Override
    public double salaryCalculation() {
        return (basic * multiplier) + workersBonus + functionalAddition;
    }
}
