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
                            if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
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
                            if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
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
                            if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
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
                            if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
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



    public boolean check(int currentX,int currentY,Place field[][])
    {
        Piece rook=field[currentY][currentX].getPiece();
        if(rook.getColor().equals("white"))
        {
            if(betweenChecker1(currentX,currentY,currentX,currentY+1,field)&&blackKingChecker(currentX,currentY+1,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+2,field)&&blackKingChecker(currentX,currentY+2,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+3,field)&&blackKingChecker(currentX,currentY+3,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+4,field)&&blackKingChecker(currentX,currentY+4,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+5,field)&&blackKingChecker(currentX,currentY+5,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+6,field)&&blackKingChecker(currentX,currentY+6,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+7,field)&&blackKingChecker(currentX,currentY+7,field))return true;

            if(betweenChecker2(currentX,currentY,currentX,currentY-1,field)&&blackKingChecker(currentX,currentY-1,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-2,field)&&blackKingChecker(currentX,currentY-2,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-3,field)&&blackKingChecker(currentX,currentY-3,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-4,field)&&blackKingChecker(currentX,currentY-4,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-5,field)&&blackKingChecker(currentX,currentY-5,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-6,field)&&blackKingChecker(currentX,currentY-6,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-7,field)&&blackKingChecker(currentX,currentY-7,field))return true;

            if(betweenChecker3(currentX,currentY,currentX+1,currentY,field)&&blackKingChecker(currentX+1,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+2,currentY,field)&&blackKingChecker(currentX+2,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+3,currentY,field)&&blackKingChecker(currentX+3,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+4,currentY,field)&&blackKingChecker(currentX+4,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+5,currentY,field)&&blackKingChecker(currentX+5,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+6,currentY,field)&&blackKingChecker(currentX+6,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+7,currentY,field)&&blackKingChecker(currentX+7,currentY,field))return true;

            if(betweenChecker4(currentX,currentY,currentX-1,currentY,field)&&blackKingChecker(currentX-1,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-2,currentY,field)&&blackKingChecker(currentX-2,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-3,currentY,field)&&blackKingChecker(currentX-3,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-4,currentY,field)&&blackKingChecker(currentX-4,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-5,currentY,field)&&blackKingChecker(currentX-5,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-6,currentY,field)&&blackKingChecker(currentX-6,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-7,currentY,field)&&blackKingChecker(currentX-7,currentY,field))return true;

        }
        if(rook.getColor().equals("black"))
        {
            if(betweenChecker1(currentX,currentY,currentX,currentY+1,field)&&whiteKingChecker(currentX,currentY+1,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+2,field)&&whiteKingChecker(currentX,currentY+2,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+3,field)&&whiteKingChecker(currentX,currentY+3,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+4,field)&&whiteKingChecker(currentX,currentY+4,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+5,field)&&whiteKingChecker(currentX,currentY+5,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+6,field)&&whiteKingChecker(currentX,currentY+6,field))return true;
            if(betweenChecker1(currentX,currentY,currentX,currentY+7,field)&&whiteKingChecker(currentX,currentY+7,field))return true;

            if(betweenChecker2(currentX,currentY,currentX,currentY-1,field)&&whiteKingChecker(currentX,currentY-1,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-2,field)&&whiteKingChecker(currentX,currentY-2,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-3,field)&&whiteKingChecker(currentX,currentY-3,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-4,field)&&whiteKingChecker(currentX,currentY-4,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-5,field)&&whiteKingChecker(currentX,currentY-5,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-6,field)&&whiteKingChecker(currentX,currentY-6,field))return true;
            if(betweenChecker2(currentX,currentY,currentX,currentY-7,field)&&whiteKingChecker(currentX,currentY-7,field))return true;

            if(betweenChecker3(currentX,currentY,currentX+1,currentY,field)&&whiteKingChecker(currentX+1,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+2,currentY,field)&&whiteKingChecker(currentX+2,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+3,currentY,field)&&whiteKingChecker(currentX+3,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+4,currentY,field)&&whiteKingChecker(currentX+4,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+5,currentY,field)&&whiteKingChecker(currentX+5,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+6,currentY,field)&&whiteKingChecker(currentX+6,currentY,field))return true;
            if(betweenChecker3(currentX,currentY,currentX+7,currentY,field)&&whiteKingChecker(currentX+7,currentY,field))return true;

            if(betweenChecker4(currentX,currentY,currentX-1,currentY,field)&&whiteKingChecker(currentX-1,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-2,currentY,field)&&whiteKingChecker(currentX-2,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-3,currentY,field)&&whiteKingChecker(currentX-3,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-4,currentY,field)&&whiteKingChecker(currentX-4,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-5,currentY,field)&&whiteKingChecker(currentX-5,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-6,currentY,field)&&whiteKingChecker(currentX-6,currentY,field))return true;
            if(betweenChecker4(currentX,currentY,currentX-7,currentY,field)&&whiteKingChecker(currentX-7,currentY,field))return true;


        }


        return false;
    }

    private boolean betweenChecker1(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentY+i<=nextY-1;++i)
        {
            if(field[currentY+i][currentX].getPiece()!=null)return false;

        }
        return true;

    }
    private boolean betweenChecker2(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentY-i>=nextY+1;++i)
        {
            if(field[currentY-i][currentX].getPiece()!=null)return false;

        }
        return true;

    }
    private boolean betweenChecker3(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentX+i<=nextX-1;++i)
        {
            if(field[currentY][currentX+i].getPiece()!=null)return false;

        }
        return true;

    }
    private boolean betweenChecker4(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentX-i>=nextX+1;++i)
        {
            if(field[currentY][currentX-i].getPiece()!=null)return false;

        }
        return true;

    }




}

