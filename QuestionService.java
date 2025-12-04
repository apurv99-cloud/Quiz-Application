
import java.util.*;

public class QuestionService {

    Question[] questions = new Question[5];
    String Selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Which Language you have your expertise with?", "Java", "Cpp", "Python", "CShap", "Java");
        questions[1] = new Question(2, "Size of int", "2", "6", "4", "8", "4");
        questions[2] = new Question(3, "Size of double", "2", "6", "4", "8", "8");
        questions[3] = new Question(4, "Size of char", "2", "6", "4", "8", "2");
        questions[4] = new Question(5, "Size of long", "2", "6", "4", "8", "8");

    }

    public void displayThem() {

        int i = 0;
        for (Question q : questions) {
            System.out.println("Question is: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            Selection[i++] = sc.nextLine();

        }
        System.out.println("You entered the values: ");

        for (String s : Selection) {

            System.out.println(s);
        }

    }

    public void checkAnswer() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String Answer = que.getAnswer();
            String userAnswer = Selection[i];
            if (Answer.equals(userAnswer)) {
                score++;

            }
        }
        System.out.println("Your score is: " + score);
    }

}
