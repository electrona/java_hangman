import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        WordBank wordBank = new WordBank();
        Game game = new Game();
        String playAgain;
        do {
        String wordList = wordBank.chooseList();
        String word = wordBank.getRandomWord(wordList);
        word = word.toLowerCase();
            game.playGame(word);
            System.out.println();
            System.out.print("Would you like to play again? (y/n) ");
            playAgain = sc.nextLine();
            System.out.println();
        } while (playAgain.equals("y"));


    }
}