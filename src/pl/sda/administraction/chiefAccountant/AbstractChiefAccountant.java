package pl.sda.administraction.chiefAccountant;

import pl.sda.administraction.Administraction;

public abstract class AbstractChiefAccountant extends Administraction {

    protected static final double multiplier = 2.0;
    protected static final int functionalAddition = 800;


    public AbstractChiefAccountant(String name, String surname, String ID) {
        super(name, surname, ID);
    }
}
