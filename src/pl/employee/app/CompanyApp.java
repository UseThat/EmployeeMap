package pl.employee.app;

import pl.employee.data.Company;
import pl.employee.enums.ChooseList;

import java.util.Scanner;

public class CompanyApp {
    public static void main(String []args){
        System.out.println("Welcome in aplication Amrest Company:");
        printChooseList();
        Scanner scanner = new Scanner(System.in);




    }


    public static void printChooseList(){
        for(ChooseList chooseList : ChooseList.values()){
            System.out.println("Please choose what you want to do: ");
            System.out.println(chooseList.getNumber() +" - "+chooseList);
        }
    }

}
