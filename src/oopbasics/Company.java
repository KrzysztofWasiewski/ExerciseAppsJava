package pl.wasiewski.oopbasics;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-25.
 */
public class Company {

    Employee[] employees;

    public void putWorkers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees would you like to write?");
        int howMany = sc.nextInt();
        sc.nextLine();
        employees = new Employee[howMany];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Please type name of the employee");
            employees[i] = new Employee();
            employees[i].setName(sc.nextLine());
            System.out.println("Please type surname of the employee");
            employees[i].setSurname(sc.nextLine());
            System.out.println("Please type age of the employee");
            employees[i].setAge(sc.nextInt());
            sc.nextLine();
        }
    }
    public void giveWorkers() {
        for (int i = 0; i < employees.length; i++ ) {
            employees[i].printPersonalData();
        }
    }
}

