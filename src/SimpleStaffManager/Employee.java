package SimpleStaffManager;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Kris on 2017-12-09.
 */
public class Employee {

    String firstName;
    String surnmae;
    int age;
    int salary;
    String position;
    int employeeId;
    Date employmentDate;
    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    public String getFirstName() {
        return firstName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurnmae() {
        return surnmae;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {

        this.employmentDate = employmentDate;
    }

    public void setSurnmae(String surnmae) {
        this.surnmae = surnmae;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be lower than 0");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be lower than 0");
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void describeEmployee() {
        System.out.println("Employee id: " + employeeId + "| Name: " + this.firstName + "| Surname: " + this.surnmae + "| Age: " + this.age + "| Salary: " + this.salary + "| Position: " + this.position + "|Phone number: " + this.getPhoneNumber());
    }


}
