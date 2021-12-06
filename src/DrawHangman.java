public class DrawHangman {

    public void drawHangman() {
        for (int i = 0; i < 8; i++) {
            if (i == 1) {
                System.out.println("lives left 6");
                System.out.println(" O ");
            } else if (i == 2) {
                System.out.println("lives left 5");
                System.out.println(" O ");
                System.out.println("/");
            } else if (i == 3) {
                System.out.println("lives left 4");
                System.out.println(" O ");
                System.out.println("/| ");
            } else if (i == 4) {
                System.out.println("lives left 3");
                System.out.println(" O ");
                System.out.println("/|\\");
            } else if (i == 5) {
                System.out.println("lives left 2");
                System.out.println(" O ");
                System.out.println("/|\\");
                System.out.println(" | ");
            } else if (i == 6) {
                System.out.println("lives left 1");
                System.out.println(" O ");
                System.out.println("/|\\");
                System.out.println(" | ");
                System.out.println("/");
            } else if (i == 7) {
                System.out.println("lives left 0");
                System.out.println(" O ");
                System.out.println("/|\\");
                System.out.println(" | ");
                System.out.println("/\\");
                System.out.println("you lose");
            }

        }
    }
    }
