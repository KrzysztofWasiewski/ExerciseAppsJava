package Arithmetics;

import java.util.Random;

/**
 * Exercises on loops and arrays with tests
 * Created by Kris on 2018-02-20.
 */
public class Exercises {


    //adds and prints all array elements that are divisible by 7
    public static void addElementsDividedBySeven(int[][] arr) {

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 7 == 0) {
                    //two sums - testingtwo different styles of adding
                    sum1 = sum1 + arr[i][j];
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.println(sum1 + " " + sum2);
    }

    //finds and prints the smallest element
    public static void find2DArrayMin(int[][] arr) {
        int smallest = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println(smallest);
    }

    //sums even elements in each row separately, then inserts them in an array with results
    public static void sumEvenNumbersInRows(int[][] arr) {
        int sumInRow;
        int rowCounter = 0; //counts rows, so that we can fill in array with results
        int[] arrayAddedRows = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sumInRow = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumInRow += arr[i][j];
                }
            }
            arrayAddedRows[rowCounter] = sumInRow;
            rowCounter++;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(arrayAddedRows[i]);
        }

    }

    //creating and filling array with random numbers
    public static int[][] createAndFillArrayRandom() {
        Random rd = new Random();
        int[][] arr = new int[8][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rd.nextInt(49) + 1;
            }
        }
        return arr;
    }

    //


    //test

    public static void main(String[] args) {

        addElementsDividedBySeven(createAndFillArrayRandom());
        find2DArrayMin(createAndFillArrayRandom());
        sumEvenNumbersInRows(createAndFillArrayRandom());
    }
}

