package Arithmetics;

import java.util.Scanner;

/**
 * Created by Kris on 2017-08-03.
 */
public class Factorial {

    public void factorial() {

        int factorial = 1;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please type the integer number for which you would like to calculate factorial: ");

        int input = keyboard.nextInt();

        for (int i = 1; i <= input; i++ ) {

            factorial = factorial * i;

        }

        System.out.println("The factorial of " + input + " is " + factorial);


    }
}
