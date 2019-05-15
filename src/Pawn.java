public class Pawn extends Piece {

 public Pawn(boolean existence, int x, int y,String c,int i){
     super(existence, x, y,c,i);
 }
 @Override
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place [][] field){
    boolean result = super.move(currentX, currentY,nextX,nextY, field);
     if(!result)
         return false;
     else
     {
         if(currentY==1)
         {
             if(nextY==currentY+1&&nextX==currentX)
             {
                 if(field[nextY][nextX].getPiece()==null)
                 {
                     int w=11,j;
                     field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                     field[currentY][currentX].setPiece(null);
                     field[nextY][nextX].getPiece().setY(nextY);
                     field[nextY][nextX].getPiece().setX(nextX);
                     return true;
                 }
                 return false;

             }
             if(nextY==currentY+2&&nextX==currentX)
             {
                if(field[currentY+1][currentX].getPiece()!=null)
                {
                    return false;
                }
                else
                {
                    if(field[nextY][nextX].getPiece()==null)
                    {
                        int w=12,j;
                        field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                        field[currentY][currentX].setPiece(null);
                        field[nextY][nextX].getPiece().setY(nextY);
                        field[nextY][nextX].getPiece().setX(nextX);
                        return true;
                    }

                    return false;

                }



             }
             if(nextY==currentY+1&&nextX==currentX+1)
             {
                 if(field[nextY][nextX].getPiece()!=null)
                 {
                     int w=13,l;
                     field[nextY][nextX].getPiece().setExistence(false);
                     field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                     field[currentY][currentX].setPiece(null);
                     field[nextY][nextX].getPiece().setY(nextY);
                     field[nextY][nextX].getPiece().setX(nextX);
                     return true;
                 }
                 return false;
             }
             if(nextY==currentY+1&&nextX==currentX-1)
             {
                 if(field[nextY][nextX].getPiece()!=null)
                 {
                     int w=14,l=1;
                     field[nextY][nextX].getPiece().setExistence(false);
                     field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                     field[currentY][currentX].setPiece(null);
                     field[nextY][nextX].getPiece().setY(nextY);
                     field[nextY][nextX].getPiece().setX(nextX);
                     return true;
                 }
                 return false;
             }



         }

         else
         {
             if(nextY==currentY+1&&nextX==currentX)
             {
                 if(field[nextY][nextX].getPiece()==null)
                 {
                     int w=15,j=1;
                     field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                     field[currentY][currentX].setPiece(null);
                     field[nextY][nextX].getPiece().setY(nextY);
                     field[nextY][nextX].getPiece().setX(nextX);
                     return true;
                 }
                 return false;

             }
             if(nextY==currentY+1&&nextX==currentX+1)
             {
                 if(field[nextY][nextX].getPiece()!=null)
                 {
                     int w=16,l;
                     field[nextY][nextX].getPiece().setExistence(false);
                     field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                     field[currentY][currentX].setPiece(null);
                     field[nextY][nextX].getPiece().setY(nextY);
                     field[nextY][nextX].getPiece().setX(nextX);
                     return true;
                 }
                return false;

             }
             if(nextY==currentY+1&&nextX==currentX-1)
             {
                 if(field[nextY][nextX].getPiece()!=null)
                 {
                     int w=17,l;
                     field[nextY][nextX].getPiece().setExistence(false);
                     field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                     field[currentY][currentX].setPiece(null);
                     field[nextY][nextX].getPiece().setY(nextY);
                     field[nextY][nextX].getPiece().setX(nextX);
                     return true;
                 }
                return false;

             }



         }




     }



     return false;
 }
}
