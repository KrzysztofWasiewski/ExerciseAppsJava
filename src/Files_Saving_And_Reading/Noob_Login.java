package Files_Saving_And_Reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Kris on 2017-10-19.
 */
public class Noob_Login {

    public static void noobLogin() throws FileNotFoundException {

        Scanner file = new Scanner(new File("D:\\Projects\\Exercises\\Basics\\src\\Files_Saving_And_Reading\\save.txt"));
        String output = file.nextLine();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your username:");
        String user = sc.nextLine();
        System.out.println("Please type your password");
        String password = sc.nextLine();
        String data = user + password;

        if (data.equals(output)) {
            System.out.println("Access granted. Welcome, Mr " + user);
        }

    }

}
