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

        char[] array = word.toCharArray();
        //System.out.print(array.length);

        char[] completedWord = new char[array.length];
        Arrays.fill(completedWord, '_');
        Scanner kybd = new Scanner(System.in);
        for (int k = 0; k < 5; k++) {                          //lives should be entered here
            System.out.println("Please enter your guess");
            char guess = kybd.next().charAt(0);
            //System.out.println(completedWord);
            for (int i = 0; i <= (array.length - 1); i++) {
                if (array[i] == guess)
                    completedWord[i] = guess;
            }
            for (char c : completedWord) System.out.print(c);
            System.out.println();
        }
    }
}
