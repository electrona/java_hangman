import java.util.Random;

public class WordBank {
    private String[] wordBank;

    public WordBank(String[] wordBank) {
        this.wordBank = wordBank;
    }

    public String[] getWordBank() {
        return wordBank;
    }

    public void setWordBank(String[] wordBank) {
        this.wordBank = wordBank;
    }

    public String getRandomWord() {
        int rnd = new Random().nextInt(wordBank.length);
        return wordBank[rnd];

    }

}