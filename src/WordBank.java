import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class WordBank {
    String easyList = "easywordlist.txt";
    String mediumList = "mediumwordlist.txt";
    String hardList = "hardwordlist.txt";
    String wordList;


    public WordBank() {
    }

    public WordBank(String easyList, String mediumList, String hardList, String wordList) {
        this.easyList = easyList;
        this.mediumList = mediumList;
        this.hardList = hardList;
        this.wordList = wordList;
    }

    public String getWordList() {
        return wordList;
    }

    public void setWordList(String wordList) {
        this.wordList = wordList;
    }

    public String getRandomWord(String wordList) throws FileNotFoundException {
        File f = new File(wordList);
        String result = null;
        Random random = new Random();
        int n = 0;
        Scanner sc = new Scanner(f);
        while (sc.hasNext()) {
            n++;
            String line = sc.nextLine();
            if (random.nextInt(n) == 0)
                result = line;
        }
        sc.close();
        return result;
    }

    String chooseList() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please choose easy, medium, or hard (e/m/h): ");
            String response = sc.nextLine();
            if (Objects.equals(response, "e")) {
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
        return wordList;
    }
}