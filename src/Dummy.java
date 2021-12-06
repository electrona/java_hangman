import java.util.Scanner;
public class Dummy {

    public static void main(String[] args) {
        DrawHangman draw = new DrawHangman();
        String str = "banana";                           //change "word" to rnd word from WordBank
        char[] array = str.toCharArray();
        //System.out.print(array.length);
        char[] remainingLetters = str.toCharArray();

        char[] completedWord = new char[array.length];
        for (int j = 0; j < completedWord.length; j++) {
            completedWord[j] = '_';
        }
        System.out.println(completedWord);
        int lives = 7;
        int counter = 0;
        int addedLetters = 0;
        Scanner kybd = new Scanner(System.in);
        for (int k = 0; k < 100; k++) {                          //change to while loop
            System.out.println("Please enter your guess");
            char guess = kybd.next().charAt(0);
            //System.out.println(completedWord);
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


        }
            //System.out.println();//have to add a check for "_" to end loop
    }


}


