package Arrays;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-14.
 */
public class MinMax {

    Scanner sc = new Scanner(System.in);

    int numberIntegers = 0;

    double integerNumber;

    int menuChoice = 0;

    double sum;

    double mean;

    double[] integerArray;

    int max, min;


    public void consoleIntegers() {

        integerNumber = 0;

        System.out.println("Please enter number of integers you would like to type.");

        numberIntegers = sc.nextInt();

        integerArray = new double[numberIntegers];

        for (int i = 0; i < numberIntegers; i++) {

            System.out.println("Please type an integer:");

            integerNumber = sc.nextDouble();

            integerArray[i] = integerNumber;

        }

    }

    public void consoleMenu() {

        do {

            System.out.println("MENU\n[1]Find the highest integer\n[2]Find the lowest integer\n[3]Calculate integers sum\n[4]Calculate integers arithmetic mean\n[5]EXIT");

            menuChoice = sc.nextInt();

            switch (menuChoice) {

                case 1:

                    max = 0;

                    consoleIntegers();

                    for (int i = 0; i < integerArray.length; i++) {

                        if (max < integerArray[i]) {

                            max = (int) integerArray[i];
                        }
                    }

                    System.out.println("The highest number is " + max);

                    break;


                case 2:

                    consoleIntegers();

                    min = (int) integerArray[0]; //We cant just put 0 - when user types integers larger than zero (ex 4 5 6 7), the min would be 0, though nobody typed it

                    for (int i = 0; i < integerArray.length; i++) {

                        if (min > integerArray[i]) {

                            min = (int) integerArray[i];
                        }

                    }

                    System.out.println("The lowest number is " + min);

                    break;

                case 3:

                    sum = 0;

                    consoleIntegers();

                    for (int i = 0; i < integerArray.length; i++) {

                        integerNumber = integerArray[i];

                        sum = sum + integerNumber;

                    }

                    System.out.println("The sum is " + sum);

                    break;

                case 4:

                    sum = 0;
                    mean = 0;

                    consoleIntegers();

                    for (int i = 0; i < integerArray.length; i++) {

                        integerNumber = integerArray[i];

                        sum = sum + integerNumber;

                    }

                    mean = sum / numberIntegers;

                    System.out.println("The arithmetic mean is " + mean);

                    break;

                case 5:

                    System.out.println("Bye!");

                    break;


            }


        }

        while (menuChoice != 5);

    }

}
