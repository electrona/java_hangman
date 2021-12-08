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
        while (true) {
            System.out.println("Please choose easy, medium, or hard (e/m/h): ");
            String response = sc.nextLine();
            if (Objects.equals(response, "e")) {                  //add validation to the choice
                System.out.println("Easy list chosen.");
                wordList = easyList;
                break;
            } else if (Objects.equals(response, "m")) {
                System.out.println("Medium list chosen.");
                wordList = mediumList;
                break;
            } else if (Objects.equals(response, "h")) {
                System.out.println("Hard list chosen.");
                wordList = hardList;
                break;
            } else {
                System.out.println("Invalid Selection");
            }
        }
        WordBank wordBank = new WordBank(wordList);
        String word = wordBank.getRandomWord(wordList);
        word = word.toLowerCase();                               //changed to .toLowerCase for ease of testing

        //Send below code into Game?
        //link above code into WordBank
        //new
        DrawHangman draw = new DrawHangman();
        String wordToBeGuessed = word;
        char[] arrayOfWord = wordToBeGuessed.toCharArray();

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
                    System.out.print("The word was: " );
                    for (char c : arrayOfWord) System.out.print(c);
                    System.out.println();
                    break;
                }
            }
            System.out.println();
            for (char c : completedWord) System.out.print(c);
            System.out.println();

            for (int r = 0; r < arrayOfWord.length; r++) {            // checking if theres any blanks left
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