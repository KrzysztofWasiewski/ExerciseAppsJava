package SimpleApps;

import java.util.Scanner;

/**
 * This program checks if a given sentence containing up to 30 characters is a palindrome.
 * Created by Kris on 2017-10-12.
 */
public class Palindrome_Checker {

    Scanner stringScanner = new Scanner(System.in);

    String input;

    String reverseInput = "";

    String normalInput = "";

    int counter = 0;


    public void palindorme_checker() {

        console();

        check_mechanism();

        result();

    }

    public void console() {

        do {

            System.out.println("Palindrom_Checker v.0.1 \nPlease type a word or sentence up to 30 characters:");

            input = stringScanner.nextLine();

            if (input.length() < 1 || input.length() > 30) {

                System.out.println("The given setnece exceeds a 30 characters limit. Pleae try again.");

            }

        }

        while (input.length() < 1 || input.length() > 30);

    }

    public void check_mechanism() {

        for (int i = input.length() - 1; i >= 0; i--) {

            if (input.charAt(i) != 32) {

                counter++;

                reverseInput = reverseInput + input.charAt(i);
            }

        }

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != 32) {


                normalInput = normalInput + input.charAt(i);

            }

        }

    }

    public void result() {

        if (normalInput.equals(reverseInput) && (counter % 2 == 0)) {

            System.out.println("Your sentence is a palindrome! Nice! Your sentence is an even palindrome");

        } else if (normalInput.equals(reverseInput) && (counter % 2 != 0)) {

            System.out.println("Your sentence is a palindrome! Nice! Your sentence is an uneven palindrome");

        } else {

            System.out.println("Sorry, your sentence is not a palindrome.");
        }


    }

}






