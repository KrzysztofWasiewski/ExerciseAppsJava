package Arithmetics;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Kris on 2017-08-03.
 */
public class CanYouMultiply {

    public int multiplier(int a, int b) {

        int product = a * b;

        return product;

    }

    public void skillCheck() {

        Scanner sc = new Scanner(System.in);

        Random rd = new Random();

        boolean exit = false;

        int number1 = rd.nextInt(9);
        int number2 = rd.nextInt(9);
        int result = multiplier(number1, number2);


        while (exit == false) {

            System.out.println("What is the product of multiplication of " + number1 + " and " + number2 + " ?");

            int answer = sc.nextInt();

            if (answer == result) {

                System.out.println("Very good!");
                System.out.println("See you soon");

                exit = true;
            }
        }

        System.exit(0);
        System.out.flush();

    }
}