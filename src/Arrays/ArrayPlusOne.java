package Arrays;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-08.
 */
public class ArrayPlusOne {

    Scanner sc = new Scanner(System.in);

    int[] arrayPlusOne = new int[10];

    public void arrayPlusOne(){

        System.out.println("Please type ten numbers");

        for (int i = 0; i < 10; i++) {

            int number = sc.nextInt() + 1;

            arrayPlusOne[i] = number;

        }

        for (int numerToPrint: arrayPlusOne){

            System.out.println(numerToPrint);
        }
    }

}
