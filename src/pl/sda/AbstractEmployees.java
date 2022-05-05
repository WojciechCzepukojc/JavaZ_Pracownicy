package pl.sda;

public abstract class AbstractEmployees implements SalaryCalculable {


    protected String name;
    protected String surname;
    protected String ID;

    public AbstractEmployees(String name, String surname, String ID) {
        this.name = name;
        this.surname = surname;
        setID(ID);
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setID(String ID) {
        if (ID==null || ID.length() != 5 ){
            throw new IllegalArgumentException("invalid ID");
        }
        this.ID = ID;
    }

    protected EmployeesEnum employee;

    public String getEmployeeName() {
        return employee.getName();
    }


}
