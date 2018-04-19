package ControlFlow;

/**
 * Created by Kris on 2017-07-31.
 */
public class ForAndWhile {

    public void forLoop(int x) {

        String result = ""; //otherwise result would be "null 1 2 3 ..."

        for (int i = 1; i <= x; i++) {

            System.out.println(i);
            result = result + " " + i;

        }

        System.out.println(result);
    }

    public void whileLoop(int x) { //method accepts different arguments types than it is itself

        String result = ""; //second reult declaration and initialisation

        int i = 1;

        while (i <= x) {

            System.out.println(i);
            result = result + " " + i;
            i++;
        }

        System.out.println(result);
    }

}
