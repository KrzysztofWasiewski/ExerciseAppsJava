package SimpleApps;

import java.util.Scanner;

/***************************************************************************************************************
 * This exercise app is meant to draw a star (asterisk) pyramid, where the User sets the height of the pyramid.*
 * The pyramid is drawn both horizontally and vertically.                                                      *
 * Created by Kris on 2018-02-26.                                                                              *
 **************************************************************************************************************/
public class StarPyramid {


    public static void drawPyramidVertically(int height) {

        for (int i = 0; i <= height; i++) { //loop for rows - ascending, until reaching given height.
            String pyramidRow = "";
            for (int j = 0; j < i; j++) { //loop for building single row with stars. Number of stars.
                //Number of a row equals numbers of stars, so the loop-continuation conditon refers to
                //numer of rows,that is "i" variable from the previous lopp (rows loop)
                pyramidRow += "*";
            }
            System.out.println(pyramidRow);
        }

        for (int i = height - 1; i > 0; i--) { //here we have a "reversed" loop. "Height-1", becasue we do not want to repeat rows.
            String pyramidRow = "";
            for (int j = 0; j < i; j++) {
                pyramidRow += "*";
            }
            System.out.println(pyramidRow);
        }
    }

    //TODO find a simpler way to count spaces and asterisks - there must be another way.
    public static void drawPyramidHorizontally(int height) {
        int numberOfSpaces = (height - 1);
        for (int i = 0; i < height; i++) {
            int numberOfStars = height - numberOfSpaces;
            String row = "";
            for (int j = numberOfSpaces; j > 0; j--) {
                row += " ";
            }
            numberOfSpaces--;
            if (numberOfStars == 1) {
                for (int k = numberOfStars; k > 0; k--) {
                    row += "*";
                }
                System.out.println(row);
            } else {
                for (int k = numberOfStars+(numberOfStars-1); k > 0; k--) {
                    row += "*";
                }
                System.out.println(row);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the height of your pyramid:");
        int pyramidHeight = sc.nextInt();
        drawPyramidVertically(pyramidHeight);
        drawPyramidHorizontally(pyramidHeight);


    }
}
