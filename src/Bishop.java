public class Bishop extends Bead {

    public Bishop(boolean existence, int x, int y, int i) {
        super(existence, x, y, i);
    }

    @Override
    public boolean move(int currentX, int currentY, int x, int y, Place [][] field) {
        boolean result = super.move(currentX, currentY, x, y, field);
        if (result == false)
            return false;
        if (x - currentX == y - currentY) {
            if (x > currentX && y > currentY) {
                for (int i = 1; i + currentX != x; i++)
                    if (field[i + currentX][i + currentY] != null)
                        return false;


                return true;
            } if(x < currentX && y < currentY) {
                for (int i = 1; currentX - i != x; i++)
                    if (field[currentX - i][currentY - i] != null)
                        return false;


                return true;
            }
            if(x > currentX && y < currentY){
                for (int i = 1; currentX + i != x; i++)
                    if (field[currentX + i][currentY - i] != null)
                        return false;


                return true;

            }
            if(x < currentX && y > currentY){
                for (int i = 1; currentX - i != x; i++)
                    if (field[currentX - i][currentY + i] != null)
                        return false;


                return true;



            }
        }
        return false;

    }
}
