package hexlet.code;

import java.util.Scanner;
import hexlet.code.Even;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next();

        switch (userAnswer) {
                case "1":
                    Cli.greeting();
                    break;

                case "2":
                    Even.run();
                    break;

            default:
                return;
        }
            scanner.close();

    };
};














