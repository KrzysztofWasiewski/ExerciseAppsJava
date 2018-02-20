package SimpleApps;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Kris on 2017-08-01.
 */
public class Lottery {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    String finalResult = ""; // would it not be easier to make just one full iteration for whole app, and put drawn number into array, then sort them, and show - the loop would go as many time as bets you'd like


    public void lottomat() {

        System.out.println("How many bets you would like to make in the next Lotto draw?");
        int number = sc.nextInt();
        String[] results = new String[number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 6; j++) {
                int result = rd.nextInt(48) + 1; //this notation excludes 0 from the numbers range, so that the range equals desired range from 1 to 49 (result + 1 - that is 0+1=1, 1+1=2, ..., 48+1=49;
                finalResult = finalResult + result + " ";

                //Math.random itself draws from 0 to almost 1. In order to draw a number from broader range
                //you need to multiply Math.random by the last number ftom the desired range
            }

            results[i] = finalResult;
            finalResult = ""; //this line "clears" the finalResult variable, so that it does not contain 12, 18, 24 etc. numbers in next loop iterations
                   }
        for (int i = 0; i < number; i++) {
            System.out.println("These are the lucky numbers you should bet on: " + results[i]);
        }
        System.out.println("\nGood luck!");
    }
}

