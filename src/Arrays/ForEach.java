package Arrays;

/**
 * Created by Kris on 2017-10-08.
 */
public class ForEach {

    int[] tablica = new int[2];
    int[] tablica2 = new int[10];


    public void tablica() {

        tablica[0] = 232;
        tablica[1] = 23112;


        for (int wartosc : tablica)


        {
            System.out.println(wartosc);
        }

        for (int zawartosc : tablica2) {  //when it comes to foreach loop, they are good at working on the whole content of the array. If you do like in this example
                                          //you'll get a plus one to each stored int 9which is by the way by default a zero;

            zawartosc++;

            System.out.println(zawartosc);

        }


    }
}

// One thing 'bout foreach and arrays - you cannot use foreach to print array in a backwards manner - one could use Collections to do so