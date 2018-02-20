package Arrays;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-08.
 */
public class PrintUnevenDigitsSum {

    Scanner sc = new Scanner(System.in);
    String[] inputNumbers = new String[10];


    public void printUnevenDigitsSum9() {

        System.out.println("Please type any 10 integers");

        for (int i = 0; i < 10; i++) {

            inputNumbers[i] = sc.nextLine(); //saving integers into array as strings
        }

        for (int i = 0; i < 10; i++) {

            int digitSum = 0;

            for (int j = 0; j < inputNumbers[i].length(); j++) {

                int digit = inputNumbers[i].charAt(j);

                digit = digit - 48;

                digitSum = digitSum + digit;

            }

            if (digitSum % 2 != 0) {

                System.out.println("The digits' sum of the " + inputNumbers[i] + " equals " + digitSum + ". This sum is uneven" );
            }


        }


    }
}
