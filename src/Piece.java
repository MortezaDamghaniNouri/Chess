import java.awt.*;

/**
 * it specifies the pieces of chess.
 *
 * @author Morteza Damghani.
 * @version 1.
 */
public abstract class Piece {

    private boolean existence;
    private int x;
    private int y;
    private String color;
    private int index;

    public Piece(boolean existence, int x, int y, String c, int i) {
        this.existence = existence;
        this.x = x;
        this.y = y;
        color = c;
        index = i;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int i) {
        index = i;
    }

    public void setExistence(boolean state) {
        existence = state;
    }

    public boolean getExistence() {
        return existence;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setColor(String s) {
        color = s;
    }

    public String getColor() {
        return color;
    }

    /**
     * it moves the bead according to its kind.
     *
     * @param currentX,    the place.
     * @param currentY,the place of the bead.
     * @param nextX,       the place of the bead we want it to go.
     * @param nextY,the    the place of the bead we want it to go.
     * @param field        ,it is an array of object of place class.
     * @return it is a boolean variable which shows that the movement was successful or not.
     */
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place[][] field, NewGraphic chessMainGraphic) {
        if (currentX == x && currentY == y) {

            if (nextX > 7 || nextY > 7 || nextX < 0 || nextY < 0)
                return false;

        }
        return true;

    }

    /**
     * it checks the entered square of the field of the game ,to consider if there is a black king or not.
     *
     * @param x     the x of the square which we want to check.
     * @param y     the x of the square which we want to check.
     * @param field the field of the game.
     * @return a boolean variable which shows that if there is a black king in the entered square or not.
     */
    public boolean blackKingChecker(int x, int y, Place field[][]) {
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            if (field[y][x].getPiece() != null && field[y][x].getPiece().getIndex() == 2000) return true;
            else return false;

        } else return false;

    }

    /**
     * it checks the entered square of the field of the game ,to consider if there is a white king or not.
     *
     * @param x     the x of the square which we want to check.
     * @param y     the x of the square which we want to check.
     * @param field the field of the game.
     * @return a boolean variable which shows that if there is a white king in the entered square or not.
     */
    public boolean whiteKingChecker(int x, int y, Place field[][]) {
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            if (field[y][x].getPiece() != null && field[y][x].getPiece().getIndex() == 1000) return true;
            else return false;

        } else return false;

    }

    public abstract boolean check(int currentX, int currentY, Place field[][]);

    /**
     * it changes the frame which is used in GUI according to the condition of the game.
     * /**
     *
     * @param currentX         the current place(x) of the piece.
     * @param currentY         the current place(y)of the piece.
     * @param nextX,           the place(x) of the bead we want it to go.
     * @param nextY,the        the place(y) of the bead we want it to go.
     * @param field            it is an array of objects of place class which simulates the field of chess.
     * @param chessMainGraphic it is an object of graphical interface of the game.
     * @return it returns a boolean variable which shows that if the movement was done or that was invalid.
     */

    public void changeMainButtonsIcons(int currentX, int currentY, int nextX, int nextY, Place field[][], NewGraphic chessMainGraphic) {
        if (field[nextY][nextX].getPiece() == null) {
            chessMainGraphic.getMainButtons()[8 - nextY][nextX + 1].setIcon(chessMainGraphic.getMainButtons()[8 - currentY][currentX + 1].getIcon());
            chessMainGraphic.getMainButtons()[8 - currentY][currentX + 1].setIcon(null);

        } else {
            chessMainGraphic.getMainButtons()[8 - nextY][nextX + 1].setIcon(chessMainGraphic.getMainButtons()[8 - currentY][currentX + 1].getIcon());
            chessMainGraphic.getMainButtons()[8 - currentY][currentX + 1].setIcon(null);
            changeSideButtonsBackgrounds(field[nextY][nextX].getPiece().getIndex(), chessMainGraphic);


        }


    }

    /**
     * it changes the side panel in the main frame of theGUI of the game according to the condition of the game.
     *
     * @param index            the id of each piece.
     * @param chessMainGraphic an object of main graphic class of the game.
     */
    public void changeSideButtonsBackgrounds(int index, NewGraphic chessMainGraphic) {
        if (index / 100 == 1) {
            if (index % 100 == 11) {
                chessMainGraphic.getWhiteSideButtons()[2][1].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 12) {
                chessMainGraphic.getWhiteSideButtons()[2][8].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 21) {
                chessMainGraphic.getWhiteSideButtons()[2][2].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 22) {
                chessMainGraphic.getWhiteSideButtons()[2][7].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 31) {
                chessMainGraphic.getWhiteSideButtons()[2][3].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 32) {
                chessMainGraphic.getWhiteSideButtons()[2][6].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 41) {
                chessMainGraphic.getWhiteSideButtons()[1][1].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 42) {
                chessMainGraphic.getWhiteSideButtons()[1][2].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 43) {
                chessMainGraphic.getWhiteSideButtons()[1][3].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 44) {
                chessMainGraphic.getWhiteSideButtons()[1][4].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 45) {
                chessMainGraphic.getWhiteSideButtons()[1][5].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 46) {
                chessMainGraphic.getWhiteSideButtons()[1][6].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 47) {
                chessMainGraphic.getWhiteSideButtons()[1][7].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 48) {
                chessMainGraphic.getWhiteSideButtons()[1][8].setBackground(new Color(168, 17, 13));
            }


        }


        if (index / 100 == 2) {
            if (index % 100 == 11) {
                chessMainGraphic.getBlackSideButtons()[1][1].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 12) {
                chessMainGraphic.getBlackSideButtons()[1][8].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 21) {
                chessMainGraphic.getBlackSideButtons()[1][2].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 22) {
                chessMainGraphic.getBlackSideButtons()[1][7].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 31) {
                chessMainGraphic.getBlackSideButtons()[1][3].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 32) {
                chessMainGraphic.getBlackSideButtons()[1][6].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 41) {
                chessMainGraphic.getBlackSideButtons()[2][1].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 42) {
                chessMainGraphic.getBlackSideButtons()[2][2].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 43) {
                chessMainGraphic.getBlackSideButtons()[2][3].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 44) {
                chessMainGraphic.getBlackSideButtons()[2][4].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 45) {
                chessMainGraphic.getBlackSideButtons()[2][5].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 46) {
                chessMainGraphic.getBlackSideButtons()[2][6].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 47) {
                chessMainGraphic.getBlackSideButtons()[2][7].setBackground(new Color(168, 17, 13));
            }
            if (index % 100 == 48) {
                chessMainGraphic.getBlackSideButtons()[2][8].setBackground(new Color(168, 17, 13));
            }

        }
        if (index == 1) {
            chessMainGraphic.getWhiteSideButtons()[2][4].setBackground(new Color(168, 17, 13));
        }
        if (index == 2) {
            chessMainGraphic.getBlackSideButtons()[1][4].setBackground(new Color(168, 17, 13));
        }

    }


}
