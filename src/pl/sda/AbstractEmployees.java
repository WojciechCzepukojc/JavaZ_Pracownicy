package pl.sda;

public abstract class AbstractEmployees implements SalaryCalculable {


    protected String name;
    protected String surname;
    protected String ID;

    public AbstractEmployees(String name, String surname, String ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getID() {
        return ID;
    }

    protected EmployeesEnum employee;

    public String getEmployeeName() {
        return employee.getName();
    }


}
