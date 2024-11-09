package hexlet.code;

import java.util.Scanner;


public class Even {
    public static int Random;

    public static void run() {
        Cli.greeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int num = (int) (Math.random() * 100);

        System.out.println("Question:" + num);
        System.out.println("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next();
    };
        public static boolean isEven(int num) {
        String userAnswer = isEven(num) ? "yes" : "no";
        if (num % 2 == 0) {
            System.out.println("Correct!");
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again," + 0);

        }


        return false;
    }
}

