package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);


            System.out.println("Welcome to the Brain Games!\n" +
                    "May I have your name?");
            String user = scanner.nextLine();
            System.out.println("Hello, " + user + "!");



    }


};
