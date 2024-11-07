package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        String command;

        do {
            System.out.println("Welcome to the Brain Games!\n" +
                    "May I have your name?");
            command = scanner.nextLine();
            System.out.println("Hello," + command);
        } while (!command.equals("0"));

        scanner.close();

    }


};
