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
     * Check if guess is correct
     * @param arrayOfWord game word
     * @param completedWord completed word
     * @param i position of guess
     * @param guess guess
     * @param addedLetters count of added letters
     */
    void checkGuess(char[] arrayOfWord, char[] completedWord, int i, char guess, int addedLetters) {
        if (arrayOfWord[i] == guess) {
            completedWord[i] = guess;
        }
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
            break;
        }
    }

    /**
     * Check if game is won
     * @param arrayOfWord game word
     * @param completedWord completed word
     */
    void checkWin(char[] arrayOfWord, char[] completedWord) {
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
        int addedLetters = 0;
        for (int k = 0; k < 100; k++) {
            char guess = enterGuess();
            for (int i = 0; i <= (arrayOfWord.length - 1); i++) {
               checkGuess(arrayOfWord, completedWord, i, guess, addedLetters);
               addedLetters = addedLetters + 1;
            }
            if (addedLetters == 0) {
                draw.drawHangman(lives);
                lives--;
                displayGameWord(lives, completedWord);
            }
            System.out.println();
            for (char c : completedWord) System.out.print(c);
            System.out.println();

            checkWin(arrayOfWord, completedWord);
        }
    }



}
