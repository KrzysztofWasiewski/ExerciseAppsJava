package SimpleApps;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-16.
 */
public class BubbleSort {

    Scanner sc = new Scanner(System.in);

    public void console() {

        System.out.println("How many numbers would you like to sort?");
        int quantity = sc.nextInt();
        int[] array = new int[quantity];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please type a number:");
            array[i] = sc.nextInt();
        }
        bubbleSort(array);
    }

    public void bubbleSort(int[] array) {

        boolean swapped = true;

        while (swapped==true) {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                int temp = 0;
                if (array[i - 1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}




