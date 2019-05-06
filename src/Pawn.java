public class Pawn extends Bead {

 public Pawn(boolean existence, int x, int y, int i){
     super(existence, x, y, i);
 }
 @Override
    public boolean move(int currentX, int currentY, int x, int y, Place [][] field){
    boolean result = super.move(currentX, currentY, x, y, field);
     if(result == false)
         return false;
     if(y - currentY == 1 && x - currentX == 0 && field[currentX+1][currentY+1].getPiece() == null)
         return true;
     if(y == 2 && currentY - y == 2 && x - currentX == 0 && field[currentX+1][currentY+1].getPiece() == null && field[currentX+2][currentY+2].getPiece() == null)
         return true;
     if(x == currentX + 1 && y == currentY + 1) {
         if (field[x][y].getPiece() != null)
             return true;
     }

     return false;
 }
}
