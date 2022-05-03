package pl.sda;

public enum EmployeesEnum {

    DIRECTOR("director"), CHIEF_ACCOUNTANT("chief_accountant"), PRODUCTION_MANAGER("production_manager"), IT_ADMINISTRATOR("it_administrator"),
    PRODUCTION_EMPLOYEE("production_employee"), FOREMAN("foreman"), HR("hr");

    private String name;

    EmployeesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
