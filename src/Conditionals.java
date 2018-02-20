/**
 * Mastering the use of conditionals & algorithms. Initial variables are predefined.
 * Created by Kris on 2018-02-20.
 */
public class Conditionals {

    static double x = 5, y = 10, z = 15;

    public static void main(String[] args) {

        if (x > y) {
            System.out.println(x + " is bigger than " + y);
        } else {
            System.out.println(x + " is smaller than " + y);
        }

        boolean v = (!(3 * x == z + 1)) ? true : false;
        System.out.println(v);


        String s = Math.pow(y, 2) == x * Math.pow(x, 2) ? "is even" : "is not even";

        System.out.println(s);


    }
}

