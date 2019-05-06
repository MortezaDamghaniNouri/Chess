public class Knight extends Bead {

    public Knight(boolean existence, int x, int y, int i) {
        super(existence, x, y, i);
    }

    @Override
    public boolean move(int currentX, int currentY, int x, int y, Place [][] field) {
        boolean result = super.move(currentX, currentY, x, y, field);
        if (result == false)
            return false;
        if (x != currentX + 2 && x != currentX - 2 && x != currentX - 1 && x != currentX + 1)
            return false;
        if (y != currentY - 1 && y != currentY + 1 && y != currentY - 2 && y != currentY + 2)
            return false;
        return true;
    }
}