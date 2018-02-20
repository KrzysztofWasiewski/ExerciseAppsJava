package Arrays;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-16.
 */
public class EvenIndex {

    public void inputConsole() {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many number would you like to enter?");

        int howMany = sc.nextInt();

        int[] numbers = new int[howMany];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Please enter a number:");

            numbers[i] = sc.nextInt();

        }

        printEvenIndex(numbers);

    }

    public void printEvenIndex(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {

            if (i % 2 == 0) {

                System.out.println(numbers[i]);

            }

        }

    }
}