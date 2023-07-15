import java.util.Scanner;
import java.lang.Math;

public class guessinggame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int answer = (int) (Math.random() * 100) + 1;
        // Number of attempts that the user has to guess the number
        int attempts = 7;
        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Enchanted Guessing Game!");
        System.out.println("The mystical oracle has chosen a number between 1 and 100.");
        System.out.println("You have " + attempts + " attempts to uncover the magical secret!");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            if (guess == answer) {
                System.out.println("Congratulations! You've discovered the magical secret!");
                celebrateVictory();
                break;
            } else if (guess > answer) {
                System.out.println("Alas! Your guess is too high, like a soaring dragon in the sky.");
            } else {
                System.out.println("Oh no! Your guess is too low, like a tiny firefly in the night.");
            }

            attempts--;
            System.out.println("Remaining attempts: " + attempts);
            System.out.println();
        }

        if (attempts == 0) {
            System.out.println("Oh dear! You've run out of attempts.");
            System.out.println("The magical secret was: " + answer);
            displayFarewellMessage();
        }
    }

    private static void celebrateVictory() {
        System.out.println("***********");
        System.out.println("*                           *");
        System.out.println("*        Congratulations!   *");
        System.out.println("*        You are a true     *");
        System.out.println("*        magical champion!  *");
        System.out.println("*                           *");
        System.out.println("***********");
    }

    private static void displayFarewellMessage() {
        System.out.println("***********");
        System.out.println("*                           *");
        System.out.println("*       Oh no! You didn't   *");
        System.out.println("*       uncover the secret. *");
        System.out.println("*    Keep searching for the *");
        System.out.println("*     magic within you!     *");
        System.out.println("*                           *");
        System.out.println("***********");
    }
}