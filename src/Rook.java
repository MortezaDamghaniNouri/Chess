public class Rook extends Piece {

    public Rook(boolean existence, int x, int y, String c,int i) {
        super(existence, x, y, c,i);
    }

    @Override
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place[][] field) {
        boolean result = super.move(currentX, currentY, nextX, nextY, field);
        if (!result) return false;


        else {
            if (nextX == currentX || nextY == currentY) {
                if (nextY == currentY) {
                    if (nextX > currentX) {
                        for (int i = currentX + 1; i <= nextX - 1; ++i) {
                            if (field[currentY][i].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            field[nextY][nextX].getPiece().setExistence(false);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;

                    }
                    if (currentX > nextX) {
                        for (int i = currentX - 1; i >= nextX + 1; --i) {
                            if (field[currentY][i].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            int i = 0;
                            field[nextY][nextX].getPiece().setExistence(false);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;


                    }


                }
                if (nextX == currentX) {
                    int k = 0;
                    if (nextY > currentY) {
                        for (int i = currentY + 1; i <= nextY - 1; ++i) {
                            int y = 0;
                            if (field[i][currentX].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            int x = 0, o = 0;
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            int m = 1;
                            field[nextY][nextX].getPiece().setExistence(false);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;

                    }
                    if (currentY > nextY) {
                        int a = 0;
                        for (int i = currentY - 1; i >= nextY + 1; --i) {
                            if (field[i][currentX].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            int b = 0;
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            int w = 0, j = 0;
                            field[nextY][nextX].getPiece().setExistence(false);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;


                    }


                }


            }
            else {
                return false;
            }


        }
    return false;
    }
}

