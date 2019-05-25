/**
 * Inherits Piece class and simulates king piece in chess.
 * @author MORTEZA DAMGHANI NOURI.
 * @version Version1.
 *
 *
 *
 */

public class King extends Piece {

    public King(boolean existence, int x, int y,String c,int i) {
        super(existence, x, y,c,i);
    }

    /**
     * @param currentX         the current place(x) of the piece.
     * @param currentY         the current place(y)of the piece.
     * @param nextX,           the place(x) of the bead we want it to go.
     * @param nextY,the        the place(y) of the bead we want it to go.
     * @param field            it is an array of objects of place class which simulates the field of chess.
     * @param chessMainGraphic it is an object of graphical interface of the game.
     * @return it returns a boolean variable which shows that if the movement was done or that was invalid.
     */
    @Override
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place [][] field,NewGraphic chessMainGraphic) {
        boolean result = super.move(currentX, currentY, nextX, nextY, field,chessMainGraphic);
        if (!result)
            return false;
        else
        {
            if(nextX==currentX+1&&nextY==currentY+1)
            {

                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=111;
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=111;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }

                return true;
            }
            if(nextX==currentX+1&&nextY==currentY)
            {

                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=112;
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=112;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }

                return true;
            }
            if(nextX==currentX+1&&nextY==currentY-1)
            {

                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=113;
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=113;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }

                return true;
            }
            if(nextX==currentX&&nextY==currentY-1)
            {

                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=114;
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=114;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }

                return true;
            }
            if(nextX==currentX-1&&nextY==currentY-1)
            {

                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=115;
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=115;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }

                return true;
            }
            if(nextX==currentX-1&&nextY==currentY)
            {

                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=116;
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=116;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }

                return true;
            }
            if(nextX==currentX-1&&nextY==currentY+1)
            {

                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=117;
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=117;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }

                return true;
            }
            if(nextX==currentX&&nextY==currentY+1)
            {

                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=118;
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=118;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);

                }

                return true;
            }




        }

       return false;
    }

    /**
     * it checks if the current piece checks the king of the other player or not.
     * @param currentX  the current place(x) of the piece.
     * @param currentY  the current place(x) of the piece.
     * @param field  it is an array of objects of place class which simulates the field of chess.
     * @return  it is a boolean variable which shows that the piece checks the king or not.
     */


    public boolean check(int currentX,int currentY,Place field[][])
    {
        Piece king=field[currentY][currentX].getPiece();
        if(king.getColor().equals("white"))
        {
            if(blackKingChecker(currentX+1,currentY+1,field))return true;
            if(blackKingChecker(currentX+1,currentY,field))return true;
            if(blackKingChecker(currentX+1,currentY-1,field))return true;
            if(blackKingChecker(currentX,currentY-1,field))return true;
            if(blackKingChecker(currentX-1,currentY-1,field))return true;
            if(blackKingChecker(currentX-1,currentY,field))return true;
            if(blackKingChecker(currentX-1,currentY+1,field))return true;
            if(blackKingChecker(currentX,currentY+1,field))return true;

        }
        if(king.getColor().equals("black"))
        {
            if(whiteKingChecker(currentX+1,currentY+1,field))return true;
            if(whiteKingChecker(currentX+1,currentY,field))return true;
            if(whiteKingChecker(currentX+1,currentY-1,field))return true;
            if(whiteKingChecker(currentX,currentY-1,field))return true;
            if(whiteKingChecker(currentX-1,currentY-1,field))return true;
            if(whiteKingChecker(currentX-1,currentY,field))return true;
            if(whiteKingChecker(currentX-1,currentY+1,field))return true;
            if(whiteKingChecker(currentX,currentY+1,field))return true;

        }


        return false;
    }





}

