package pl.sda.production;

import pl.sda.AbstractEmployees;

public abstract class Workers extends AbstractEmployees {

    protected static final int workersBonus = 500;



    public Workers(String name, String surname, String ID) {
        super(name, surname, ID);
    }
}
