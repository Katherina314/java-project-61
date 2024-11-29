package hexlet.code;

public class Calculator {
    static final int MAX_OPERAND_VALUE = 100;
    static final String GAME_RULE = "What is the result of the expression?";
    static final String[] OPERATIONS = {"+", "-", "*"};

    public static void run() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS_OF_GAME][Engine.QA_FOR_ONE_ROUND];

        for (var i = 0; i < Engine.MAX_ROUNDS_OF_GAME; i++) {
            questionsAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAnswers, GAME_RULE);
    }

    static String[] generateRoundData() {
        String[] round = new String[Engine.QA_FOR_ONE_ROUND];

        var firstNumber = Utils.randomNumber(MAX_OPERAND_VALUE);
        var secondNumber = Utils.randomNumber(MAX_OPERAND_VALUE);
        var operator = Utils.randomNumber(OPERATIONS.length);

        var question = firstNumber + " " + OPERATIONS[operator] + " " + secondNumber;
        var answer = calculate(firstNumber, secondNumber, OPERATIONS[operator]);

        round[Engine.QUESTION_INDEX] = question;
        round[Engine.ANSWER_INDEX] = String.valueOf(answer);

        return round;
    }

    static int calculate(int firstNumber, int secondNumber, String operation) {
        return switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Unknown operation: " + operation);
        };
    }


}