package ArrayList;
import java.util.ArrayList;

/**
 * Created by Kris on 2017-12-09.
 */
public class ArrList {


        public static void main(String[] args) {

            ArrayList<Dogz> doggies = new ArrayList<Dogz>();
            Dogz d1 = new Dogz();
        doggies.add(d1);
        int indeks = doggies.indexOf(d1);
        int size = doggies.size();
        boolean isThere = doggies.isEmpty();

            System.out.println(indeks);
            System.out.println(size);
            System.out.println(isThere);

    }


}
