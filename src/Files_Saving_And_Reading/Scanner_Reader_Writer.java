package Files_Saving_And_Reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Kris on 2017-10-18.
 */
public class Scanner_Reader_Writer {

    public void scannerWrite() throws FileNotFoundException {

        PrintWriter srw = new PrintWriter("D:\\Projects\\Exercises\\Basics\\src\\Files_Saving_And_Reading\\save.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a sentence, that you would like to save to a file");
        String input = sc.nextLine();
        srw.println(input);
        srw.close();
    }

    public void scannerLoad() throws FileNotFoundException {

        Scanner file = new Scanner(new File("D:\\Projects\\Exercises\\Basics\\src\\Files_Saving_And_Reading\\save.txt"));

        while (file.hasNextLine()) {

            String output = file.nextLine();
            System.out.println(output);

        }


    }

}

