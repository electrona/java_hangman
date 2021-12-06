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
        int newCounter = 0;
        int oldCounter = completedWord.length;
        int counter = 0;
       // int rightCounter = 0;
        Scanner kybd = new Scanner(System.in);
        for (int k = 0; k < 100; k++) {                          //change to while loop
            System.out.println("Please enter your guess");
            char guess = kybd.next().charAt(0);
            //System.out.println(completedWord);
            //int lives = 7;
            for (int i = 0; i <= (array.length - 1); i++) {
                if (array[i] == guess) {                         // checks if guess is correct
                    completedWord[i] = guess;
                    //rightCounter = rightCounter + 1;
                } else if (completedWord[i] == '_') {                     //identifying if guess was correct, if not use drawHangman()
                    newCounter = newCounter + 1;
                }

                if (newCounter >= oldCounter) {
                    draw.drawHangman(lives);
                    System.out.println(oldCounter);
                    System.out.println(newCounter);
                    lives--;
                    oldCounter = 0;
                    newCounter = 0;
                    if (lives == 0) {
                        System.out.println(array);
                        break;
                    }
                }
            }
        }
            for (int h = 0; h < (completedWord.length); h++)
                System.out.print(completedWord[h]);

            for (int i = 0; i < array.length; i++) {
                if (array[i] == completedWord[i]) {
                    counter++;
                    if(counter == array.length){
                        break;
                    }
                }
            }
            System.out.println();//have to add a check for "_" to end loop
    }
        //lives--;


}


