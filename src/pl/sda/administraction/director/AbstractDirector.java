package pl.sda.administraction.director;

import pl.sda.administraction.Administraction;

public abstract class AbstractDirector extends Administraction {

    protected static final double multiplier = 2.5;
    protected static final int functionalAddition = 1000;



    public AbstractDirector(String name, String surname, String ID) {
        super(name, surname, ID);
    }
}
