import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class WordBank {
    private String wordList;


    public WordBank(String wordList) {
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
}