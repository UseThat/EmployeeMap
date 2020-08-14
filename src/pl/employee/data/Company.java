package pl.employee.data;

import pl.employee.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String, Employee> company = new HashMap<>();

    public void addEmployee(String firstName, String lastName, double salary){
        company.put(firstName + " " + lastName, new Employee(firstName, lastName, salary));
        System.out.println("Employee added: "+company.get(firstName + " " + lastName));
    }

    public void removeEmployee(String key){
        company.remove(key);
        if(company.get(key) == null){
            System.out.println("Employee "+ key + " removed");
        }else{
            System.out.println("Problem with removing employee");
        }
    }

    public void getListOfEmployees(){
    }

}
