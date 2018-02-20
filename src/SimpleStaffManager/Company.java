package SimpleStaffManager;

import java.util.*;

/**
 * Created by Kris on 2017-12-09.
 */
public class Company {

    //przy tym projekcie już widać potrzebę TDD, bo można łatwo się pogubić i ciężko będzie potem szukać błędów

    private String companyName;
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private int numberOfEmployees;

    public Company() {

        companyName = "ITSolutions";
        numberOfEmployees = employees.size();
    }

    public void addEmployee(Employee nextEmployee) {employees.add(nextEmployee);
    }

    public void deleteEmployee(int id) {
//        if (numberOfEmployees == 0) {
//            System.out.println("There are no employees");
//        } else {
            Employee byebyeEmployee = employees.get(id - 1);
            employees.remove(byebyeEmployee.employeeId = 4);
        }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void getAllEmployees() {

        if (numberOfEmployees < 0) {
            System.out.println("There are no employees");
        } else {
            for (Employee emp : employees) {
                emp.describeEmployee();
            }
        }
    }

    public void averageSalary() {
        float avergeSalary = 0;
        if (numberOfEmployees == 0) {
            System.out.println("There are no employees");
        } else {
            for (Employee emp : employees) {
                avergeSalary = avergeSalary + emp.getSalary();
            }
            System.out.println("The average salary in " + companyName + " equals: " + avergeSalary);
        }
    }

    public void averageAge() {
        float avergeAge = 0;
        if (numberOfEmployees == 0) {
            System.out.println("There are no employees");
        } else {
            for (Employee emp : employees) {
                avergeAge = avergeAge + emp.getAge();
            }
            System.out.println("The average age in " + companyName + " equals: " + avergeAge);
        }
    }

    public void highestSalary() {

        if (numberOfEmployees == 0) {
            System.out.println("There are no employees");
        } else {
            Employee employeeWithHighestSalary = employees.get(0); //konstrukcja klasyczna, do przetestowania (o, TDD)
            for (Employee emp : employees) {
                if (emp.getSalary() > employeeWithHighestSalary.getSalary()) {
                    employeeWithHighestSalary = emp;
                }
            }

            System.out.println("The emloyee with the highest salary in " + companyName + " is: " + employeeWithHighestSalary);


        }
    }


}
