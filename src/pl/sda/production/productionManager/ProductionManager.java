package pl.sda.production.productionManager;

import pl.sda.EmployeesEnum;

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