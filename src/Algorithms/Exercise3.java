package Algorithms;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**********************************************************************************************************************
 * This algorithm is supposed to swap characters in a word given by the User to "_", if they are                      *
 * the same as the first character in that word (apart from the first character), e.g. it swaps "dododo" to "do_o_o"  *
 * Created by Kris on 2018-02-28.                                                                                     *
 *********************************************************************************************************************/
public class Exercise3 {

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type any word: ");
        String inputWord = sc.nextLine();
        return inputWord;
    }

    public static String swapCharacters(String input) {

        char firstCharacter = input.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(firstCharacter);
        for (int i = 1; i < input.length(); i++) {

            if (!(input.charAt(i) == firstCharacter)) {
                sb.append(input.charAt(i));
            } else {
                sb.append("_");
            }
        }

        String swappedWord = sb.toString();

        return swappedWord;

    }

    //test
    public static void main(String[] args) {

        System.out.println(swapCharacters(getInput()));
    }
}
