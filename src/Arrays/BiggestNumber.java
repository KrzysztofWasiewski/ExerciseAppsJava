package Arrays;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-08.
 */
public class BiggestNumber {

    Scanner sc = new Scanner(System.in);

    public void showBiggest() {

        System.out.println("How many number would you like to type?");

        int howManyNumbers = sc.nextInt();

        int[] numbers = new int[howManyNumbers];

        for (int i = 0; i < howManyNumbers; i++) {

            System.out.println("Please type a number");

            int number = sc.nextInt();

            numbers[i] = number;
        }

        int biggestNumber = numbers[0];

        for (int i = 1; i < howManyNumbers; i++) {

            if (biggestNumber < numbers[i]) {

                biggestNumber = numbers[i];

            }



        }

        System.out.println("The biggest number in the given collection is: " + biggestNumber);

    }
}
