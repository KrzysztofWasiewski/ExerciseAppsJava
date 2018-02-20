package Loops;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Kris on 2017-08-01.
 */
public class OddandEven {

    public void oddOrEvenUser() {

        Scanner sc = new Scanner(System.in);

        String result = "";

        System.out.println("Type an integer number...");

        int number = sc.nextInt();

        result = number % 2 == 0 ? " even number" : " odd number"; //in ternary conditional you must assign result to variable

        System.out.println(number + " is an" + result);
    }

    public void oddOrEvenOneToHundred() {

        String result = "";

        for (int i = 1; i <= 100; i++) {

            result = i % 2 == 0 ? i + " even number" : i + " odd number"; //in ternary conditional you must assign result to variable

            System.out.println(result);
        }


    }

}