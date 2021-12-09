import java.util.Arrays;
import java.util.Scanner;

/**
 * Run game
 */
public class Game {

    /**
     * Import Game class
     */
    public Game() {
    }

    /**
     * Play game
     * @param word word to play game with
     */
    void playGame(String word) {
        Scanner sc = new Scanner(System.in);
        DrawHangman draw = new DrawHangman();
        char[] arrayOfWord = word.toCharArray();
        char[] completedWord = new char[arrayOfWord.length];
        Arrays.fill(completedWord, '_');
        System.out.println("The word is " + completedWord.length + " letters long");
        System.out.println(completedWord);
        System.out.println();
        int lives = 7;
        int counter;
        int addedLetters;
        for (int k = 0; k < 100; k++) {
            System.out.println("Please enter your guess: ");
            char guess = sc.next().charAt(0);
            addedLetters = 0;
            counter = 0;
            for (int i = 0; i <= (arrayOfWord.length - 1); i++) {
                if (arrayOfWord[i] == guess) {                         // checks if guess is correct
                    completedWord[i] = guess;
                    addedLetters = addedLetters + 1;
                }
            }
            if (addedLetters == 0) {
                System.out.println();
                draw.drawHangman(lives);
                lives--;
                if (lives == 0) {
                    System.out.println();
                    System.out.print("The word was: ");
                    for (char c : arrayOfWord) System.out.print(c);
                    System.out.println();
                    break;
                }
            }
            System.out.println();
            for (char c : completedWord) System.out.print(c);
            System.out.println();

            for (int r = 0; r < arrayOfWord.length; r++) {            // checking if there's any blanks left
                if (completedWord[r] != '_') {
                    counter++;
                }
            }
            if (counter == arrayOfWord.length) {
                System.out.println("You Win!!");
                break;
            }
            System.out.println();
        }
    }



}
