package ControlFlow;

import java.util.Scanner;

/**
 * Created by Kris on 2017-07-31.
 */
public class LoopsApp {

    public void loopApp() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the integer number, to which you would like to count from 1...");
        int number = sc.nextInt();

        ForAndWhile faw = new ForAndWhile();

        faw.forLoop(number);
        faw.whileLoop(number);
    }

    public void divisable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the integer number, for which you would like to get all the divisible numbers...");
        int number = sc.nextInt();
        System.out.println("Type the range for which you would like to check divisibility");
        int number2 = sc.nextInt();
        Divisible div = new Divisible();
        div.divisibleByAnyNumberAnyRange(number, number2);


    }
}