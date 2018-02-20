package SimpleApps;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-09.
 */
public class Lowercase_Uppercase {

    Scanner stringScanner = new Scanner(System.in);  //it is good to develop separate scanners for ints and strings as nextInt does not conumse the end of the line.
    Scanner integerScanner = new Scanner(System.in);
    String newSentence = "";
    int choice=0;
    String sentence;


    public void menu() {


        do {

        System.out.println("*** What would you like to do? ***");
        System.out.println("[1] Swap all the letters to uppercase ");
        System.out.println("[2] Swap all the letters to lowercase");
        System.out.println("[3] Swap lowercase to uppercase and uppercase to lowercase");
        System.out.println("[4] EXIT");

        choice = integerScanner.nextInt();



           switch (choice) {

                case 1:

                   lowertoupper();

                   break;

                case 2:

                    uppertolower();

                    break;

               case 3:

                   viceversa();

                   break;


               case 4:

                   System.out.println("See ya!");


            }


        }

        while (choice !=4);

    }

    public void lowertoupper() {

        System.out.println("Please type any sentence / word containing up to 30 letters.");

        sentence = stringScanner.nextLine();

        newSentence = "";

        if (sentence.length() <= 30) {

            for (int i = 0; i < sentence.length(); i++) {

                char nextChar = sentence.charAt(i);

                if (nextChar >= 97 && nextChar <= 122) {

                    nextChar -= 32;
                }

                newSentence = newSentence + nextChar;

            }

            System.out.println(newSentence);

        }

        else {

            System.out.println("Sorry, your sentence is too long...");

        }

    }

    public void uppertolower() {

        System.out.println("Please type any sentence / word containing up to 30 letters.");

        sentence = stringScanner.nextLine();

        newSentence = "";

        for (int i = 0; i < sentence.length(); i++) {

            char nextChar = sentence.charAt(i);

            if (nextChar >= 65 && nextChar <= 90) {

                nextChar += 32;
            }

            newSentence = newSentence + nextChar;

        }

        System.out.println(newSentence);


    }

    public void viceversa() {

        System.out.println("Please type any sentence / word containing up to 30 letters.");

        sentence = stringScanner.nextLine();

        newSentence = "";

        for (int i = 0; i < sentence.length(); i++) {

            char nextChar = sentence.charAt(i);

            if (nextChar >= 65 && nextChar <= 90) {

                nextChar += 32;
            }

            else if (nextChar >= 97 && nextChar <= 122) {

                nextChar -= 32;

            }

            newSentence = newSentence + nextChar;

        }

        System.out.println(newSentence);

    }
}
