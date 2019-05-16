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
         if(field[currentY][currentX].getPiece().getColor().equals("white")) {
             if (currentY == 1) {
                 if (nextY == currentY + 1 && nextX == currentX) {
                     if (field[nextY][nextX].getPiece() == null) {
                         int w = 11, j;
                         field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                         field[currentY][currentX].setPiece(null);
                         field[nextY][nextX].getPiece().setY(nextY);
                         field[nextY][nextX].getPiece().setX(nextX);
                         return true;
                     }
                     return false;

                 }
                 if (nextY == currentY + 2 && nextX == currentX) {
                     if (field[currentY + 1][currentX].getPiece() != null) {
                         return false;
                     } else {
                         if (field[nextY][nextX].getPiece() == null) {
                             int w = 12, j;
                             field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                             field[currentY][currentX].setPiece(null);
                             field[nextY][nextX].getPiece().setY(nextY);
                             field[nextY][nextX].getPiece().setX(nextX);
                             return true;
                         }

                         return false;

                     }


                 }
                 if (nextY == currentY + 1 && nextX == currentX + 1) {
                     if (field[nextY][nextX].getPiece() != null) {
                         if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                         int w = 13, l;
                         //*
                         field[nextY][nextX].getPiece().setExistence(false);
                         field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                         field[currentY][currentX].setPiece(null);
                         field[nextY][nextX].getPiece().setY(nextY);
                         field[nextY][nextX].getPiece().setX(nextX);
                         return true;
                     }
                     return false;
                 }
                 if (nextY == currentY + 1 && nextX == currentX - 1) {
                     if (field[nextY][nextX].getPiece() != null) {
                         if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                         int w = 14, l = 1;
                         field[nextY][nextX].getPiece().setExistence(false);
                         field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                         field[currentY][currentX].setPiece(null);
                         field[nextY][nextX].getPiece().setY(nextY);
                         field[nextY][nextX].getPiece().setX(nextX);
                         return true;
                     }
                     return false;
                 }


             } else {
                 if (nextY == currentY + 1 && nextX == currentX) {
                     if (field[nextY][nextX].getPiece() == null) {
                         int w = 15, j = 1;
                         field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                         field[currentY][currentX].setPiece(null);
                         field[nextY][nextX].getPiece().setY(nextY);
                         field[nextY][nextX].getPiece().setX(nextX);
                         return true;
                     }
                     return false;

                 }
                 if (nextY == currentY + 1 && nextX == currentX + 1) {
                     if (field[nextY][nextX].getPiece() != null) {
                         if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                         int w = 16, l;
                         field[nextY][nextX].getPiece().setExistence(false);
                         field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                         field[currentY][currentX].setPiece(null);
                         field[nextY][nextX].getPiece().setY(nextY);
                         field[nextY][nextX].getPiece().setX(nextX);
                         return true;
                     }
                     return false;

                 }
                 if (nextY == currentY + 1 && nextX == currentX - 1) {
                     if (field[nextY][nextX].getPiece() != null) {
                         if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                         int w = 17, l;
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
         if(field[currentY][currentX].getPiece().getColor().equals("black"))
         {
             if (currentY == 6) {
                 if (nextY == currentY - 1 && nextX == currentX) {
                     if (field[nextY][nextX].getPiece() == null) {
                         int w = 21, j;
                         field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                         field[currentY][currentX].setPiece(null);
                         field[nextY][nextX].getPiece().setY(nextY);
                         field[nextY][nextX].getPiece().setX(nextX);
                         return true;
                     }
                     return false;

                 }
                 if (nextY == currentY - 2 && nextX == currentX) {
                     if (field[currentY - 1][currentX].getPiece() != null) {
                         return false;
                     } else {
                         if (field[nextY][nextX].getPiece() == null) {
                             int w = 22, j;
                             field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                             field[currentY][currentX].setPiece(null);
                             field[nextY][nextX].getPiece().setY(nextY);
                             field[nextY][nextX].getPiece().setX(nextX);
                             return true;
                         }

                         return false;

                     }


                 }
                 if (nextY == currentY - 1 && nextX == currentX + 1) {
                     if (field[nextY][nextX].getPiece() != null) {
                         if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                         int w = 23, l;
                         field[nextY][nextX].getPiece().setExistence(false);
                         field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                         field[currentY][currentX].setPiece(null);
                         field[nextY][nextX].getPiece().setY(nextY);
                         field[nextY][nextX].getPiece().setX(nextX);
                         return true;
                     }
                     return false;
                 }
                 if (nextY == currentY - 1 && nextX == currentX - 1) {
                     if (field[nextY][nextX].getPiece() != null) {
                         if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                         int w = 24, l = 1;
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

             else {
                 if (nextY == currentY - 1 && nextX == currentX) {
                     if (field[nextY][nextX].getPiece() == null) {
                         int w = 25, j = 1;
                         field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                         field[currentY][currentX].setPiece(null);
                         field[nextY][nextX].getPiece().setY(nextY);
                         field[nextY][nextX].getPiece().setX(nextX);
                         return true;
                     }
                     return false;

                 }
                 if (nextY == currentY - 1 && nextX == currentX + 1) {
                     if (field[nextY][nextX].getPiece() != null) {
                         if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                         int w = 26, l;
                         field[nextY][nextX].getPiece().setExistence(false);
                         field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                         field[currentY][currentX].setPiece(null);
                         field[nextY][nextX].getPiece().setY(nextY);
                         field[nextY][nextX].getPiece().setX(nextX);
                         return true;
                     }
                     return false;

                 }
                 if (nextY == currentY - 1 && nextX == currentX - 1) {
                     if (field[nextY][nextX].getPiece() != null) {
                         if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                         int w = 27, l;
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















     }




     return false;
 }


    public boolean check(int currentX,int currentY,Place field[][])
    {
        Piece pawn=field[currentY][currentX].getPiece();
        if(pawn.getColor().equals("white")) {
            if ((squareChecker(currentX + 1, currentY + 1) && field[currentY + 1][currentX + 1].getPiece().getIndex() == 1000) ||
                    (squareChecker(currentX - 1, currentY + 1) && field[currentY + 1][currentX - 1].getPiece().getIndex() == 1000))
                return true;
            else return false;

        }
        if(pawn.getColor().equals("black"))
        {
            if((squareChecker(currentX+1,currentY-1)&&field[currentY-1][currentX+1].getPiece().getIndex()==1000)||
                    (squareChecker(currentX-1,currentY-1)&&field[currentY-1][currentX-1].getPiece().getIndex()==1000))return true;
            else return false;

        }
        return false;


    }
    private boolean squareChecker(int x,int y)
    {
        if(x>=0&&x<=7&&y>=0&&y<=7)return true;
        else return false;

    }






}
