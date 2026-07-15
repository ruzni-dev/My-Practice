import java.util.Scanner;

public class OnlineQuizSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Java is a?",
                "2. Which keyword creates an object?",
                "3. JVM stands for?"
        };

        String[][] options = {
                {"A. Programming Language", "B. Database", "C. Browser", "D. OS"},
                {"A. new", "B. class", "C. object", "D. create"},
                {"A. Java Virtual Machine", "B. Java Variable Method", "C. Java Visual Model", "D. None"}
        };

        char[] answers = {'A', 'A', 'A'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (String option : options[i])
                System.out.println(option);

            System.out.print("Your Answer: ");
            char answer = Character.toUpperCase(sc.next().charAt(0));

            if (answer == answers[i])
                score++;
        }

        System.out.println("\n===== Result =====");
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: " + (questions.length - score));
        System.out.println("Score: " + (score * 100 / questions.length) + "%");

        sc.close();
    }
}