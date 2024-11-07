package hexlet.code;

import java.util.Scanner;

public class Even {
    private static int Random;

    public static int run() {
        Cli.greeting();
        System.out.println("Answer 'yes' if the number is even? otherwise answer 'no'.");

        int question = Random;
        System.out.println("Question:" + question);

        Scanner scanner = new Scanner(System.in);

        String command;

        command = scanner.nextLine();
        System.out.println("Your answer:" + command);
        return question;
    }



}

