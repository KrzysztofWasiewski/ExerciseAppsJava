package Loops;

/**
 * Created by Kris on 2017-08-01.
 */
public class Divisible {

    public void divisibleBySeven() {

        String result = "";

        for (int i = 1; i <= 500; i++) {

            if (i % 7 == 0) {

                result = result + " " + i;

            }
        }

        System.out.println(result);
    }

    public void divisibleByAnyNumberAnyRange(int x, int y) {

        String result = "";

        for (int i = 1; i <= y; i++) {

            if (i % x == 0) {

                result = result + " " + i;

            }
        }

        System.out.println(result);
    }

    }

