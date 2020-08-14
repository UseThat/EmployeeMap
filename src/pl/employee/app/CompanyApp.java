package pl.employee.app;

import pl.employee.data.Company;
import pl.employee.enums.ChooseList;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String []args){
        Company amrest = new Company();
        System.out.println("Welcome in aplication Amrest Company:");

        int choose;
        do{
            printChooseList();

            choose = getInt();
            try{
            switch (ChooseList.values()[choose]) {
                case EXIT:
                    System.out.println("Cya");
                    scanner.close();
                    break;
                case ADD:


                default:
                    System.out.println("We don't have that option!");
            }
            }catch(IndexOutOfBoundsException ex){
                    System.out.println("Incorrect value it should be 0-3");
            }


        }while(ChooseList.EXIT.getNumber() != choose);



    }


    public static void printChooseList(){
        System.out.println("Please choose what you want to do: ");
        for(ChooseList chooseList : ChooseList.values()){

            System.out.println(chooseList.getNumber() +" - "+chooseList);
        }
    }

    public static int getInt(){
        int value = 5;
        try{
             value = scanner.nextInt();
             scanner.nextLine();
        }catch (InputMismatchException ex){
            System.out.println("this is not number");
            scanner.nextLine();
        }
        return value;
    }

    public static void addEmployee(){
        System.out.println();
    }

}
