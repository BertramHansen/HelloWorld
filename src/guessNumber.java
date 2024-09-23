import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1;
        int userGuess = -1;
        int numberOfGuesses = 0;
        //Prompt to user
        System.out.print("Please guess a number between 1-10: ");

        //Wile loop der fortsætter så længe userGuess ikke er det samme som numberToGuess
        while (userGuess != numberToGuess) {
            numberOfGuesses = numberOfGuesses + 1;

            userGuess = input.nextInt();
            if (userGuess > numberToGuess) {
                System.out.println("The number is smaller than what you just guessed!! Number of guesses: " + numberOfGuesses);
            } else if (userGuess < numberToGuess) {
                System.out.println("The number is bigger than what you just guessed!!Number of guesses: " + numberOfGuesses);
            }
        }
            if (userGuess == numberToGuess && numberOfGuesses == 1) {
            System.out.println("Lucky you! Congratz!! you only used 1 try!");
        }    else if (userGuess == numberToGuess) {
            System.out.println("Congratz that is correct! Number of guesses: " + numberOfGuesses);
        }
    }
}



