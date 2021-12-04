public class Main {

    public static void main(String[] args) {
        String[] wordList = new String[]{"test", "garage", "house", "chair"};

        WordBank wordBank = new WordBank(wordList);
        String word = wordBank.getRandomWord();

        System.out.println(word);




    }
}
