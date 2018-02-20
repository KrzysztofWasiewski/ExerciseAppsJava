package pl.wasiewski.oopbasics;

/**
 * Created by Kris on 2017-12-09.
 */
class Test{
    static void zwieksz(int liczba){
        liczba++;
            }
}
class Main{

    static int a = 5;

    public static void main(String[] args) {
        Test.zwieksz(a);
        System.out.println(a);
            }
}