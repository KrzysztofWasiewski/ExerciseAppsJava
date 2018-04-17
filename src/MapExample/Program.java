package MapExample;


import java.util.Map;

public class Program {
    public static void main(String[] args) {

        WordsCounter wordsCounter = new WordsCounter();
        Map<String, Integer> stringIntegerMap = wordsCounter.countWords();

        //przejdz przez zbior wszystkich kluczy
        //dla kazdego klucza wypisz ten klucz i jego wartosc
        for (String key : stringIntegerMap.keySet()) {
            System.out.println("Slowo " +  "'" + key + "'" + " wystapilo " + stringIntegerMap.get(key)+ " razy");
        }
    }
}
