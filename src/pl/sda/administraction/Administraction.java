package pl.sda.administraction;

import pl.sda.AbstractEmployees;

public abstract class Administraction extends AbstractEmployees {

    protected static final int administrationBonus = 700;


    public Administraction(String name, String surname, String ID) {
        super(name, surname, ID);
    }
}
