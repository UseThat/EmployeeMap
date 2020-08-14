package pl.employee.app;

import pl.employee.data.Company;

public class CompanyApp {
    public static void main(String []args){
        Company amrest = new Company();
        amrest.addEmployee("Mateusz","Wygoda",5555);
        amrest.getListOfEmployees();
    }
}
