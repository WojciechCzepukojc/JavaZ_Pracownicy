package pl.sda.production.productionManager;

import pl.sda.production.Workers;

public abstract class AbstractProductionManager extends Workers {

    protected static final double multiplier = 2.0;
    protected static final int functionalAddition = 700;


    public AbstractProductionManager(String name, String surname, String ID) {
        super(name, surname, ID);
    }
}
