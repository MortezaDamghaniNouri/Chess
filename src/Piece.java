import java.awt.*;

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
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place[][] field,NewGraphic chessMainGraphic) {
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
    public void changeMainButtonsIcons(int currentX,int currentY,int nextX,int nextY,Place field[][],NewGraphic chessMainGraphic)
    {
        if(field[nextY][nextX].getPiece()==null)
        {
            chessMainGraphic.getMainButtons()[nextY+1][nextX+1].setIcon(chessMainGraphic.getMainButtons()[currentY+1][currentX+1].getIcon());
            chessMainGraphic.getMainButtons()[currentY+1][currentX+1].setIcon(null);

        }
        else
        {
            chessMainGraphic.getMainButtons()[nextY+1][nextX+1].setIcon(chessMainGraphic.getMainButtons()[currentY+1][currentX+1].getIcon());
            chessMainGraphic.getMainButtons()[currentY+1][currentX+1].setIcon(null);
            changeSideButtonsBackgrounds(field[nextY][nextX].getPiece().getIndex(),chessMainGraphic);


        }






    }
    public void changeSideButtonsBackgrounds(int index,NewGraphic chessMainGraphic)
    {
        if(index/100==1)
        {
            if(index%100==11)
            {
                chessMainGraphic.getWhiteSideButtons()[2][1].setBackground(new Color(168, 17, 13));
            }
            if(index%100==12)
            {
                chessMainGraphic.getWhiteSideButtons()[2][8].setBackground(new Color(168, 17, 13));
            }
            if(index%100==21)
            {
                chessMainGraphic.getWhiteSideButtons()[2][2].setBackground(new Color(168, 17, 13));
            }
            if(index%100==22)
            {
                chessMainGraphic.getWhiteSideButtons()[2][7].setBackground(new Color(168, 17, 13));
            }
            if(index%100==31)
            {
                chessMainGraphic.getWhiteSideButtons()[2][3].setBackground(new Color(168, 17, 13));
            }
            if(index%100==32)
            {
                chessMainGraphic.getWhiteSideButtons()[2][6].setBackground(new Color(168, 17, 13));
            }
            if(index%100==41)
            {
                chessMainGraphic.getWhiteSideButtons()[1][1].setBackground(new Color(168, 17, 13));
            }
            if(index%100==42)
            {
                chessMainGraphic.getWhiteSideButtons()[1][2].setBackground(new Color(168, 17, 13));
            }
            if(index%100==43)
            {
                chessMainGraphic.getWhiteSideButtons()[1][3].setBackground(new Color(168, 17, 13));
            }
            if(index%100==44)
            {
                chessMainGraphic.getWhiteSideButtons()[1][4].setBackground(new Color(168, 17, 13));
            }
            if(index%100==45)
            {
                chessMainGraphic.getWhiteSideButtons()[1][5].setBackground(new Color(168, 17, 13));
            }
            if(index%100==46)
            {
                chessMainGraphic.getWhiteSideButtons()[1][6].setBackground(new Color(168, 17, 13));
            }
            if(index%100==47)
            {
                chessMainGraphic.getWhiteSideButtons()[1][7].setBackground(new Color(168, 17, 13));
            }
            if(index%100==48)
            {
                chessMainGraphic.getWhiteSideButtons()[1][8].setBackground(new Color(168, 17, 13));
            }


        }


        if(index/100==2)
        {
            if(index%100==11)
            {
                chessMainGraphic.getWhiteSideButtons()[1][1].setBackground(new Color(168, 17, 13));
            }
            if(index%100==12)
            {
                chessMainGraphic.getWhiteSideButtons()[1][8].setBackground(new Color(168, 17, 13));
            }
            if(index%100==21)
            {
                chessMainGraphic.getWhiteSideButtons()[1][2].setBackground(new Color(168, 17, 13));
            }
            if(index%100==22)
            {
                chessMainGraphic.getWhiteSideButtons()[1][7].setBackground(new Color(168, 17, 13));
            }
            if(index%100==31)
            {
                chessMainGraphic.getWhiteSideButtons()[1][3].setBackground(new Color(168, 17, 13));
            }
            if(index%100==32)
            {
                chessMainGraphic.getWhiteSideButtons()[1][6].setBackground(new Color(168, 17, 13));
            }
            if(index%100==41)
            {
                chessMainGraphic.getWhiteSideButtons()[2][1].setBackground(new Color(168, 17, 13));
            }
            if(index%100==42)
            {
                chessMainGraphic.getWhiteSideButtons()[2][2].setBackground(new Color(168, 17, 13));
            }
            if(index%100==43)
            {
                chessMainGraphic.getWhiteSideButtons()[2][3].setBackground(new Color(168, 17, 13));
            }
            if(index%100==44)
            {
                chessMainGraphic.getWhiteSideButtons()[2][4].setBackground(new Color(168, 17, 13));
            }
            if(index%100==45)
            {
                chessMainGraphic.getWhiteSideButtons()[2][5].setBackground(new Color(168, 17, 13));
            }
            if(index%100==46)
            {
                chessMainGraphic.getWhiteSideButtons()[2][6].setBackground(new Color(168, 17, 13));
            }
            if(index%100==47)
            {
                chessMainGraphic.getWhiteSideButtons()[2][7].setBackground(new Color(168, 17, 13));
            }
            if(index%100==48)
            {
                chessMainGraphic.getWhiteSideButtons()[2][8].setBackground(new Color(168, 17, 13));
            }

        }
        if(index==1)
        {
            chessMainGraphic.getWhiteSideButtons()[2][4].setBackground(new Color(168, 17, 13));
        }
        if(index==2)
        {
            chessMainGraphic.getWhiteSideButtons()[1][4].setBackground(new Color(168, 17, 13));
        }

    }





}
