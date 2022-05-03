package pl.sda.production.foreman;

import pl.sda.production.Workers;

public abstract class AbstractForeman extends Workers {

    protected static final double multiplier = 1.6;
    protected static final int functionalAddition = 500;


    public AbstractForeman(String name, String surname, String ID) {
        super(name, surname, ID);
    }
}
