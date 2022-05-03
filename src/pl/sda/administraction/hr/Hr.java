package pl.sda.administraction.hr;

import pl.sda.EmployeesEnum;

public class Hr extends AbstractHr{
    public Hr(String name, String surname, String ID) {
        super(name, surname, ID);
        this.employee = EmployeesEnum.HR;
    }

    @Override
    public double salaryCalculation() {
        return (basic*multiplier) + administrationBonus;
    }
}
