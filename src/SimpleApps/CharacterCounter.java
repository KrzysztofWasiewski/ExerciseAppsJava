package SimpleApps;

import java.util.Scanner;

/**
 * Created by Kris on 2017-08-02.
 */
public class CharacterCounter {

    public void characterCount() {

        int inputCharactersWithoutSpaces = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please type a word or a sentence in order to count characters: ");

        String input = keyboard.nextLine();

        int inputLenght = input.length();

        for (int i = 0; i < inputLenght; i++) {

            if (input.charAt(i) != 32) {

                inputCharactersWithoutSpaces += 1;

            }

        }

        System.out.println("Number of characters without spaces in the typed text equals: " + inputCharactersWithoutSpaces);

        System.out.println("Number of characters with spaces in the typed text equals: " + inputLenght);
    }
}