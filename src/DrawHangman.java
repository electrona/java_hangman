public class DrawHangman {

    public void drawHangman(int lives) {
        //int j = 7;
        //for (int i = 0; i < 8; i++) {
        if (lives == 7) {
                System.out.println("lives left 6");
                System.out.println(" O ");
            }
        else if (lives == 6) {
                System.out.println("lives left 5");
                System.out.println(" O ");
                System.out.println("/");
            }
        else if (lives == 5) {
                System.out.println("lives left 4");
                System.out.println(" O ");
                System.out.println("/| ");
            }
        else if (lives == 4) {
                System.out.println("lives left 3");
                System.out.println(" O ");
                System.out.println("/|\\");
            }
        else if (lives == 3) {
                System.out.println("lives left 2");
                System.out.println(" O ");
                System.out.println("/|\\");
                System.out.println(" | ");
            }
        else if (lives == 2) {
                System.out.println("lives left 1");
                System.out.println(" O ");
                System.out.println("/|\\");
                System.out.println(" | ");
                System.out.println("/");
            }
        else if (lives == 1) {
                System.out.println("lives left 0");
                System.out.println(" O ");
                System.out.println("/|\\");
                System.out.println(" | ");
                System.out.println("/\\");
                System.out.println("you lose");
            }
        //lives = lives - 1;
        //return lives;

        }
    }

