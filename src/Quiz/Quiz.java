package Quiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Quiz {

    public static final String PATH_TO_RESULTS = "C:\\Users\\RENT\\IdeaProjects\\SdaProject9\\src\\ProgramowanieSrednioZaawansowane\\Quizz\\wyniki.txt";

    //sciezka do pliku z pytaniami
    public static final String PATH_TO_QUESTION = "C:\\Users\\RENT\\IdeaProjects\\SdaProject9\\src\\ProgramowanieSrednioZaawansowane\\Quizz\\pytania.txt";


    //odczyt rankingu z pliku
    public static List<String> getRanking() {
        List<String> result = null;

        //odczyt rankingu z pliku z zwroceniem go jako lista stringow
        try {
            result = Files.readAllLines(Paths.get(PATH_TO_RESULTS));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


    public List<Question> readAllQuestion() {

        List<String> questionsFromFile = null;
        List<Question> questionsList = new ArrayList<>();

        //odczytywanie wszystkich linii z pliku
        try {
            questionsFromFile = Files.readAllLines(Paths.get(PATH_TO_QUESTION));
        } catch (IOException e) {
            e.printStackTrace();
        }


        //MAPOWANIE - z surowych plikow tworzymy obiekt typu question


        for (int i = 0; i < questionsFromFile.size(); i += 6) {
            Question question = new Question();
            question.setTitle(questionsFromFile.get(i));
            question.getAnswers().add(questionsFromFile.get(i + 1));
            question.getAnswers().add(questionsFromFile.get(i + 2));
            question.getAnswers().add(questionsFromFile.get(i + 3));
            question.getAnswers().add(questionsFromFile.get(i + 4));
            question.setCorrectAnswer(questionsFromFile.get(i + 5));
            questionsList.add(question);
        }

        return questionsList;
    }

}

