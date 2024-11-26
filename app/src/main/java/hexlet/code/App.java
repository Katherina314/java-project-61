package hexlet.code;

import hexlet.code.Calculator;
import hexlet.code.Even;
import hexlet.code.GCD;
import hexlet.code.Prime;
import hexlet.code.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        System.out.println("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next();

        switch (userAnswer) {
                case "1":
                    Cli.greeting();
                    break;

                case "2":
                    Even.run();
                    break;

                case "3":
                    Calculator.run();
                    break;

                case "4":
                    GCD.run();
                    break;

                case "5":
                    Progression.run();
                    break;

                case "6":
                    Prime.run();
                    break;

                case "0":
                    break;

            default:
                return;
        }
            scanner.close();

    };
};














