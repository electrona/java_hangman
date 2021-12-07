import java.io.FileNotFoundException;
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
        if (Objects.equals(response, "e")) {                  //add validation to the choice
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
        word = word.toLowerCase();                               //changed to .toLowerCase for ease of testing

        //Send below code into Game?
        //link above code into WordBank
        //new
        DrawHangman draw = new DrawHangman();
        String wordToBeGuessed = word;                           //changed variable names to more accurate names
        char[] arrayOfWord = wordToBeGuessed.toCharArray();

        char[] completedWord = new char[arrayOfWord.length];
        for (int j = 0; j < completedWord.length; j++) {
            completedWord[j] = '_';
        }
        System.out.println("The word is " + completedWord.length + " letters long");
        System.out.println(completedWord);
        System.out.println();
        int lives = 7;
        int counter;
        int addedLetters;
        for (int k = 0; k < 100; k++) {                          //change to while loop
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
                    for (int w = 0; w < arrayOfWord.length; w++)
                        System.out.print(arrayOfWord[w]);
                    System.out.println();
                    break;
                }
            }
            System.out.println();
            for (int h = 0; h < (completedWord.length); h++)
                System.out.print(completedWord[h]);
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