package pl.sda.administraction.itAdministrator;

import pl.sda.EmployeesEnum;

public class ItAdministrator extends AbstractItAdministrator {

    public ItAdministrator(String name, String surname, String ID) {
        super(name, surname, ID);
        this.employee = EmployeesEnum.IT_ADMINISTRATOR;
    }

    @Override
    public double salaryCalculation() {
        return (basic*multiplier) + administrationBonus + functionalAddition;
    }
}
