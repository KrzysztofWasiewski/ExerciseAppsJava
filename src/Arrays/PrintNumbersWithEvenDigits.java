package Arrays;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-08.
 */
public class PrintNumbersWithEvenDigits {

    Scanner sc = new Scanner(System.in);
    String[] numbers = new String [10];
    int[] digits = new int [10];
    String newdigit = "";

    public void evendigits() {

        System.out.println("Please type any 10 numbers");

        for (int i = 0; i < 10; i++) {

            String number = sc.nextLine();
            numbers[i] = number;

        }

        for (int i = 0; i < 10; i++) {

            int length = numbers[i].length();

                for (int j = 0; j < length; j++) {

                    int digit = numbers[i].charAt(j);

                    if (digit % 2 == 0) {

                        digit = digit - 48; // -48 changes digit in ASCII code to a normal number

                        newdigit = newdigit + digit;
                    }

                    }

                if (newdigit.equals(numbers[i])) {

                    System.out.println("All digits are even in number " + numbers[i]);

                    newdigit = ""; //we need to reset newdigit - otherwise in next loop iteration newdigit would be the sum of old newdigit and new newdigit
                    // I could also declare and initialise nedigit at the begging of the firt loop...

                }


        }

    }

}
