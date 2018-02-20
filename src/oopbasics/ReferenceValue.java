package pl.wasiewski.oopbasics;

/**
 * Created by Kris on 2017-10-25.
 */
public class ReferenceValue {

    public static void main(String[] args) {

        Employee l = e123();
        e12(l);
        e1(l);

        Employee e1 = new Employee();
        Employee e2 = e1;
        e2.setAge(14);
        System.out.println(e1.getAge()); //here we can see that java is a pass by value language, and so by changing
        // fields in a copy of the object reference value, we change the value in the "original". We manipulate same object at the same time, as the references
        // are pointing to the same object;




    }

    public static Employee e123() {
        Employee e1 = new Employee();
        return e1;
    }

    public static void e1(Employee e) {

        System.out.println(e.getAge());
    }

    public static void e12 (Employee e) {

        Employee emm = e;
        emm.setAge(14);
        System.out.println(emm.getAge());

        }
    }

