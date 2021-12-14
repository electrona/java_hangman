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
     * Display word length
     * @param completedWord completed word
     */
    void displayWordLength(char[] completedWord) {
        System.out.println("The word is " + completedWord.length + " letters long");

    }

    /**
     * Display word blanks
     * @param completedWord completed word
     */
    void displayBlankWord(char[] completedWord) {
        Arrays.fill(completedWord, '_');
        System.out.println(completedWord);
        System.out.println();
    }

    /**
     * Get guess from player
     * @return guess
     */
    char enterGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your guess: ");
        return sc.next().charAt(0);
    }


    /**
     * Show word in play
     * @param lives lives left
     * @param arrayOfWord game word
     */
    void displayGameWord(int lives, char[] arrayOfWord) {
        if (lives == 0) {
            System.out.println();
            System.out.print("The word was: ");
            for (char c : arrayOfWord) System.out.print(c);
            System.out.println();
            //break;
        }
    }


    /**
     * Play game
     * @param word word to play game with
     */
    void playGame(String word) {
        DrawHangman draw = new DrawHangman();
        char[] arrayOfWord = word.toCharArray();
        char[] completedWord = new char[arrayOfWord.length];
        displayWordLength(completedWord);
        displayBlankWord(completedWord);
        int lives = 7;
        for (int k = 0; k < 100; k++) {
            char guess = enterGuess();
            int addedLetters = 0;
            for (int i = 0; i <= (arrayOfWord.length - 1); i++) {
                if (arrayOfWord[i] == guess) {
                    completedWord[i] = guess;
                    addedLetters++;
                }
            }
            if (addedLetters == 0) {
                draw.drawHangman(lives);
                lives--;
                displayGameWord(lives, arrayOfWord);
                if (lives == 0) {
                    break;
                }
            }
            System.out.println();
            for (char c : completedWord) System.out.print(c);
            System.out.println();
            int counter = 0;
            for (int r = 0; r < arrayOfWord.length; r++) {
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
