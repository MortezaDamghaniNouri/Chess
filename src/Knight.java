public class Knight extends Piece {

    public Knight(boolean existence, int x, int y, String c, int i) {
        super(existence, x, y, c, i);
    }

    @Override
    /**
     *
     * @param currentX,    the place(x).
     * @param currentY,the place(y) of the piece.
     * @param nextX,       the place(x) of the piece we want it to go.
     * @param nextY,the    the place(y) of the piece we want it to go.
     * @param field        it is an array of object of place class which simulates the field of the chess game.
     * @param chessMainGraphic it is an object of NewGraphic class.
     * @return it is a boolean variable which shows that the movement was successful or not.
     */
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place[][] field, NewGraphic chessMainGraphic) {
        boolean result = super.move(currentX, currentY, nextX, nextY, field, chessMainGraphic);
        if (!result)
            return false;
        else {
            if (nextX == currentX + 1 && nextY == currentY + 2) {
                if (field[nextY][nextX].getPiece() == null) {
                    byte p;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 0, k = 1;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextX == currentX + 2 && nextY == currentY + 1) {
                if (field[nextY][nextX].getPiece() == null) {
                    int j;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 0, k = 1, w;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextX == currentX + 2 && nextY == currentY - 1) {
                if (field[nextY][nextX].getPiece() == null) {
                    int t = 0, l;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int u;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextX == currentX + 1 && nextY == currentY - 2) {
                if (field[nextY][nextX].getPiece() == null) {
                    int j, p;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int k = 1, w;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextX == currentX - 1 && nextY == currentY - 2) {
                if (field[nextY][nextX].getPiece() == null) {
                    int j, t = 10;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 0, k = 10;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextX == currentX - 2 && nextY == currentY - 1) {
                if (field[nextY][nextX].getPiece() == null) {
                    int j = 10;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 10, k = 1, w;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextX == currentX - 2 && nextY == currentY + 1) {
                if (field[nextY][nextX].getPiece() == null) {
                    int j, h = 1;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 0, k = 1, w = 10;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextX == currentX - 1 && nextY == currentY + 2) {
                if (field[nextY][nextX].getPiece() == null) {
                    int y = 1;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int x = 10;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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

    /**
     * it checks if the current piece checks the king of the other player or not.
     *
     * @param currentX the current place(x) of the piece.
     * @param currentY the current place(x) of the piece.
     * @param field    it is an array of objects of place class which simulates the field of chess.
     * @return it is a boolean variable which shows that the piece checks the king or not.
     */
    public boolean check(int currentX, int currentY, Place field[][]) {
        Piece knight = field[currentY][currentX].getPiece();
        if (knight.getColor().equals("white")) {
            if (blackKingChecker(currentX + 1, currentY + 2, field)) return true;
            if (blackKingChecker(currentX + 2, currentY + 1, field)) return true;
            if (blackKingChecker(currentX + 2, currentY - 1, field)) return true;
            if (blackKingChecker(currentX + 1, currentY - 2, field)) return true;
            if (blackKingChecker(currentX - 1, currentY - 2, field)) return true;
            if (blackKingChecker(currentX - 2, currentY - 1, field)) return true;
            if (blackKingChecker(currentX - 2, currentY + 1, field)) return true;
            if (blackKingChecker(currentX - 1, currentY + 2, field)) return true;

        }
        if (knight.getColor().equals("black")) {
            if (whiteKingChecker(currentX + 1, currentY + 2, field)) return true;
            if (whiteKingChecker(currentX + 2, currentY + 1, field)) return true;
            if (whiteKingChecker(currentX + 2, currentY - 1, field)) return true;
            if (whiteKingChecker(currentX + 1, currentY - 2, field)) return true;
            if (whiteKingChecker(currentX - 1, currentY - 2, field)) return true;
            if (whiteKingChecker(currentX - 2, currentY - 1, field)) return true;
            if (whiteKingChecker(currentX - 2, currentY + 1, field)) return true;
            if (whiteKingChecker(currentX - 1, currentY + 2, field)) return true;

        }


        return false;
    }


}