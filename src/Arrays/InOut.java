package Arrays;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-07.
 */
public class InOut {

    int[] array = new int[10];
    Scanner sc = new Scanner(System.in);

    public void array() {

        System.out.println("Please type 10 random integer numbers:");

        for (int i=0; i<10; i++) {

            int number = sc.nextInt();

            array[i] = number;

        }

//        /*for (int i=0; i<10; i++) {          //print from first to last
//
//            System.out.println(array[i]);*/
//
//        }

        for (int number: array) {
            System.out.println(number);
        }


//        for (int i=9; i>=0; i--) {      //print from last to first - note "higher or equals"
//
//            System.out.println(array[i]);
//        }



    }

}
