package pl.sda.administraction.chiefAccountant;

import pl.sda.EmployeesEnum;

public class ChiefAccountant extends AbstractChiefAccountant{


    public ChiefAccountant(String name, String surname, String ID) {
        super(name, surname, ID);
        this.employee = EmployeesEnum.CHIEF_ACCOUNTANT;
    }

    @Override
    public double salaryCalculation() {
        return (basic*multiplier) + administrationBonus + functionalAddition;
    }
}
