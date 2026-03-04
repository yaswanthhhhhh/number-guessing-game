import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Number Guessing Game");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (userGuess != numberToGuess) {

            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } 
            else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } 
            else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Attempts: " + attempts);
            }
        }

        sc.close();
    }
}
