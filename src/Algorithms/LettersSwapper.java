package Algorithms;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/*************************************************************************************
 * This exercise allows to swap first and last letter in the word given by the user. *
 * No data validation.                                                               *
 * Created by Kris on 2018-02-26.                                                    *
 ************************************************************************************/
public class LettersSwapper {

    //gets input from user
    //@return returns String - word typed by user
    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a word:");
        String word = sc.nextLine();
        return word;
    }

    //swaps positions between first and last letter
    //@param String - word in which swapping takes place
    //@return returns String - word with swapped letters
    public static String swapLetters(String word) {

        StringBuilder sb = new StringBuilder();
        char lastLetter = word.charAt(0);
        char firstLetter = word.charAt(word.length() - 1);
        sb.append(firstLetter);
        sb.append(word.substring(1,word.length()-1));
        sb.append(lastLetter);
        String output = sb.toString();
        return output;
    }

    public static void printResult(String word) {
        System.out.println("After swapping, your word looks like: " + word);
    }

    //Test
    public static void main(String[] args) {
        printResult(swapLetters(input()));
            }


}
