package SimpleStaffManager;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kris on 2017-12-10.
 */
public class StaffManager {

    private Scanner sc;
    private Company company;
    private int idCounter;

    public StaffManager() {
        sc = new Scanner(System.in);
        this.company = new Company();
        idCounter = 1;
    }


    public void start() {
        boolean exit = false;


        while (exit == false) { //TODO add a menu method

            System.out.println("Welcome to " + company.getCompanyName() + "'s Staff Manager");
            System.out.println("[1] Add a new employee");
            System.out.println("[2] Remove an employee");
            System.out.println("[3] SHow whole staff");
            System.out.println("[0] EXIT");
            int option = sc.nextInt();


            switch (option) {
                case 1: {
                    addEmployeeToMyCompany(); // lokalna metoda
                    idCounter++;
                    break;
                }
                case 2: {
                    deleteEmployeeFromMyCompany();
                    break;
                }
                case 3: {
                    printAllEmployees();
                    break;
                }
                case 0: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("There's no such option. Please try again.");
                    break;
                }
            }
        }

    }

    public void addEmployeeToMyCompany() {
        Employee nextEmp = new Employee();
        System.out.println("Type a name");
        nextEmp.setFirstName(sc.next()); //TODO add a universal  userInput method

        System.out.println("Type a surname: ");
        nextEmp.setSurnmae(sc.next());

        System.out.println("Type the age: ");
        nextEmp.setAge(sc.nextInt());
        sc.nextLine();

        System.out.println("Type salary");
        nextEmp.setSalary(sc.nextInt());
        sc.nextLine();

        System.out.println("Please type employee's position");
        nextEmp.setPosition(sc.nextLine());

        do {
            System.out.println("Please type the date of employment (DD-MM-YYYY format"); //Should i make a date, or maybe
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            try {
                nextEmp.setEmploymentDate(sdf.parse(sc.nextLine()));
            } catch (ParseException e) {
                System.out.println("Incorrect date format. Please try again");
            }


        } while (nextEmp.getEmploymentDate() == null);

        do {
            System.out.println("Please type phone number (xxx-xxx-xxx format)");
            Pattern phonePattern = Pattern.compile("[5678]+[0-9]{2}-[0-9]{3}-[0-9]{3}");
            String phoneNumber = sc.nextLine();
            Matcher phoneMatcher = phonePattern.matcher(phoneNumber);
            if (phoneMatcher.matches() == true) {
                nextEmp.setPhoneNumber(phoneNumber);
            } else {
                System.out.println("Incorrect phone number, please try again");
            }
        }
        while (nextEmp.getPhoneNumber() == null);

        nextEmp.setEmployeeId(idCounter);
        company.addEmployee(nextEmp);
    }

    public void deleteEmployeeFromMyCompany() {

        System.out.println("Please type the ID number of the employee you would like to remove:");
        int idBye = sc.nextInt();
        company.deleteEmployee(idBye); //logikasuwania oparta o comparable lub compare, co by usuwac wg nazwsiak, lub po podaniu id.
    }

    public void printAllEmployees() {
        company.getAllEmployees();


    }
}

