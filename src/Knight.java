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
                    int m=0,k=1;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
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
                    int m=0,k=1,w;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }

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
                    int u;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }

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
                    int k=1,w;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }

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
                    int m=0,k=10;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }

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
                    int m=10,k=1,w;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }

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
                    int m=0,k=1,w=10;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }

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
                    int x=10;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }

            }






        }








        return false;
    }
}