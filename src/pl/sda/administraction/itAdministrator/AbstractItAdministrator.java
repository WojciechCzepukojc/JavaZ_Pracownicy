package pl.sda.administraction.itAdministrator;

import pl.sda.administraction.Administraction;

public abstract class AbstractItAdministrator extends Administraction {

    protected static final double multiplier = 2.1;
    protected static final int functionalAddition = 800;


    public AbstractItAdministrator(String name, String surname, String ID) {
        super(name, surname, ID);
    }
}
