package Arrays;

import java.util.Arrays;

/**
 * Created by Kris on 2017-10-12.
 */
public class ArraysAPIexercises {

    int[] annonymous = {1,2,3,4,5,6,7}; //

    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = arr1; // if we do this, then both tables indicate same table (spot in the memory), so changing values even in the second arr2, will affect arr1 as they are the same object/variable
                       // we would have to use Arrays.copy in order to create two separate tables.
    public void arraysE() {

        arr2[0] = 0;

        for (int array: arr1)

            System.out.println(array);

        int[] arr3 = Arrays.copyOf(arr1, arr1.length);

        arr1[0] = 9;

        for (int array: arr2)

            System.out.println(array);

        for (int array: arr3)

            System.out.println(array);

        for (int array: arr1)

            System.out.println(array);

    }
}
