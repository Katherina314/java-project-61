package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    static final Random RANDOM = new Random();
    private static String round;

    public static void run() {
        Cli.greeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int num = new num(RANDOM);

        int i = RANDOM.nextInt();

        for (int i = 0; i < 3; i++) {
            System.out.println("Question:" + num);
            System.out.println("Your answer: ");
            Scanner userAnswer = new Scanner(System.in);
            String correctAnswer = "";
            String question = "";
            String user = "";

            for (var round : question) {
                System.out.println("Question: " + num);

                System.out.print("Your answer: ");
                correctAnswer = round;

                if (userAnswer.equals(correctAnswer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                            "Let's try again, " + user);

                    return;
                }
            }

            System.out.println("Congratulations!");

        }
    }
}

