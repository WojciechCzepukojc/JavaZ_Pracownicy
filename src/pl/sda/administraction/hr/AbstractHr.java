package pl.sda.administraction.hr;

import pl.sda.administraction.Administraction;

public abstract class AbstractHr extends Administraction {

    protected static final double multiplier = 1.6;

    public AbstractHr(String name, String surname, String ID) {
        super(name, surname, ID);
    }
}
