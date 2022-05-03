package pl.sda;

public class EmployesMain {

    public static void main(String[] args) {


        AbstractEmployees e1 = new ProductionManager("Grzegorz", "Chybalski",  "11001");
        AbstractEmployees e2 = new Foreman("Roman", "Zawada", "11286");
        AbstractEmployees e3 = new ProductionEmployee("Józef", "Borewicz", "11358");







        AbstractEmployees[] array = new AbstractEmployees[10];
        array[0] = e1;
        array[1] = e2;
        array[2] = e3;




    }
}
