package pl.employee.data;

import pl.employee.model.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        Set<String> companySet = company.keySet();
        for (String s : companySet) {
            System.out.println(company.get(s));
        }

    }

    public void getEmployee(String key){
        System.out.println(company.get(key));
    }

}
