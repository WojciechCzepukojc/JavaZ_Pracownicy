package pl.sda;

public class ProductionEmployee extends AbstractProductionEmployee {


    public ProductionEmployee(String name, String surname, String ID) {
        super(name, surname, ID);
        this.employee = EmployeesEnum.PRODUCTION_EMPLOYEE;
    }

    @Override
    public double salaryCalculation() {
        return (basic*multiplier) + workersBonus;
    }
}
