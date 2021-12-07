public class DrawHangman {

    public void drawHangman(int lives) {
        if (lives == 7) {
            System.out.println(" O ");
            System.out.println("lives left 6");
            }
        else if (lives == 6) {
            System.out.println(" O ");
            System.out.println("/");
            System.out.println("lives left 5");
            }
        else if (lives == 5) {
            System.out.println(" O ");
            System.out.println("/| ");
            System.out.println("lives left 4");
            }
        else if (lives == 4) {
            System.out.println(" O ");
            System.out.println("/|\\");
            System.out.println("lives left 3");
            }
        else if (lives == 3) {

            System.out.println(" O ");
            System.out.println("/|\\");
            System.out.println(" | ");
            System.out.println("lives left 2");
            }
        else if (lives == 2) {

            System.out.println(" O ");
            System.out.println("/|\\");
            System.out.println(" | ");
            System.out.println("/");
            System.out.println("lives left 1");
            }
        else if (lives == 1) {
            System.out.println(" O ");
            System.out.println("/|\\");
            System.out.println(" | ");
            System.out.println("/ \\");
            System.out.println();
            System.out.println("lives left 0");
            System.out.println("you lose");
            }
        }
    }

