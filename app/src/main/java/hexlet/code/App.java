package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command;

        do {
            System.out.println("Please enter the game number and press Enter");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("0 - Exit");

            command = scanner.nextLine();

            switch (command) {
                case "1":
                    Cli.greeting();
                    break;

                case "0":
                    System.out.println("Goodbuy!");
                    break;
            }
            ;

        }while (!command.equals("0"));



    };
};














