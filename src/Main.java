import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String easyList = "easywordlist.txt";
        String mediumList = "mediumwordlist.txt";
        String hardList = "hardwordlist.txt";
        String wordList;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose easy, medium, or hard (e/m/h): ");
        String response = sc.nextLine();
        if (Objects.equals(response, "e")) {
            System.out.println("Easy list chosen.");
            wordList = easyList;
        } else if (Objects.equals(response, "m")) {
            System.out.println("Medium list chosen.");
            wordList = mediumList;
        } else {
            System.out.println("Hard list chosen.");
            wordList = hardList;
        }

        WordBank wordBank = new WordBank(wordList);
        String word = wordBank.getRandomWord(wordList);
        word = word.toLowerCase();

        DrawHangman draw = new DrawHangman();
        char[] array = word.toCharArray();

        char[] completedWord = new char[array.length];
        Arrays.fill(completedWord, '_');
        System.out.println(completedWord);
        int lives = 7;
        int counter;
        int addedLetters;
        Scanner kybd = new Scanner(System.in);
        for (int k = 0; k < 100; k++) {                          //change to while loop
            System.out.println("Please enter your guess");
            char guess = kybd.next().charAt(0);
            addedLetters = 0;
            counter = 0;
            for (int i = 0; i <= (array.length - 1); i++) {
                if (array[i] == guess) {                         // checks if guess is correct
                    completedWord[i] = guess;
                    addedLetters = addedLetters + 1;
                }
            }
            if (addedLetters == 0) {
                draw.drawHangman(lives);
                lives--;
                if (lives == 0) {
                    System.out.println(array);
                    break;
                }
            }

            for (char c : completedWord) System.out.print(c);
            System.out.println();

            for (int r = 0; r < array.length; r++) {            // checking if theres any blanks left
                if (completedWord[r] != '_') {
                    counter++;
                }
            }
            if (counter == array.length) {
                System.out.println("You Win!!");
                break;
            }
        }
    }
}