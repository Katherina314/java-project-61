package hexlet.code;

import java.util.Scanner;
import hexlet.code.Cli;

public class Even {

    public static void run() {
        Cli.greeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int num = (int) (Math.random() * 100);
        for (int i = 0; i < 3; i++) {
            System.out.println("Question:" + num);
            System.out.println("Your answer: ");
            Scanner userAnswer = new Scanner(System.in);
            String correctAnswer = "";
            String question = "";


        for (var round : question) {
            System.out.println("Question: " + num);

            System.out.print("Your answer: ");

            Scanner userAnswer = scanner.next();
            correctAnswer = round;

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + user);

                System.out.println("Let's try again, " + user + "!");

                return;
            }
        }

        System.out.println("Congratulations, " + user + "!");

        };
