import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int myGuess;
        int computerNumber;
        int guessCount = 0;
        boolean correctGuess = false;
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        computerNumber = rand.nextInt(100) + 1;

        while (!correctGuess) {
            System.out.println("Enter your guess: ");
            myGuess = keyboard.nextInt();
            guessCount++;

            if (myGuess >= 1 && myGuess <= 100) {
                if (myGuess == computerNumber) {
                    System.out.println("Congratulations! You guessed the number in " + guessCount + " tries!");
                    correctGuess = true;
                }
                else if (myGuess > computerNumber) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }
            }
            else {
                System.out.println("Your guess is out of range. Please enter a number between 1 and 100.");
            }
        }

    }
}
