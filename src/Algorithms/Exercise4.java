package Algorithms;

import java.util.Scanner;

/***********************************************************************************************************************
 * This algorithm is meant to print all available postal addresses. User types the name of the street and the number   *
 * of the last building on that street. Application prints all postal addresses, assuming that blocks of flats have    *
 * only uneven numbers, and that each block is a 3-storey building, and there are two flats              *
 * on each floor.                                                                                                      *
 *                                                                                                                     *
 * Created by Kris on 2018-02-28.                                                                                      *
 **********************************************************************************************************************/
public class Exercise4 {

    public static void printAddresses(String streetName, int streetLastNumber) {

        int numberOfFlatsInSingleBlock = 6, streetNumber, flatNumber;


        for (int i = 1; i <= streetLastNumber; i+=2) {
            streetNumber = i;
            for (int j = 1; j <= 6; j++) {
                flatNumber = j;
                System.out.println(streetName + " " + streetNumber + "/" + flatNumber);
            }
        }

    }

    public static void main(String[] args) {

        String streetName;
        int streetLastNumber;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please type the name of the street: ");
        streetName = sc.nextLine();
        System.out.println("Please type the last number on the street: ");
        streetLastNumber = sc.nextInt();
        printAddresses(streetName, streetLastNumber);

    }
}
