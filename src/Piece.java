/**
 * it specifies the beads of the chess.
 *
 * @author Morteza Damghani
 * @version 1
 */
public abstract class Piece {

    private boolean existence;
    private int x;
    private int y;
    private String color;
    private int index;

    public Piece(boolean existence, int x, int y, String c, int i) {
        this.existence=existence;
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
    public boolean blackKingChecker(int x,int y,Place field[][])
    {
        if(x>=0&&x<=7&&y>=0&&y<=7)
        {
            if(field[y][x].getPiece()!=null&&field[y][x].getPiece().getIndex()==2000)return true;
            else return false;

        }
        else return false;

    }
    public boolean whiteKingChecker(int x,int y,Place field[][])
    {
        if(x>=0&&x<=7&&y>=0&&y<=7)
        {
            if(field[y][x].getPiece()!=null&&field[y][x].getPiece().getIndex()==1000)return true;
            else return false;

        }
        else return false;

    }
    public abstract boolean check(int currentX,int currentY,Place field[][]);






}
