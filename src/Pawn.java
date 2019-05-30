public class Pawn extends Piece {

    public Pawn(boolean existence, int x, int y, String c, int i) {
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

            if (field[currentY][currentX].getPiece().getColor().equals("white")) {
                if (currentY == 1) {
                    if (nextY == currentY + 1 && nextX == currentX) {
                        if (field[nextY][nextX].getPiece() == null) {
                            int w = 11, j;
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                                changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int w = 13, l;
                            //*
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int w = 14, l = 1;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int w = 16, l;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int w = 17, l;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
            if (field[currentY][currentX].getPiece().getColor().equals("black")) {
                if (currentY == 6) {
                    if (nextY == currentY - 1 && nextX == currentX) {
                        if (field[nextY][nextX].getPiece() == null) {
                            int w = 21, j;
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                                changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int w = 23, l;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int w = 24, l = 1;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                            return true;
                        }
                        return false;
                    }


                } else {
                    if (nextY == currentY - 1 && nextX == currentX) {
                        if (field[nextY][nextX].getPiece() == null) {
                            int w = 25, j = 1;
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int w = 26, l;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int w = 27, l;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
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
    /**
     * it checks if the current piece checks the king of the other player or not.
     *
     * @param currentX the current place(x) of the piece.
     * @param currentY the current place(x) of the piece.
     * @param field    it is an array of objects of place class which simulates the field of chess.
     * @return it is a boolean variable which shows that the piece checks the king or not.
     */

    public boolean check(int currentX, int currentY, Place field[][]) {
        Piece pawn = field[currentY][currentX].getPiece();
        if (pawn.getColor().equals("white")) {
            if ((squareChecker(currentX + 1, currentY + 1) && field[currentY + 1][currentX + 1].getPiece() != null && field[currentY + 1][currentX + 1].getPiece().getIndex() == 1000) ||
                    (squareChecker(currentX - 1, currentY + 1) && field[currentY + 1][currentX - 1].getPiece() != null && field[currentY + 1][currentX - 1].getPiece().getIndex() == 1000))
                return true;
            else return false;

        }
        if (pawn.getColor().equals("black")) {
            if (squareChecker(currentX + 1, currentY - 1) && field[currentY - 1][currentX + 1].getPiece() != null && field[currentY - 1][currentX + 1].getPiece().getIndex() == 1000)
                return true;
            if (squareChecker(currentX - 1, currentY - 1) && field[currentY - 1][currentX - 1].getPiece() != null && field[currentY - 1][currentX - 1].getPiece().getIndex() == 1000)
                return true;
            else return false;

        }
        return false;


    }

    /**
     * it consider if entered x and entered y are valid or not.
     * @param x the x of the piece.
     * @param y the x of the piece.
     * @return it is a boolean variable which indicates x and y are valid or not.
     */

    private boolean squareChecker(int x, int y) {
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) return true;
        else return false;

    }


}
