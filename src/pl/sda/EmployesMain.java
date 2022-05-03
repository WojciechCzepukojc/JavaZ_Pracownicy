package pl.sda;

import pl.sda.administraction.chiefAccountant.ChiefAccountant;
import pl.sda.administraction.director.Director;
import pl.sda.administraction.hr.Hr;
import pl.sda.administraction.itAdministrator.ItAdministrator;
import pl.sda.production.foreman.Foreman;
import pl.sda.production.productionEmployee.ProductionEmployee;
import pl.sda.production.productionManager.ProductionManager;

public class EmployesMain {

    public static void main(String[] args) {


        AbstractEmployees e1 = new ProductionManager("Grzegorz", "Chybalski",  "11001");
        AbstractEmployees e2 = new Foreman("Roman", "Zawada", "11286");
        AbstractEmployees e3 = new ProductionEmployee("Józef", "Borewicz", "11358");
        AbstractEmployees e4 = new Director("Andrzej", "Jarkowski", "22036");
        AbstractEmployees e5 = new ChiefAccountant("Malwina", "Radkiewicz", "23854");
        AbstractEmployees e6 = new ItAdministrator("Marek", "Zwolankowski", "25698");
        AbstractEmployees e7 = new Hr("Mariola", "Kozioł", "26369");




        AbstractEmployees[] array = new AbstractEmployees[7];
        array[0] = e1;
        array[1] = e2;
        array[2] = e3;
        array[3] = e4;
        array[4] = e5;
        array[5] = e6;
        array[6] = e7;

        for (AbstractEmployees employee:array){
            System.out.println(" Pracownik " + employee.getName() +" " + employee.getSurname() + " ID: " + employee.getID() + " zatrudniony na stanowisku: " +
                    employee.getEmployeeName() + " otrzymuje miesięczne wynagrodzenie w wysokości " + employee.salaryCalculation() + " PLN");

        }




    }
}
