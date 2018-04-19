package Quiz;

import java.util.ArrayList;
import java.util.List;

//Klasa modeluje pytania, odpowiedzi. Przechowuje inf o pyt.

public class Question {

    private String title;
    private String correctAnswer;
    private List<String> answers = new ArrayList<>();

    public Question() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title).append("\n");
        for (String a: answers) {
            stringBuilder.append(a).append("\n");
        }
        return stringBuilder.toString();
    }
}
