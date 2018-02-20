package Reminder;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Kris on 2017-11-30.
 */
public class remider1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] tab = new int[10][5]; //tablica tabblic - 10 tablic po 5 elementów
        int k = 1;

        for (int i = 0; i < 10; i++) { //bierze po kolei kazda z 10 tablic
            for (int j = 0; j < 5; j++) {//wypelnia ja 5 elementami

                tab[i][j] = k;
                k++;

            }

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();

        }

    }
}



