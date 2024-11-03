package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void game(int num) {
        Cli.greeting();
        System.out.println("Answer 'yes' if the number is even? otherwise answer 'no'.");
        int num = new num();

        Scanner scanner = new Scanner(System.in);

        String command;
        command = scanner.nextLine();
        System.out.println("Question: " + command);
    }
}
