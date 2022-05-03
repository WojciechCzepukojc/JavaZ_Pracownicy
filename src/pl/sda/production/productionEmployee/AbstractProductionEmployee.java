package pl.sda.production.productionEmployee;

import pl.sda.production.Workers;

public abstract class AbstractProductionEmployee extends Workers {

    protected static final double multiplier = 1.2;


    public AbstractProductionEmployee(String name, String surname, String ID) {
        super(name, surname, ID);
    }
}
