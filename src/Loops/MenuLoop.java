package Loops;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-11.
 */
public class MenuLoop {

    Scanner sc = new Scanner(System.in);

    public void doWhileMenu() {   //a do - while loop seems to suit better the simple menu, as, in this case, in do while, when exit is chosen, the app does not show
                                  //a default option "That is not a choice", when While loop shows in the same instance, before exiting, the default message. need to check why.
        int input = 0;

        do {

            System.out.println("Menu" +
                    "          \n [1] Sentence " +
                    "          \n [2] Dots" +
                    "          \n [3] Print your sentence" +
                    "          \n [4] Exit.");

            input = sc.nextInt();

            switch (input) {

                case 1:

                    System.out.println("Hello Java!");

                    break;

                case 2:

                    System.out.println("...................");

                    break;

                case 3:

                    System.out.println("Please type a sentence:");

                    String sentence = sc.next();

                    System.out.println("Your sentence is: \n" + sentence);

                    break;

                default:

                    System.out.println("That is not a choice");

                    break;


            }
        }

        while (input != 4);

        System.out.println("Bye!");
    }

    public void whileMenu() {

        int input = 0;

        while (input != 4){

            System.out.println("Menu" +
                    "          \n [1] Sentence " +
                    "          \n [2] Dots" +
                    "          \n [3] Print your sentence" +
                    "          \n [4] Exit.");

            input = sc.nextInt();

            switch (input) {

                case 1:

                    System.out.println("Hello Java!");

                    break;

                case 2:

                    System.out.println("...................");

                    break;

                case 3:

                    System.out.println("Please type a sentence:");

                    String sentence = sc.next();

                    System.out.println("Your sentence is: \n" + sentence);

                    break;

                default:

                    System.out.println("That is not a choice");

                    break;


            }
        }

       System.out.println("Bye!");


    }





}
