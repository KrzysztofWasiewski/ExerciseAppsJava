package String_Oprations;

/**
 * Created by Kris on 2017-10-18.
 */
public class Printf {

    public int sumup(int arg0, int... args) {

        int wynik = arg0;

        for (int i = 0; i < args.length; i++) {

            wynik += args[i];

        }

        return wynik;

       }


       }

