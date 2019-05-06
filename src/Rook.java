public class Rook extends Bead {

    public Rook(boolean existence, int x, int y, int i) {
        super(existence, x, y, i);
    }

    @Override
    public boolean move(int currentX, int currentY, int x, int y, Place[][] field) {
        boolean result = super.move(currentX, currentY, x, y, field);
        if (result == false)
            return false;
        if (currentX == x) {
            int i = 0;
            if (x > currentX) {
                for (i = 1; i + currentY != y; i++) {
                    if (field[x][currentY + i].getPiece() != null)
                        return false;

                }
            } else {
                for (i = 1; currentY - i != y; i++) {
                    if (field[x][currentY + i].getPiece() != null)
                        return false;

                }
                return true;
            }
        }

            if (currentY == y) {

                {
                    int i =0;
                    if (y > currentY) {
                        for (i = 1; i + currentX != x; i++) {
                            if (field[i + currentX][y].getPiece() != null)
                                return false;

                        }
                    } else {
                        for (i = 1; currentX - i != x; i++) {
                            if (field[currentX - i][y].getPiece() != null)
                                return false;

                        }
                        return true;
                    }

                }
            }

        return false;
        }
    }


