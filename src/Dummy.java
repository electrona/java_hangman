import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;
public class Dummy {

    public static void main(String[] args) {
        String str = "cat";
        char[] array = str.toCharArray();
        //System.out.print(array.length);

        char[] completedWord = new char[array.length];
        for (int j = 0; j < completedWord.length; j++) {
            completedWord[j] = '_';
        }
        Scanner kybd = new Scanner(System.in);
        for (int k = 0; k < 5; k++) {                          //lives should be entered here
            System.out.println("Please enter your guess");
            char guess = kybd.next().charAt(0);
            //System.out.println(completedWord);
            for (int i = 0; i <= (array.length - 1); i++) {
                if (array[i] == guess)
                    completedWord[i] = guess;
            }
            for(int h = 0; h < (completedWord.length); h++)
                System.out.print(completedWord[h]);
            System.out.println();
            }

        }
}

