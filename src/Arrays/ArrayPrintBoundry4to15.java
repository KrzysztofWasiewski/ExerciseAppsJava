package Arrays;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-08.
 */
public class ArrayPrintBoundry4to15 {

    Scanner sc = new Scanner(System.in);
    int[] array = new int[10];

    public void arrayboundry() {

        System.out.println("Please type any 10 numbers");

        for (int i = 0; i < 10; i++) {

            int number = sc.nextInt();

            array[i] = number;

        }

        for (int i = 0; i < 10; i++) {

            if (array[i] >= 4 && array[i] <= 15) {

                System.out.println(array[i]);
            }
        }

    }

}
