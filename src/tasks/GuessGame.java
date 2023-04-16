package tasks;

import java.util.Scanner;

public class GuessGame {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        guessGame();
    }

    private static void guessGame() {
        int month = 4;
        int year = 2000;
        boolean correctDate = false;
        while (!correctDate) {
            System.out.print("Guess the date of my birth month and year : ");
            int guessMonth = scanner.nextInt();
            int guessYear = scanner.nextInt();

            if (guessMonth == 0 && guessYear == 0) {
                break;
            } else if (guessMonth == month && guessYear == year) {
                System.out.println("Correct Guess!");
                correctDate = true;
            } else if (guessMonth == month || guessYear == year) {
                System.out.println("You guess one right");
            } else {
                System.out.println("Incorrect Guess");
            }
        }
    }
}
