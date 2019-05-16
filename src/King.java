public class King extends Piece {

    public King(boolean existence, int x, int y,String c,int i) {
        super(existence, x, y,c,i);
    }

    @Override
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place [][] field) {
        boolean result = super.move(currentX, currentY, nextX, nextY, field);
        if (!result)
            return false;
        else
        {
            if(nextX==currentX+1&&nextY==currentY+1)
            {

                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=111;
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

