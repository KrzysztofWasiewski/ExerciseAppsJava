package Arithmetics;

/**
 * Created by Kris on 2017-12-09.
 */
public class ArithemticsApp {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.setPoleRadius(-2);
        System.out.println(c.circumference());
        System.out.println(c.pole());
    }

}
