package Arithmetics;

import java.util.Scanner;

/**
 * Created by Kris on 2017-08-03.
 */
public class Fibonacci {

    Scanner keyboard = new Scanner(System.in);

    int fib1 = 0;
    int fib2 = 1;
    int fibonacciResult = 1;

    String number = "";

    public int fibonacci(int n) {

        for (int i = 1; i < n; i++) {

            fibonacciResult = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacciResult;

        }

        return fibonacciResult;

    }

    public void fibonacciSolver() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Which number in the Fibonacci sequence you would like to calculate?");

        String number = sc.nextLine();

        int n = Integer.parseInt(number); //casts a String with digits into an Int variable;

        if (n == 1) {

            number = "first";

        }

        else if (n == 2) {

            number = "second";
        }

        else if (n == 3) {

            number = "third";
        }

        else if (n == 0) {

            number = "zero";

        }

        else {

            number = n + "th";
        }

        System.out.println("The " + number + " number in the Fibonacci sequence is: " + fibonacci(n));

    }

}
