package ArrayList;
import java.util.*;

/**
 * Created by Kris on 2017-12-10.
 */
public class ArrCheck {

    public static void main(String[] args) {

        ArrayList<String> doggies = new ArrayList<String>(5);

        String word = "Lama";
        doggies.set(3,word);
        System.out.println(doggies.get(3)); //won't worrk - capacity isn't actual size. We would need to add 4 elements first, than set the third index

        }

            }



