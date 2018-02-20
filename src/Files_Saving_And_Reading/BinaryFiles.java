package Files_Saving_And_Reading;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * REMEBER TO MAKE A VERSION ASKING USER FOR A FILE NAME
 * <p>
 * Created by Kris on 2017-10-24.
 */
public class BinaryFiles {

    int numberOfBytes = 0;
    RandomAccessFile streamO = null;
    Scanner sc = new Scanner(System.in);

    //            String file = "D:\binary.txt";
    //            FileOutputStream output = new FileOutputStream(file);
    //            DataOutputStream streamO = new DataOutputStream(output);  - these three are the same as: DataOutputStream stream0 = new DataOutputStream(new FileOutputStream(d:\\binary.txt));

    public String getFileName() {

        String pathString = "D:\\";
        System.out.println("Please type the name for your file:");
        pathString = pathString + sc.nextLine();
        return pathString;

    }


    public void readFile(String a) throws FileNotFoundException {

        try {
            streamO = new RandomAccessFile(a, "r");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            System.out.println(streamO.readLine());
            streamO.seek(0); //moving back to byte 0, in order to count bytes in the next procedure from the beginning
            while (streamO.read() != -1) { //when thera are no more bytes to read, the stream value is -1
                numberOfBytes++;
            }
            System.out.println("The numbers of bytes in this file is: " + numberOfBytes);
        } catch (IOException e) {
            System.out.println("Intput - Output error");
        }
        try {
            if (streamO != null)
                streamO.close();
        } catch (IOException e) {
            System.out.println("Error while closing stream");
        }
    }


    public void writeFiles(String a) throws FileNotFoundException {
        try {
            streamO = new RandomAccessFile(a, "rw");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            System.out.println("Please type your name and surname");
            String nameSurname = sc.nextLine();
            streamO.writeUTF(nameSurname);
            System.out.println("Please type the current year");
            String currentYear = sc.nextLine();
            int currentYearI = Integer.parseInt(currentYear);
            streamO.writeInt(currentYearI);
            System.out.println("Please type first integer");
            int c = sc.nextInt();
            System.out.println("Please type second integer");
            int b = sc.nextInt();
            streamO.write(divide(c, b));
        } catch (IOException e) {
            System.out.println("Intput - Output error");
        }
        try {
            if (streamO != null)
                streamO.close();
        } catch (IOException e) {
            System.out.println("Error while closing stream");
        }
    }


    public int divide(int a, int b) {
        int sum = a / b;
        return sum;
    }

}
