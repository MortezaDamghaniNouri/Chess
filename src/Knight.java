public class Knight extends Piece {

    public Knight(boolean existence, int x, int y,String c,int i) {
        super(existence, x, y, c,i);
    }

    @Override
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place [][] field) {
        boolean result = super.move(currentX, currentY, nextX, nextY, field);
        if (!result)
            return false;
        else
        {
            if(nextX==currentX+1&&nextY==currentY+2)
            {
                if(field[nextY][nextX].getPiece()==null)
                {
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=0,k=1;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextX==currentX+2&&nextY==currentY+1)
            {
                if(field[nextY][nextX].getPiece()==null)
                {
                    int j;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=0,k=1,w;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextX==currentX+2&&nextY==currentY-1)
            {
                if(field[nextY][nextX].getPiece()==null)
                {
                    int t=0,l;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int u;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextX==currentX+1&&nextY==currentY-2)
            {
                if(field[nextY][nextX].getPiece()==null)
                {
                    int j,p;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int k=1,w;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextX==currentX-1&&nextY==currentY-2)
            {
                if(field[nextY][nextX].getPiece()==null)
                {
                    int j,t=10;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=0,k=10;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextX==currentX-2&&nextY==currentY-1)
            {
                if(field[nextY][nextX].getPiece()==null)
                {
                    int j=10;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=10,k=1,w;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextX==currentX-2&&nextY==currentY+1)
            {
                if(field[nextY][nextX].getPiece()==null)
                {
                    int j,h=1;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=0,k=1,w=10;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextX==currentX-1&&nextY==currentY+2)
            {
                if(field[nextY][nextX].getPiece()==null)
                {
                    int y=1;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int x=10;
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
        Piece knight=field[currentY][currentX].getPiece();
        if(knight.getColor().equals("white"))
        {
            if(blackKingChecker(currentX+1,currentY+2,field))return true;
            if(blackKingChecker(currentX+2,currentY+1,field))return true;
            if(blackKingChecker(currentX+2,currentY-1,field))return true;
            if(blackKingChecker(currentX+1,currentY-2,field))return true;
            if(blackKingChecker(currentX-1,currentY-2,field))return true;
            if(blackKingChecker(currentX-2,currentY-1,field))return true;
            if(blackKingChecker(currentX-2,currentY+1,field))return true;
            if(blackKingChecker(currentX-1,currentY+2,field))return true;

        }
        if(knight.getColor().equals("black"))
        {
            if(whiteKingChecker(currentX+1,currentY+2,field))return true;
            if(whiteKingChecker(currentX+2,currentY+1,field))return true;
            if(whiteKingChecker(currentX+2,currentY-1,field))return true;
            if(whiteKingChecker(currentX+1,currentY-2,field))return true;
            if(whiteKingChecker(currentX-1,currentY-2,field))return true;
            if(whiteKingChecker(currentX-2,currentY-1,field))return true;
            if(whiteKingChecker(currentX-2,currentY+1,field))return true;
            if(whiteKingChecker(currentX-1,currentY+2,field))return true;

        }


        return false;
    }








}