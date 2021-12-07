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
        word = word.toUpperCase();
<<<<<<< HEAD
        System.out.println(word);
<<<<<<< Updated upstream
=======
        //new
        DrawHangman draw = new DrawHangman();
        String str = word;                           //change "word" to rnd word from WordBank
        char[] array = str.toCharArray();
        //System.out.print(array.length);
        char[] remainingLetters = str.toCharArray();

        char[] completedWord = new char[array.length];
        for (int j = 0; j < completedWord.length; j++) {
            completedWord[j] = '_';
        }
        System.out.println(completedWord);
        int lives = 7;
<<<<<<< Updated upstream
        int counter = 0;
        int addedLetters = 0;
        Scanner kybd = new Scanner(System.in);
        for (int k = 0; k < 100; k++) {                          //change to while loop
            System.out.println("Please enter your guess");
            char guess = kybd.next().charAt(0);
            //System.out.println(completedWord);
=======
        int counter;
        int addedLetters;
        //Scanner kybd = new Scanner(System.in);
        for (int k = 0; k < 100; k++) {                          //change to while loop
            System.out.println("Please enter your guess");
            char guess = sc.next().charAt(0);
>>>>>>> Stashed changes
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

            for (int h = 0; h < (completedWord.length); h++)
                System.out.print(completedWord[h]);
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

            //end of new
=======

>>>>>>> main
        char[] array = word.toCharArray();
        //System.out.print(array.length);

        char[] completedWord = new char[array.length];
        Arrays.fill(completedWord, '_');
        Scanner kybd = new Scanner(System.in);
        for (int k = 0; k < 5; k++) {                          //lives should be entered here
            System.out.println("Please enter your guess");
            char guess = kybd.next().charAt(0);
<<<<<<< HEAD
            
=======
>>>>>>> main
            //System.out.println(completedWord);
            for (int i = 0; i <= (array.length - 1); i++) {
                if (array[i] == guess)
                    completedWord[i] = guess;
            }
            for (char c : completedWord) System.out.print(c);
            System.out.println();
        }
<<<<<<< HEAD
>>>>>>> Stashed changes
=======
>>>>>>> main
    }
}
