import java.util.Scanner;

public class QuizGameProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String[] questions = {
            "What is the capital of France?",
            "Which language is used for Android development?",
            "What does CPU stand for?",
            "Which planet is known as the Red Planet?"
        };

        String[][] options = {
            {"A) Paris", "B) Rome", "C) Madrid", "D) Berlin"},
            {"A) Swift", "B) Java", "C) Python", "D) Ruby"},
            {"A) Central Process Unit", "B) Computer Personal Unit", "C) Central Processing Unit", "D) Central Processor Utility"},
            {"A) Earth", "B) Jupiter", "C) Mars", "D) Venus"}
        };

        char[] answers = {'A', 'B', 'C', 'C'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(input.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + answers[i]);
            }
        }

        System.out.println("\nQuiz Over! Your final score is: " + score + "/" + questions.length);
    }
}
