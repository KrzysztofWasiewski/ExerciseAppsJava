package String_Oprations;

/**
 * Created by Kris on 2017-10-18.
 */
public class String_Mod {

    public void stringMod() {

        String hello = "Hello ";
        String world = "World!";
        String greeting= hello+world;
        System.out.println(greeting);

        String hi = greeting.substring(0, 6)+"pupil";
        System.out.println(hi);

    }
}
