package Arithmetics;

import java.util.Scanner;

/**
 * Created by Kris on 2017-08-02.
 */
public class TriangleCheck {

    Scanner keyboard = new Scanner(System.in);

    public void triangleCheck() {

        System.out.println("Please type the length of the triangle's first side:");

        int sideA = keyboard.nextInt();

        System.out.println("Please type the length of the triangle's second side:");

        int sideB = keyboard.nextInt();

        System.out.println("Please type the length of the triangle's third side:");

        int sideC = keyboard.nextInt();

        if ((((sideA + sideB) > sideC) && ((sideA + sideC) > sideC)) && ((sideB + sideC) > sideB)) {

            double p = (sideA+sideB+sideC)/2;

            double triangleArea = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));

            System.out.println("It is possible to build a triangle with the given sides.");

            System.out.println("This triangle's area will be " + triangleArea);

        }

        else {

            System.out.println("You cannot build a triangle with the given sides.");
        }
    }
}
