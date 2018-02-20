package Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Kris on 2017-10-16.
 */
public class Random_Matrix {


    public void console() {

        Random rd = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("Plese enter the number of columns in the matrixes");

        int columns = sc.nextInt();

        System.out.println("Please enter the number of rows in the first matrixes");

        int rows = sc.nextInt();


        matrixBuilder(rows, columns);

    }

    public void matrixBuilder(int a, int b) {

        Random rd = new Random();

        int[][] matrixA = new int[b][a];
        int[][] matrixB = new int[b][a];

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                matrixA[i][j] = rd.nextInt((-4 + 14) + 1) + -14;

            }

        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                matrixB[i][j] = rd.nextInt((-4 + 14) + 1) + -14;

            }

        }

        int[][] matrixSum = new int[b][a];

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {

                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
            }

        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {

                System.out.print(matrixSum[i][j]);

            }

            System.out.println();
        }

    }

}




