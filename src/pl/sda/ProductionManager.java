package pl.sda;

public class ProductionManager extends AbstractProductionManager {



    public ProductionManager(String name, String surname, String ID) {
        super(name, surname, ID);
        this.employee = EmployeesEnum.PRODUCTION_MANAGER;
    }


    @Override
    public double salaryCalculation() {
        return (basic * multiplier) + workersBonus + functionalAddition ;
    }
}