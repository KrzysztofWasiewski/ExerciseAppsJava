package Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Kris on 2017-10-08.
 */
public class RandomGuess {

    Scanner sc = new Scanner(System.in);

    int[] randomNumbers = new int[30];

    int number;

    boolean isIt;

    public void randomguess() {

        Random rd = new Random();

        for (int i = 0; i < 30; i++) {

            number = rd.nextInt(49) + 1;

            randomNumbers[i] = number;
        }

        System.out.println("Guess a number between 1 and 50");

        int inputNumber = sc.nextInt();

        for (int i = 0; i < 30; i++) {


            if (randomNumbers[i] == inputNumber) {

                System.out.println("Bravo! Your number can be found in our randomized collection :) !");

                isIt = true;
            }

            else {

                isIt = false;
            }

        }

        if (!isIt) {

            System.out.println("Sorry, you haven't guessed :( ");
        }

    }


}