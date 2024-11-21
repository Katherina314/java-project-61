package hexlet.code;

public class GCD {
    static final int MAX_OPERAND_VALUE = 100;
    static final String GAME_RULE = "count GCD for these numbers";


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


        var question = firstNumber + " " + secondNumber;
        var answer = Gcd(firstNumber, secondNumber);


        round[Engine.QUESTION_INDEX] = String.valueOf(question);
        round[Engine.ANSWER_INDEX] = String.valueOf(answer);

        return round;
    }

    static int Gcd(int dividend, int divisor) {
        if (divisor > dividend) {
            var temp = dividend;

            dividend = divisor;
            divisor = temp;
        }

        var gcd = divisor;
        var remainderFromDivision = dividend % divisor;

        while (remainderFromDivision != 0) {
            gcd = divisor;

            remainderFromDivision = dividend % divisor;

            dividend = divisor;
            divisor = remainderFromDivision;
        }

        return gcd;
    }
}