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
        System.out.println(word);
    }
}
