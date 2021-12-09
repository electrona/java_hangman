/**
 *  Draw the hangman
 */
public class DrawHangman {
    /**
     * Draw hangman based on remaining lives
     * @param lives number of lives remaining
     */
    public void drawHangman(int lives) {
        if (lives == 7) {
            System.out.println("  __________..________      ");
            System.out.println("  | |________))______|                 ");
            System.out.println("  | |/ /                     ");
            System.out.println("  | | /                                 ");
            System.out.println("  | |/                               ");
            System.out.println("  | |                             ");
            System.out.println("  | |                                    ");
            System.out.println("  | |                               ");
            System.out.println("  | |                                   ");
            System.out.println("  | |                                     ");
            System.out.println("  | |                                     ");
            System.out.println("  | |     `                    ");
            System.out.println("  | |                                  ");
            System.out.println("  | |                                  ");
            System.out.println("  | |                                      ");
            System.out.println("  | |____________________________                   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|        ");
            System.out.println("  | |____________________________|        ");
            System.out.println("Lives left: 6");
            }
        else if (lives == 6) {
            System.out.println("  __________..________      ");
            System.out.println("  | |________))______|                 ");
            System.out.println("  | |/ /     ||          ");
            System.out.println("  | | /      ||                  ");
            System.out.println("  | |/       || ,#####,                     ");
            System.out.println("  | |        |/  0  0  |                     ");
            System.out.println("  | |        ||    >    |             ");
            System.out.println("  | |         \\,__o__,/            ");
            System.out.println("  | |                           ");
            System.out.println("  | |                                ");
            System.out.println("  | |                                   ");
            System.out.println("  | |                                    ");
            System.out.println("  | |                                 ");
            System.out.println("  | |                            ");
            System.out.println("  | |                              ");
            System.out.println("  | |____________________________                   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|        ");
            System.out.println("  | |____________________________|        ");
            System.out.println("Lives left: 5");
            }
        else if (lives == 5) {
            System.out.println("  __________..________      ");
            System.out.println("  | |________))______|                 ");
            System.out.println("  | |/ /     ||          ");
            System.out.println("  | | /      ||                  ");
            System.out.println("  | |/       || ,#####,                     ");
            System.out.println("  | |        |/  0  0  |                     ");
            System.out.println("  | |        ||    >    |             ");
            System.out.println("  | |         \\,__o__,/            ");
            System.out.println("  | |          --|  |--             ");
            System.out.println("  | |          |      |             ");
            System.out.println("  | |          |      |              ");
            System.out.println("  | |          |______|           ");
            System.out.println("  | |                              ");
            System.out.println("  | |                                      ");
            System.out.println("  | |                                   ");
            System.out.println("  | |____________________________                   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|        ");
            System.out.println("  | |____________________________|        ");
            System.out.println("Lives left: 4");
            }
        else if (lives == 4) {
            System.out.println("  __________..________      ");
            System.out.println("  | |________))______|                 ");
            System.out.println("  | |/ /     ||          ");
            System.out.println("  | | /      ||                  ");
            System.out.println("  | |/       || ,#####,                     ");
            System.out.println("  | |        |/  0  0  |                     ");
            System.out.println("  | |        ||    >    |             ");
            System.out.println("  | |         \\,__o__,/            ");
            System.out.println("  | |      ||----|  |--            ");
            System.out.println("  | |      ||--|      |                ");
            System.out.println("  | |      ||  |      |                 ");
            System.out.println("  | |     ` )  |______|                ");
            System.out.println("  | |                                ");
            System.out.println("  | |                                 ");
            System.out.println("  | |                                  ");
            System.out.println("  | |____________________________                   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|        ");
            System.out.println("  | |____________________________|        ");
            System.out.println("Lives left: 3");
            }
        else if (lives == 3) {
            System.out.println("  __________..________      ");
            System.out.println("  | |________))______|                 ");
            System.out.println("  | |/ /     ||          ");
            System.out.println("  | | /      ||                  ");
            System.out.println("  | |/       || ,#####,                     ");
            System.out.println("  | |        |/  0  0  |                     ");
            System.out.println("  | |        ||    >    |             ");
            System.out.println("  | |         \\,__o__,/            ");
            System.out.println("  | |      ||----|  |----||            ");
            System.out.println("  | |      ||--|      |--||              ");
            System.out.println("  | |      ||  |      |  ||             ");
            System.out.println("  | |     ` )  |______|  ( '           ");
            System.out.println("  | |                           ");
            System.out.println("  | |                        ");
            System.out.println("  | |                             ");
            System.out.println("  | |____________________________                   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|        ");
            System.out.println("  | |____________________________|        ");
            System.out.println("Lives left: 2");
            }
        else if (lives == 2) {
            System.out.println("  __________..________      ");
            System.out.println("  | |________))______|                 ");
            System.out.println("  | |/ /     ||          ");
            System.out.println("  | | /      ||                  ");
            System.out.println("  | |/       || ,#####,                     ");
            System.out.println("  | |        |/  0  0  |                     ");
            System.out.println("  | |        ||    >    |             ");
            System.out.println("  | |         \\,__o__,/            ");
            System.out.println("  | |      ||----|  |----||            ");
            System.out.println("  | |      ||--|      |--||              ");
            System.out.println("  | |      ||  |      |  ||             ");
            System.out.println("  | |     ` )  |      |  ( '           ");
            System.out.println("  | |          | |----|                 ");
            System.out.println("  | |          | |                      ");
            System.out.println("  | |          | |                        ");
            System.out.println("  | |_________{  |_______________                   ");
            System.out.println("  | |_________````_______________|   ");
            System.out.println("  | |____________________________|   ");
            System.out.println("  | |____________________________|        ");
            System.out.println("  | |____________________________|        ");
            System.out.println("Lives left: 1");
            }
        else if (lives == 1) {
            System.out.println("  __________..________      ");
            System.out.println("  | |________))______|                 ");
            System.out.println("  | |/ /     ||          ");
            System.out.println("  | | /      ||                  ");
            System.out.println("  | |/       || ,#####,                     ");
            System.out.println("  | |        |/  X  X  |                     ");
            System.out.println("  | |        ||    >    |             ");
            System.out.println("  | |         \\,__o__,/            ");
            System.out.println("  | |      ||----|  |----||            ");
            System.out.println("  | |      ||--|      |--||              ");
            System.out.println("  | |      ||  |      |  ||             ");
            System.out.println("  | |     ` )  |      |  ( '           ");
            System.out.println("  | |          | |--| |                 ");
            System.out.println("  | |          | |  | |                  ");
            System.out.println("  | |          | |  | |                    ");
            System.out.println("  | |_______  {  |  |  }   ______                   ");
            System.out.println("  | |_______| ````  ````  /______|   ");
            System.out.println("  | |_______|             /______|   ");
            System.out.println("  | |________|__________/________|        ");
            System.out.println("  | |____________________________|        ");
            System.out.println("GAME OVER");
            }
        }
    }
