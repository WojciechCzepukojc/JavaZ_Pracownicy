package pl.sda.administraction.director;

import pl.sda.EmployeesEnum;

public class Director extends AbstractDirector{


    public Director(String name, String surname, String ID) {
        super(name, surname, ID);
        this.employee = EmployeesEnum.DIRECTOR;
    }

    @Override
    public double salaryCalculation() {
        return (basic*multiplier) + administrationBonus + functionalAddition;
    }
}
