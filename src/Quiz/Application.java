package Quiz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean exit = false;


        System.out.println("WITAM W QUIZIE");
        System.out.println();

        System.out.println("Podaj swoje imie");
        String nick = scanner.nextLine();


        while (exit == false) {

            System.out.println("Witaj " + nick + " wybierz opcje");
            System.out.println("1. Rozpocznij nowy quiz");
            System.out.println("2. Pokaz wyniki");
            System.out.println("0. Wyjscie z programu");
            System.out.println();


            int option = scanner.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Nowy quiz");
                    Quiz quiz = new Quiz();
                    List<Question> questions = quiz.readAllQuestion();

                    //counter zlicza liczbe prawidlowych odpwoiedzi
                    int counter = 0;


                    for (int i = 0; i < questions.size(); i++) {

                        System.out.println("Pytanie nr " + (i + 1));
                        Question question = questions.get(i);
                        System.out.println(questions.get(i));
                        System.out.println(nick + " podaj odpowiedz na pytanie");
                        String choice = scanner.next();
                        if (choice.equals(question.getCorrectAnswer())) {
                            System.out.println("Twoja odpowiedz jest poprawna");
                            counter++;
                        } else {
                            System.out.println("Twoja odpowiedz jest niepoprawna");
                        }

                        System.out.println();
                        System.out.println("Twoj wynik to: " + counter + "/" + questions.size());
                        System.out.println();
                    }

                    //STANDARD OPEN OPTION I METODA APPEND nie usuwa nowych wynikow tylko nadpisuje stare
                    String result = nick + " " + counter + "\n";
                    try {
                        Path p = Paths.get("C:\\Users\\RENT\\IdeaProjects\\SdaProject9\\src\\ProgramowanieSrednioZaawansowane\\Quizz\\wyniki.txt");
                        //warunek trojargumentowy/ jezeli plik istnieje do dopisz wyniki (append), a jezeli
                        //plik nie istnieje to utworz nowy plik i dopiero wpisz wynik (create)
                        Files.write(p, result.getBytes(), Files.exists(p) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                    } catch (IOException e) {
                        System.out.println("Nie mozna zapisac wyniku do pliku");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Tabela wynikow");
                    List<String> ranking = Quiz.getRanking();
                    if (ranking != null) {
                        for (String wynik : ranking) {
                            System.out.println(wynik);
                        }
                    } else {
                        System.out.println("Brak wynikow");
                    }
                    break;
                }

                case 0: {
                    System.out.println("Wychodze z programu");
                    exit = true;
                    break;
                }
            }
        }
    }
}

