package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kris on 2017-10-08.
 */
public class SquareArray {

    Scanner sc = new Scanner(System.in);

    double[] squareArray = new double[10];

    public void squareArray() {

        System.out.println("Please type ten real numbers");

        for (int i = 0; i < 10; i++ ) {

            double number = Math.pow(sc.nextDouble(), 2);

            squareArray[i] = number;
        }

        for (double numberToPrint: squareArray) {

            System.out.println(numberToPrint);
        }


    }
}
