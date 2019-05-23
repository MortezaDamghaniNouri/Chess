import java.awt.*;

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
            if(blackKingChecker(currentX,currentY+1,field)&&betweenChecker1(currentX,currentY,currentX,currentY+1,field))return true;
            if(blackKingChecker(currentX,currentY+2,field)&&betweenChecker1(currentX,currentY,currentX,currentY+2,field))return true;
            if(blackKingChecker(currentX,currentY+3,field)&&betweenChecker1(currentX,currentY,currentX,currentY+3,field))return true;
            if(blackKingChecker(currentX,currentY+4,field)&&betweenChecker1(currentX,currentY,currentX,currentY+4,field))return true;
            if(blackKingChecker(currentX,currentY+5,field)&&betweenChecker1(currentX,currentY,currentX,currentY+5,field))return true;
            if(blackKingChecker(currentX,currentY+6,field)&&betweenChecker1(currentX,currentY,currentX,currentY+6,field))return true;
            if(blackKingChecker(currentX,currentY+7,field)&&betweenChecker1(currentX,currentY,currentX,currentY+7,field))return true;

            if(blackKingChecker(currentX,currentY-1,field)&&betweenChecker2(currentX,currentY,currentX,currentY-1,field))return true;
            if(blackKingChecker(currentX,currentY-2,field)&&betweenChecker2(currentX,currentY,currentX,currentY-2,field))return true;
            if(blackKingChecker(currentX,currentY-3,field)&&betweenChecker2(currentX,currentY,currentX,currentY-3,field))return true;
            if(blackKingChecker(currentX,currentY-4,field)&&betweenChecker2(currentX,currentY,currentX,currentY-4,field))return true;
            if(blackKingChecker(currentX,currentY-5,field)&&betweenChecker2(currentX,currentY,currentX,currentY-5,field))return true;
            if(blackKingChecker(currentX,currentY-6,field)&&betweenChecker2(currentX,currentY,currentX,currentY-6,field))return true;
            if(blackKingChecker(currentX,currentY-7,field)&&betweenChecker2(currentX,currentY,currentX,currentY-7,field))return true;


            if(blackKingChecker(currentX+1,currentY,field)&&betweenChecker3(currentX,currentY,currentX+1,currentY,field))return true;
            if(blackKingChecker(currentX+2,currentY,field)&&betweenChecker3(currentX,currentY,currentX+2,currentY,field))return true;
            if(blackKingChecker(currentX+3,currentY,field)&&betweenChecker3(currentX,currentY,currentX+3,currentY,field))return true;
            if(blackKingChecker(currentX+4,currentY,field)&&betweenChecker3(currentX,currentY,currentX+4,currentY,field))return true;
            if(blackKingChecker(currentX+5,currentY,field)&&betweenChecker3(currentX,currentY,currentX+5,currentY,field))return true;
            if(blackKingChecker(currentX+6,currentY,field)&&betweenChecker3(currentX,currentY,currentX+6,currentY,field))return true;
            if(blackKingChecker(currentX+7,currentY,field)&&betweenChecker3(currentX,currentY,currentX+7,currentY,field))return true;

            if(blackKingChecker(currentX-1,currentY,field)&&betweenChecker4(currentX,currentY,currentX-1,currentY,field))return true;
            if(blackKingChecker(currentX-2,currentY,field)&&betweenChecker4(currentX,currentY,currentX-2,currentY,field))return true;
            if(blackKingChecker(currentX-3,currentY,field)&&betweenChecker4(currentX,currentY,currentX-3,currentY,field))return true;
            if(blackKingChecker(currentX-4,currentY,field)&&betweenChecker4(currentX,currentY,currentX-4,currentY,field))return true;
            if(blackKingChecker(currentX-5,currentY,field)&&betweenChecker4(currentX,currentY,currentX-5,currentY,field))return true;
            if(blackKingChecker(currentX-6,currentY,field)&&betweenChecker4(currentX,currentY,currentX-6,currentY,field))return true;
            if(blackKingChecker(currentX-7,currentY,field)&&betweenChecker4(currentX,currentY,currentX-7,currentY,field))return true;

        }
        if(rook.getColor().equals("black"))
        {
            if(whiteKingChecker(currentX,currentY+1,field)&&betweenChecker1(currentX,currentY,currentX,currentY+1,field))return true;
            if(whiteKingChecker(currentX,currentY+2,field)&&betweenChecker1(currentX,currentY,currentX,currentY+2,field))return true;
            if(whiteKingChecker(currentX,currentY+3,field)&&betweenChecker1(currentX,currentY,currentX,currentY+3,field))return true;
            if(whiteKingChecker(currentX,currentY+4,field)&&betweenChecker1(currentX,currentY,currentX,currentY+4,field))return true;
            if(whiteKingChecker(currentX,currentY+5,field)&&betweenChecker1(currentX,currentY,currentX,currentY+5,field))return true;
            if(whiteKingChecker(currentX,currentY+6,field)&&betweenChecker1(currentX,currentY,currentX,currentY+6,field))return true;
            if(whiteKingChecker(currentX,currentY+7,field)&&betweenChecker1(currentX,currentY,currentX,currentY+7,field))return true;

            if(whiteKingChecker(currentX,currentY-1,field)&&betweenChecker2(currentX,currentY,currentX,currentY-1,field))return true;
            if(whiteKingChecker(currentX,currentY-2,field)&&betweenChecker2(currentX,currentY,currentX,currentY-2,field))return true;
            if(whiteKingChecker(currentX,currentY-3,field)&&betweenChecker2(currentX,currentY,currentX,currentY-3,field))return true;
            if(whiteKingChecker(currentX,currentY-4,field)&&betweenChecker2(currentX,currentY,currentX,currentY-4,field))return true;
            if(whiteKingChecker(currentX,currentY-5,field)&&betweenChecker2(currentX,currentY,currentX,currentY-5,field))return true;
            if(whiteKingChecker(currentX,currentY-6,field)&&betweenChecker2(currentX,currentY,currentX,currentY-6,field))return true;
            if(whiteKingChecker(currentX,currentY-7,field)&&betweenChecker2(currentX,currentY,currentX,currentY-7,field))return true;

            if(whiteKingChecker(currentX+1,currentY,field)&&betweenChecker3(currentX,currentY,currentX+1,currentY,field))return true;
            if(whiteKingChecker(currentX+2,currentY,field)&&betweenChecker3(currentX,currentY,currentX+2,currentY,field))return true;
            if(whiteKingChecker(currentX+3,currentY,field)&&betweenChecker3(currentX,currentY,currentX+3,currentY,field))return true;
            if(whiteKingChecker(currentX+4,currentY,field)&&betweenChecker3(currentX,currentY,currentX+4,currentY,field))return true;
            if(whiteKingChecker(currentX+5,currentY,field)&&betweenChecker3(currentX,currentY,currentX+5,currentY,field))return true;
            if(whiteKingChecker(currentX+6,currentY,field)&&betweenChecker3(currentX,currentY,currentX+6,currentY,field))return true;
            if(whiteKingChecker(currentX+7,currentY,field)&&betweenChecker3(currentX,currentY,currentX+7,currentY,field))return true;

            if(whiteKingChecker(currentX-1,currentY,field)&&betweenChecker4(currentX,currentY,currentX-1,currentY,field))return true;
            if(whiteKingChecker(currentX-2,currentY,field)&&betweenChecker4(currentX,currentY,currentX-2,currentY,field))return true;
            if(whiteKingChecker(currentX-3,currentY,field)&&betweenChecker4(currentX,currentY,currentX-3,currentY,field))return true;
            if(whiteKingChecker(currentX-4,currentY,field)&&betweenChecker4(currentX,currentY,currentX-4,currentY,field))return true;
            if(whiteKingChecker(currentX-5,currentY,field)&&betweenChecker4(currentX,currentY,currentX-5,currentY,field))return true;
            if(whiteKingChecker(currentX-6,currentY,field)&&betweenChecker4(currentX,currentY,currentX-6,currentY,field))return true;
            if(whiteKingChecker(currentX-7,currentY,field)&&betweenChecker4(currentX,currentY,currentX-7,currentY,field))return true;


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
    public void showPossibleSquares(int x,int y,Place field[][],NewGraphic chessMainGraphic)
    {
        if(field[y][x].getPiece().getColor()=="white")
        {
            for (int i = 1; y + i <= 7; ++i)
            {
                if (isItInRange(x, y + i))
                {
                    if(field[y+i][x].getPiece()==null)
                    {
                        chessMainGraphic.getMainButtons()[y+i+1][x+1].setBackground(new Color(5,55,5));
                    }
                    else
                    {
                        if(field[y+i][x].getPiece().getColor()=="white")break;
                        else
                        {
                            chessMainGraphic.getMainButtons()[y+i+1][x+1].setBackground(new Color(5,55,5));
                        }

                    }


                }
            }
            for (int i = 1; y - i >= 0; ++i)
            {
                if (isItInRange(x, y - i))
                {
                    if(field[y-i][x].getPiece()==null)
                    {
                        chessMainGraphic.getMainButtons()[y-i+1][x+1].setBackground(new Color(5,55,5));
                    }
                    else
                    {
                        if(field[y-i][x].getPiece().getColor()=="white")break;
                        else
                        {
                            chessMainGraphic.getMainButtons()[y-i+1][x+1].setBackground(new Color(5,55,5));
                        }

                    }


                }
            }
            for (int i = 1; x + i <= 7; ++i)
            {
                if (isItInRange(x+i, y ))
                {
                    if(field[y][x+i].getPiece()==null)
                    {
                        chessMainGraphic.getMainButtons()[y+1][x+i+1].setBackground(new Color(5,55,5));
                    }
                    else
                    {
                        if(field[y][x+i].getPiece().getColor()=="white")break;
                        else
                        {
                            chessMainGraphic.getMainButtons()[y+1][x+i+1].setBackground(new Color(5,55,5));
                        }

                    }


                }
            }
            for (int i = 1; x - i >= 0; ++i)
            {
                if (isItInRange(x-i, y ))
                {
                    if(field[y][x-i].getPiece()==null)
                    {
                        chessMainGraphic.getMainButtons()[y+1][x-i+1].setBackground(new Color(5,55,5));
                    }
                    else
                    {
                        if(field[y][x-i].getPiece().getColor()=="white")break;
                        else
                        {
                            chessMainGraphic.getMainButtons()[y+1][x-i+1].setBackground(new Color(5,55,5));
                        }

                    }


                }
            }


        }

        if(field[y][x].getPiece().getColor()=="black")
        {
            for (int i = 1; y + i <= 7; ++i)
            {
                if (isItInRange(x, y + i))
                {
                    if(field[y+i][x].getPiece()==null)
                    {
                        chessMainGraphic.getMainButtons()[y+1][x-i+1].setBackground(new Color(8, 107, 8));
                    }
                    else
                    {
                        if(field[y+i][x].getPiece().getColor()=="black")break;
                        else
                        {
                            chessMainGraphic.getMainButtons()[y+1][x-i+1].setBackground(new Color(8, 107, 8));
                        }

                    }


                }
            }
            for (int i = 1; y - i >= 0; ++i)
            {
                if (isItInRange(x, y - i))
                {
                    if(field[y-i][x].getPiece()==null)
                    {
                        chessMainGraphic.getMainButtons()[y+1][x-i+1].setBackground(new Color(8, 107, 8));
                    }
                    else
                    {
                        if(field[y-i][x].getPiece().getColor()=="black")break;
                        else
                        {
                            chessMainGraphic.getMainButtons()[y+1][x-i+1].setBackground(new Color(8, 107, 8));
                        }

                    }


                }
            }
            for (int i = 1; x + i <= 7; ++i)
            {
                if (isItInRange(x+i, y ))
                {
                    if(field[y][x+i].getPiece()==null)
                    {
                        chessMainGraphic.getMainButtons()[y+1][x-i+1].setBackground(new Color(8, 107, 8));
                    }
                    else
                    {
                        if(field[y][x+i].getPiece().getColor()=="black")break;
                        else
                        {
                            chessMainGraphic.getMainButtons()[y+1][x-i+1].setBackground(new Color(8, 107, 8));
                        }

                    }


                }
            }
            for (int i = 1; x - i >= 0; ++i)
            {
                if (isItInRange(x-i, y ))
                {
                    if(field[y][x-i].getPiece()==null)
                    {
                        chessMainGraphic.getMainButtons()[y+1][x-i+1].setBackground(new Color(8, 107, 8));
                    }
                    else
                    {
                        if(field[y][x-i].getPiece().getColor()=="black")break;
                        else
                        {
                            chessMainGraphic.getMainButtons()[y+1][x-i+1].setBackground(new Color(8, 107, 8));
                        }

                    }


                }
            }


        }





    }
    public boolean isItInRange(int x,int y)
    {
        if(x>=0&&x<=7&&y>=0&&y<=7)
            return true;
        else return false;

    }




}

