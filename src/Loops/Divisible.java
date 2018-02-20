package Loops;

/**
 * Loops training
 * Created by Kris on 2017-08-01.
 */
public class Divisible {

    //This method prints all numbers divisible by 7 for range 1-500
    public static void divisibleBySeven() {

        String result = "";

        for (int i = 1; i <= 40; i++) {

            if (i % 7 == 0) {

                //printing in one line instead of verses. Could use a stringbuilder.
                result = result + " " + i;

            }
        }

        System.out.println(result);
    }

   //taking two arguments. Checks if numbers from range 1-y are divisable by x
    public static void divisibleByAnyNumberAnyRange(int x, int y) {

        String result = "";

        for (int i = 1; i <= y; i++) {

            if (i % x == 0) {

                result = result + " " + i;

            }
        }

        System.out.println(result);
    }

    //testing
    public static void main(String[] args) {

        divisibleByAnyNumberAnyRange(7,500);
        divisibleBySeven();

    }

    }

