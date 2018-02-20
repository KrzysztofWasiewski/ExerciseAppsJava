package Arrays;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-09.
 */
public class BiggestNumberAndCounter {

    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[10];

    public void biggestCounter() {

        System.out.println("Please type any 10 integers");


        for (int i = 0; i < 10; i++) {

            numbers[i] = sc.nextInt();

        }

        int biggest = 0;


        for (int i = 0; i < 10; i++) {

            if (numbers[i] > biggest) {

                biggest = numbers[i];

            }
        }

        int counter = 0;

        for (int i = 0; i < 10; i++) {

           if (numbers[i] == biggest) {

                counter++;
            }



        }


        System.out.println("The highest integer is " + biggest + " and it has been typed " + counter + " times");

    }

}
