package Arrays;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-07.
 */
public class InUpTo30 {

    Scanner sc = new Scanner(System.in);

    public void arrayupto30() {

        System.out.println("How many numbers would you like to save into an array?");

        int howmany = sc.nextInt();

        if (howmany >= 1 && howmany <= 30) {
            int[] array = new int[howmany];
            for (int i = 0; i < howmany; i++) {
                System.out.println("Please type a number");
                int number = sc.nextInt();
                array[i] = number;
            }

            for (int numberToPrint: array) {
                System.out.println(numberToPrint);
            }

        }

        else {
            System.out.println("The given number exceeds default range (1-30)");
        }

    }
}
