import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        WordBank wordBank = new WordBank();
        Game game = new Game();
        String wordList = wordBank.chooseList();
        String word = wordBank.getRandomWord(wordList);
        word = word.toLowerCase();
        game.playGame(word);


    }
}