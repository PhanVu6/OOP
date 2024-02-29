package Week_3;

import java.util.Scanner;

public class DecisionAndLoopsHomework {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);

        // 1.1 Number Guess
        guessNumber(inpScanner);
        System.out.println();
        // 1.2 Word Guess
        guessWord(inpScanner);
    }

    // 1.1 Number Guess
    public static void guessNumber(Scanner inpScanner) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        guessNumber(SECRET_NUMBER, inpScanner);
    }

    public static void guessNumber(int number, Scanner in) {
        System.out.println("Key in your guess:");
        int numGuess = in.nextInt();
        boolean check = false;
        int count = 0;

        while (!check) {

            if (numGuess == number) {
                System.out.printf("You got it in %d trial's", count);
                check = true;
            } else if (numGuess < number) {
                System.out.println("Try higher");
                numGuess = in.nextInt();
            } else if (numGuess > number) {
                System.out.println("Try lower");
                numGuess = in.nextInt();
            }

            count++;
        }
    }

    // 1.2 Word Guess
    public static void guessWord(Scanner inpScanner) {
        System.out.print("Key in one character or your guess word: ");
        String guessString = inpScanner.next();
        guessWord(guessString, inpScanner);
    }

    public static void guessWord(String guessedString, Scanner in) {
        String[] arrayWordToGuess = { "testing", "coatching", "matching" };
        String temporaryStringContainer = "";
        int count = 1;
        final int INDEX_WORD = (int) (Math.random() * (arrayWordToGuess.length));

        for (char word : arrayWordToGuess[INDEX_WORD].toCharArray()) {
            temporaryStringContainer += "_";
        }
        arrayWordToGuess[INDEX_WORD].toLowerCase();
        while (true) {

            if (guessedString.equals(arrayWordToGuess[INDEX_WORD])) {
                System.out.println("Congratulation!");
                System.out.printf("You got it %d trial", count);
                break;
            } else {
                for (int i = 0; i < arrayWordToGuess[INDEX_WORD].length(); i++) {
                    if (guessedString.charAt(0) == arrayWordToGuess[INDEX_WORD].charAt(i)) {
                        temporaryStringContainer = temporaryStringContainer.substring(0, i)
                                + guessedString.charAt(0)
                                + temporaryStringContainer.substring(i + 1);
                    }
                }
                System.out.printf("Trial %d: %s", count, temporaryStringContainer);
                System.out.println();
                System.out.print("Key in one character or your guess word: ");
                guessedString = in.next();
            }
            count++;
        }
    }
}
