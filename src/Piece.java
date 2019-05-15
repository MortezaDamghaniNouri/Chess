/**
 * it specifies the beads of the chess.
 *
 * @author Morteza Damghani
 * @version 1
 */
public class Piece {

    private boolean existence;
    private int x;
    private int y;
    private String color;
    private int index;

    public Piece(boolean existence, int x, int y, String c, int i) {
        existence = true;
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
     * @return true or false.
     */
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place[][] field) {
        if (currentX == x && currentY == y) {

            if (nextX > 7 || nextY > 7 || nextX < 0 || nextY < 0)
                return false;

        }
        return true;

    }

    /**
     * it checks that if a bead can go to entered place or not.
     * @param pieces , it is an array of all the beads.
     * @param field ,it is the field of the game.
     * @return true or false ,if the entered bead can go there it returns true and if it can not go there it returns false.
     */
    /*public boolean check(ArrayList<Bead> pieces, Place [][] field){
        for(int i = 0;i < 16;i++) {
            boolean result = pieces.get(i).move(pieces.get(i).getX(), pieces.get(i).getY(), getX(), getY(), field);
            if (result == true) {
                //pieces.get(i).getX();
                //pieces.get(i).getY();
                return true;
            }
        }
        return false;

    }
    */

    /**
     * it checks the entered place for the bead.
     * @param x,the place of the bead we want it to go.
     * @param y,the place of the bead we want it to go.
     * @param pieces,an array list of all beads.
     * @param field, the field of the game.
     * @return it return true or false.
     */
   /* public boolean myCheck(int x, int y, ArrayList<Bead> pieces, Place [][] field){

        for(int i = 0;i < 16;i++) {
            boolean result = pieces.get(i).move(pieces.get(i).getX(), pieces.get(i).getY(), x, y, field);
            if (result == true) {

                return true;
            }
        }
        return false;
    }
    */
}
