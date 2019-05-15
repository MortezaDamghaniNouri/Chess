import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String name;
        System.out.println("Enter the name of first(white) player.");
        name=input.next();
        Player player1=new Player(name,"white");
        System.out.println("Enter the name of second(black) player.");
        name=input.next();
        Player player2=new Player(name,"black");
        Place field[][]=new Place[8][8];
        for(int i=0;i<=7;++i)
        {
            for(int j=0;j<=7;++j)
            {
                Place temp=new Place(j,i,null);
                field[i][j]=temp;
            }

        }
        //****WHITE:

        ArrayList<Piece> whitePieces=new ArrayList<>();
        Rook leftWhiteRook=new Rook(true,0,0,"white",11);
        field[0][0].setPiece(leftWhiteRook);
        whitePieces.add(leftWhiteRook);
        Rook rightWhiteRook=new Rook(true,7,0,"white",12);
        field[0][7].setPiece(rightWhiteRook);
        whitePieces.add(rightWhiteRook);
        Knight leftWhiteKnight=new Knight(true,1,0,"white",11);
        field[0][1].setPiece(leftWhiteKnight);
        whitePieces.add(leftWhiteKnight);
        Knight rightWhiteKnight=new Knight(true,6,0,"white",12);
        field[0][6].setPiece(rightWhiteKnight);
        whitePieces.add(rightWhiteKnight);
        Bishop leftWhiteBishop=new Bishop(true,2,0,"white",11);
        field[0][2].setPiece(leftWhiteBishop);
        whitePieces.add(leftWhiteBishop);
        Bishop rightWhiteBishop=new Bishop(true,5,0,"white",12);
        field[0][5].setPiece(rightWhiteBishop);
        whitePieces.add(rightWhiteBishop);
        Queen whiteQueen=new Queen(true,3,0,"white",1);
        field[0][3].setPiece(whiteQueen);
        whitePieces.add(whiteQueen);
        King whiteKing=new King(true,4,0,"white",1);
        field[0][4].setPiece(whiteKing);
        whitePieces.add(whiteKing);
        Pawn whitePawn1=new Pawn(true,0,1,"white",11);
        field[1][0].setPiece(whitePawn1);
        whitePieces.add(whitePawn1);
        Pawn whitePawn2=new Pawn(true,1,1,"white",12);
        field[1][1].setPiece(whitePawn2);
        whitePieces.add(whitePawn2);
        Pawn whitePawn3=new Pawn(true,2,1,"white",13);
        field[1][2].setPiece(whitePawn3);
        whitePieces.add(whitePawn3);
        Pawn whitePawn4=new Pawn(true,3,1,"white",14);
        field[1][3].setPiece(whitePawn4);
        whitePieces.add(whitePawn4);
        Pawn whitePawn5=new Pawn(true,4,1,"white",15);
        field[1][4].setPiece(whitePawn5);
        whitePieces.add(whitePawn5);
        Pawn whitePawn6=new Pawn(true,5,1,"white",16);
        field[1][5].setPiece(whitePawn6);
        whitePieces.add(whitePawn6);
        Pawn whitePawn7=new Pawn(true,6,1,"white",17);
        field[1][6].setPiece(whitePawn7);
        whitePieces.add(whitePawn7);
        Pawn whitePawn8=new Pawn(true,7,1,"white",18);
        field[1][7].setPiece(whitePawn8);
        whitePieces.add(whitePawn8);

        //****
        //BLACK
        ArrayList<Piece> blackPieces=new ArrayList<>();
        Rook leftBlackRook=new Rook(true,0,7,"black",21);
        field[7][0].setPiece(leftBlackRook);
        blackPieces.add(leftBlackRook);
        Rook rightBlackRook=new Rook(true,7,7,"black",22);
        field[7][7].setPiece(rightBlackRook);
        blackPieces.add(rightBlackRook);
        Knight leftBlackKnight=new Knight(true,1,7,"black",21);
        field[7][1].setPiece(leftBlackKnight);
        blackPieces.add(leftBlackKnight);
        Knight rightBlackKnight=new Knight(true,6,7,"black",22);
        field[7][6].setPiece(rightBlackKnight);
        blackPieces.add(rightBlackKnight);
        Bishop leftBlackBishop=new Bishop(true,2,7,"black",21);
        field[7][2].setPiece(leftBlackBishop);
        blackPieces.add(leftBlackBishop);
        Bishop rightBlackBishop=new Bishop(true,5,7,"black",22);
        field[7][5].setPiece(rightBlackBishop);
        blackPieces.add(rightBlackBishop);
        Queen blackQueen=new Queen(true,3,7,"black",2);
        field[7][3].setPiece(blackQueen);
        blackPieces.add(blackQueen);
        King blackKing=new King(true,4,7,"black",2);
        field[7][4].setPiece(blackKing);
        blackPieces.add(blackKing);
        Pawn blackPawn1=new Pawn(true,0,6,"black",21);
        field[6][0].setPiece(blackPawn1);
        blackPieces.add(blackPawn1);
        Pawn blackPawn2=new Pawn(true,1,6,"black",22);
        field[6][1].setPiece(blackPawn2);
        blackPieces.add(blackPawn2);
        Pawn blackPawn3=new Pawn(true,2,6,"black",23);
        field[6][2].setPiece(blackPawn3);
        blackPieces.add(blackPawn3);
        Pawn blackPawn4=new Pawn(true,3,6,"black",24);
        field[6][3].setPiece(blackPawn4);
        blackPieces.add(blackPawn4);
        Pawn blackPawn5=new Pawn(true,4,6,"black",25);
        field[6][4].setPiece(blackPawn5);
        blackPieces.add(blackPawn5);
        Pawn blackPawn6=new Pawn(true,5,6,"black",26);
        field[6][5].setPiece(blackPawn6);
        blackPieces.add(blackPawn6);
        Pawn blackPawn7=new Pawn(true,6,6,"black",27);
        field[6][6].setPiece(blackPawn7);
        blackPieces.add(blackPawn7);
        Pawn blackPawn8=new Pawn(true,7,6,"black",28);
        field[6][7].setPiece(blackPawn8);
        blackPieces.add(blackPawn8);
        //****
        for(int i=1;;++i)
        {
            if(i%2==1)
            {
                System.out.println("white turn:\nchoose piece which you want to move: (example:a1)");
                String choose=input.next();
                System.out.println("choose place which you want to put: (example:a2)");
                String put=input.next();
                if(chooseAndPut(choose,put,field))
                {
                    continue;
                }
                else
                {
                    i=i-1;
                    continue;
                }

            }
            if(i%2==0)
            {
                System.out.println("black turn:\nchoose piece which you want to move: (example:a1)");
                String choose=input.next();
                System.out.println("choose place which you want to put: (example:a2)");
                String put=input.next();
                if(chooseAndPut(choose,put,field))
                {
                    continue;
                }
                else
                {
                    i=i-1;
                    continue;
                }

            }










        }






    }

    private static boolean chooseAndPut(String choose,String put,Place field[][])
    {
        char c11=choose.charAt(0);
        char c12=choose.charAt(1);
        char c21=put.charAt(0);
        char c22=put.charAt(1);
        int i1=0,i2=0,j1=0,j2=0;
        int result11=0,result12=0,result21=0,result22=0;
        if(c11=='a')
        {
            j1=0;
            result12=1;
            if(c12=='1')
            {
                i1=0;
                result11=1;
            }
            if(c12=='2')
            {
                i1=1;
                result11=1;
            }
            if(c12=='3')
            {
                i1=2;
                result11=1;
            }
            if(c12=='4')
            {
                i1=3;
                result11=1;
            }
            if(c12=='5')
            {
                i1=4;
                result11=1;
            }
            if(c12=='6')
            {
                i1=5;
                result11=1;
            }
            if(c12=='7')
            {
                i1=6;
                result11=1;
            }
            if(c12=='8')
            {
                i1=7;
                result11=1;
            }

        }
        if(c11=='b')
        {
            j1=1;
            result12=1;
            if(c12=='1')
            {
                i1=0;
                result11=1;
            }
            if(c12=='2')
            {
                i1=1;
                result11=1;
            }
            if(c12=='3')
            {
                i1=2;
                result11=1;
            }
            if(c12=='4')
            {
                i1=3;
                result11=1;
            }
            if(c12=='5')
            {
                i1=4;
                result11=1;
            }
            if(c12=='6')
            {
                i1=5;
                result11=1;
            }
            if(c12=='7')
            {
                i1=6;
                result11=1;
            }
            if(c12=='8')
            {
                i1=7;
                result11=1;
            }

        }
        if(c11=='c')
        {
            j1=2;
            result12=1;
            if(c12=='1')
            {
                i1=0;
                result11=1;
            }
            if(c12=='2')
            {
                i1=1;
                result11=1;
            }
            if(c12=='3')
            {
                i1=2;
                result11=1;
            }
            if(c12=='4')
            {
                i1=3;
                result11=1;
            }
            if(c12=='5')
            {
                i1=4;
                result11=1;
            }
            if(c12=='6')
            {
                i1=5;
                result11=1;
            }
            if(c12=='7')
            {
                i1=6;
                result11=1;
            }
            if(c12=='8')
            {
                i1=7;
                result11=1;
            }

        }
        if(c11=='d')
        {
            j1=3;
            result12=1;
            if(c12=='1')
            {
                i1=0;
                result11=1;
            }
            if(c12=='2')
            {
                i1=1;
                result11=1;
            }
            if(c12=='3')
            {
                i1=2;
                result11=1;
            }
            if(c12=='4')
            {
                i1=3;
                result11=1;
            }
            if(c12=='5')
            {
                i1=4;
                result11=1;
            }
            if(c12=='6')
            {
                i1=5;
                result11=1;
            }
            if(c12=='7')
            {
                i1=6;
                result11=1;
            }
            if(c12=='8')
            {
                i1=7;
                result11=1;
            }

        }
        if(c11=='e')
        {
            j1=4;
            result12=1;
            if(c12=='1')
            {
                i1=0;
                result11=1;
            }
            if(c12=='2')
            {
                i1=1;
                result11=1;
            }
            if(c12=='3')
            {
                i1=2;
                result11=1;
            }
            if(c12=='4')
            {
                i1=3;
                result11=1;
            }
            if(c12=='5')
            {
                i1=4;
                result11=1;
            }
            if(c12=='6')
            {
                i1=5;
                result11=1;
            }
            if(c12=='7')
            {
                i1=6;
                result11=1;
            }
            if(c12=='8')
            {
                i1=7;
                result11=1;
            }

        }
        if(c11=='f')
        {
            j1=5;
            result12=1;
            if(c12=='1')
            {
                i1=0;
                result11=1;
            }
            if(c12=='2')
            {
                i1=1;
                result11=1;
            }
            if(c12=='3')
            {
                i1=2;
                result11=1;
            }
            if(c12=='4')
            {
                i1=3;
                result11=1;
            }
            if(c12=='5')
            {
                i1=4;
                result11=1;
            }
            if(c12=='6')
            {
                i1=5;
                result11=1;
            }
            if(c12=='7')
            {
                i1=6;
                result11=1;
            }
            if(c12=='8')
            {
                i1=7;
                result11=1;
            }

        }
        if(c11=='g')
        {
            j1=6;
            result12=1;
            if(c12=='1')
            {
                i1=0;
                result11=1;
            }
            if(c12=='2')
            {
                i1=1;
                result11=1;
            }
            if(c12=='3')
            {
                i1=2;
                result11=1;
            }
            if(c12=='4')
            {
                i1=3;
                result11=1;
            }
            if(c12=='5')
            {
                i1=4;
                result11=1;
            }
            if(c12=='6')
            {
                i1=5;
                result11=1;
            }
            if(c12=='7')
            {
                i1=6;
                result11=1;
            }
            if(c12=='8')
            {
                i1=7;
                result11=1;
            }

        }
        if(c11=='f')
        {
            j1=7;
            result12=1;
            if(c12=='1')
            {
                i1=0;
                result11=1;
            }
            if(c12=='2')
            {
                i1=1;
                result11=1;
            }
            if(c12=='3')
            {
                i1=2;
                result11=1;
            }
            if(c12=='4')
            {
                i1=3;
                result11=1;
            }
            if(c12=='5')
            {
                i1=4;
                result11=1;
            }
            if(c12=='6')
            {
                i1=5;
                result11=1;
            }
            if(c12=='7')
            {
                i1=6;
                result11=1;
            }
            if(c12=='8')
            {
                i1=7;
                result11=1;
            }

        }
        if(c21=='a')
        {
            int w;
            j2=0;
            result22=1;
            if(c22=='1')
            {
                i2=0;
                result21=1;
            }
            if(c22=='2')
            {
                i2=1;
                result21=1;
            }
            if(c22=='3')
            {
                i2=2;
                result21=1;
            }
            if(c22=='4')
            {
                i2=3;
                result21=1;
            }
            if(c22=='5')
            {
                i2=4;
                result21=1;
            }
            if(c22=='6')
            {
                i2=5;
                result21=1;
            }
            if(c22=='7')
            {
                i2=6;
                result21=1;
            }
            if(c22=='8')
            {
                i2=7;
                result21=1;
            }

        }
        if(c21=='b')
        {
            int w;
            j2=1;
            result22=1;
            if(c22=='1')
            {
                i2=0;
                result21=1;
            }
            if(c22=='2')
            {
                i2=1;
                result21=1;
            }
            if(c22=='3')
            {
                i2=2;
                result21=1;
            }
            if(c22=='4')
            {
                i2=3;
                result21=1;
            }
            if(c22=='5')
            {
                i2=4;
                result21=1;
            }
            if(c22=='6')
            {
                i2=5;
                result21=1;
            }
            if(c22=='7')
            {
                i2=6;
                result21=1;
            }
            if(c22=='8')
            {
                i2=7;
                result21=1;
            }

        }
        if(c21=='c')
        {
            int w;
            j2=2;
            result22=1;
            if(c22=='1')
            {
                i2=0;
                result21=1;
            }
            if(c22=='2')
            {
                i2=1;
                result21=1;
            }
            if(c22=='3')
            {
                i2=2;
                result21=1;
            }
            if(c22=='4')
            {
                i2=3;
                result21=1;
            }
            if(c22=='5')
            {
                i2=4;
                result21=1;
            }
            if(c22=='6')
            {
                i2=5;
                result21=1;
            }
            if(c22=='7')
            {
                i2=6;
                result21=1;
            }
            if(c22=='8')
            {
                i2=7;
                result21=1;
            }

        }
        if(c21=='d')
        {
            int w;
            j2=3;
            result22=1;
            if(c22=='1')
            {
                i2=0;
                result21=1;
            }
            if(c22=='2')
            {
                i2=1;
                result21=1;
            }
            if(c22=='3')
            {
                i2=2;
                result21=1;
            }
            if(c22=='4')
            {
                i2=3;
                result21=1;
            }
            if(c22=='5')
            {
                i2=4;
                result21=1;
            }
            if(c22=='6')
            {
                i2=5;
                result21=1;
            }
            if(c22=='7')
            {
                i2=6;
                result21=1;
            }
            if(c22=='8')
            {
                i2=7;
                result21=1;
            }

        }
        if(c21=='e')
        {
            int w;
            j2=4;
            result22=1;
            if(c22=='1')
            {
                i2=0;
                result21=1;
            }
            if(c22=='2')
            {
                i2=1;
                result21=1;
            }
            if(c22=='3')
            {
                i2=2;
                result21=1;
            }
            if(c22=='4')
            {
                i2=3;
                result21=1;
            }
            if(c22=='5')
            {
                i2=4;
                result21=1;
            }
            if(c22=='6')
            {
                i2=5;
                result21=1;
            }
            if(c22=='7')
            {
                i2=6;
                result21=1;
            }
            if(c22=='8')
            {
                i2=7;
                result21=1;
            }

        }
        if(c21=='f')
        {
            int w;
            j2=5;
            result22=1;
            if(c22=='1')
            {
                i2=0;
                result21=1;
            }
            if(c22=='2')
            {
                i2=1;
                result21=1;
            }
            if(c22=='3')
            {
                i2=2;
                result21=1;
            }
            if(c22=='4')
            {
                i2=3;
                result21=1;
            }
            if(c22=='5')
            {
                i2=4;
                result21=1;
            }
            if(c22=='6')
            {
                i2=5;
                result21=1;
            }
            if(c22=='7')
            {
                i2=6;
                result21=1;
            }
            if(c22=='8')
            {
                i2=7;
                result21=1;
            }

        }
        if(c21=='g')
        {
            int w;
            j2=6;
            result22=1;
            if(c22=='1')
            {
                i2=0;
                result21=1;
            }
            if(c22=='2')
            {
                i2=1;
                result21=1;
            }
            if(c22=='3')
            {
                i2=2;
                result21=1;
            }
            if(c22=='4')
            {
                i2=3;
                result21=1;
            }
            if(c22=='5')
            {
                i2=4;
                result21=1;
            }
            if(c22=='6')
            {
                i2=5;
                result21=1;
            }
            if(c22=='7')
            {
                i2=6;
                result21=1;
            }
            if(c22=='8')
            {
                i2=7;
                result21=1;
            }

        }
        if(c21=='h')
        {
            int w;
            j2=7;
            result22=1;
            if(c22=='1')
            {
                i2=0;
                result21=1;
            }
            if(c22=='2')
            {
                i2=1;
                result21=1;
            }
            if(c22=='3')
            {
                i2=2;
                result21=1;
            }
            if(c22=='4')
            {
                i2=3;
                result21=1;
            }
            if(c22=='5')
            {
                i2=4;
                result21=1;
            }
            if(c22=='6')
            {
                i2=5;
                result21=1;
            }
            if(c22=='7')
            {
                i2=6;
                result21=1;
            }
            if(c22=='8')
            {
                i2=7;
                result21=1;
            }

        }
        if(result11==0||result12==0||result21==0||result22==0)
        {
            System.out.println("WRONG INPUT.");
        }
        else
        {
            Place choseSquare=field[i1][j1];
            if(choseSquare.getPiece()==null)return false;
            else
            {
                return choseSquare.getPiece().move(j1,i1,j2,i2,field);
            }

        }


        return false;
    }











    /*public static void main(String[] args) {
        Player w = new Player("white");
        Player b = new Player("black");
        int flag = 0;
        ArrayList<Bead> wPieces = w.getList();
        ArrayList<Bead> bPieces = b.getList();
        Place[][] field = new Place[8][8];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                field[i][j] = new Place(i, j);
            }
        }
        for (int j = 0; j < 7; j++)
            field[j][1].setPiece(wPieces.get(j));

        field[0][0].setPiece(wPieces.get(8));
        field[7][0].setPiece(wPieces.get(9));
        field[6][0].setPiece(wPieces.get(10));
        field[1][0].setPiece(wPieces.get(11));
        field[5][0].setPiece(wPieces.get(12));
        field[2][0].setPiece(wPieces.get(13));
        field[3][0].setPiece(wPieces.get(14));
        field[4][0].setPiece(wPieces.get(15));

        for (int j = 0; j < 7; j++)
            field[j][6].setPiece(bPieces.get(j));

        field[0][7].setPiece(bPieces.get(8));
        field[7][7].setPiece(bPieces.get(9));
        field[6][7].setPiece(bPieces.get(10));
        field[1][7].setPiece(bPieces.get(11));
        field[5][7].setPiece(bPieces.get(12));
        field[2][7].setPiece(bPieces.get(13));
        field[3][7].setPiece(bPieces.get(14));
        field[4][7].setPiece(bPieces.get(15));
        String piece;
        while (true) {
            if (flag == 0) {
                piece = s.next();

                if (wPieces.get(15).check(bPieces, field) == true) {

                    while (true) {
                        int x = s.nextInt();
                        int y = s.nextInt();
                        if (wPieces.get(15).myCheck(x, y, bPieces, field) == true)
                            break;

                        else if (wPieces.get(15).move(wPieces.get(15).getX(), wPieces.get(15).getY(), x, y, field) == true) {
                            if (field[x][y].getPiece() != null) {
                                field[x][y].getPiece().setExistence(false);
                                bPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                field[wPieces.get(15).getX()][wPieces.get(15).getY()].freePiece();
                            }

                            wPieces.get(15).setX(x);
                            wPieces.get(15).setY(y);
                            field[x][y].setPiece(wPieces.get(15));
                        } else
                            System.out.printf("Invalid spot");

                    }
                } else {
                    int x = s.nextInt();
                    int y = s.nextInt();
                    char i = piece.charAt(1);
                    if ("p" + i == piece) {
                        if (wPieces.get(i).move(wPieces.get(i).getX(), wPieces.get(i).getY(), x, y, field) == true) {
                            if (field[x][y].getPiece() != null) {
                                field[x][y].getPiece().setExistence(false);
                                bPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                field[wPieces.get(i).getX()][wPieces.get(i).getY()].freePiece();
                            }
                            if(wPieces.get(i).getY() == 7){
                                String rescue = s.next();
                                int j = rescue.charAt(1);
                                if ("p" + j == piece)
                                {
                                    wPieces.get(j).setExistence(true);
                                    int X = s.nextInt();
                                    int Y = s.nextInt();
                                    wPieces.get(j).setX(X);
                                    wPieces.get(j).setX(Y);
                                    field[X][Y].setPiece(wPieces.get(j));
                                }
                                if ("r" + j == piece)
                                {
                                    wPieces.get(j).setExistence(true);
                                    int X = s.nextInt();
                                    int Y = s.nextInt();
                                    wPieces.get(j).setX(X);
                                    wPieces.get(j).setX(Y);
                                    field[X][Y].setPiece(wPieces.get(j));

                                }
                                if("kn" + j == piece){

                                    wPieces.get(j).setExistence(true);
                                    int X = s.nextInt();
                                    int Y = s.nextInt();
                                    wPieces.get(j).setX(X);
                                    wPieces.get(j).setX(Y);
                                    field[X][Y].setPiece(wPieces.get(j));
                                }
                                if("b" + j == piece){
                                    wPieces.get(j).setExistence(true);
                                    int X = s.nextInt();
                                    int Y = s.nextInt();
                                    wPieces.get(j).setX(X);
                                    wPieces.get(j).setX(Y);
                                    field[X][Y].setPiece(wPieces.get(j));
                                }
                                if("Q" == piece){
                                    wPieces.get(14).setExistence(true);
                                    int X = s.nextInt();
                                    int Y = s.nextInt();
                                    wPieces.get(j).setX(X);
                                    wPieces.get(j).setX(Y);
                                    field[X][Y].setPiece(wPieces.get(j));

                                }


                            }
                            wPieces.get(i).setX(x);
                            wPieces.get(i).setY(y);
                            field[x][y].setPiece(wPieces.get(i));
                        } else
                            System.out.printf("Invalid spot");
                    }
                    if ("r" + i == piece) {
                        if (wPieces.get(i + 8).move(wPieces.get(i + 8).getX(), wPieces.get(i + 8).getY(), x, y, field) == true) {
                            if (field[x][y].getPiece() != null) {
                                field[x][y].getPiece().setExistence(false);
                                bPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                field[wPieces.get(i + 8).getX()][wPieces.get(i + 8).getY()].freePiece();
                            }

                            wPieces.get(i + 8).setX(x);
                            wPieces.get(i + 8).setY(y);
                            field[x][y].setPiece(wPieces.get(i + 8));
                        } else
                            System.out.printf("Invalid spot");
                    }
                    if ("b" + i == piece) {
                        if (wPieces.get(i + 10).move(wPieces.get(i + 10).getX(), wPieces.get(i + 10).getY(), x, y, field) == true) {
                            if (field[x][y].getPiece() != null) {
                                field[x][y].getPiece().setExistence(false);
                                bPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                field[wPieces.get(i + 10).getX()][wPieces.get(i + 10).getY()].freePiece();
                            }

                            wPieces.get(i + 10).setX(x);
                            wPieces.get(i + 10).setY(y);
                            field[x][y].setPiece(wPieces.get(i + 10));
                        } else
                            System.out.printf("Invalid spot");
                    }
                    if ("kn" + i == piece) {
                        if (wPieces.get(i + 12).move(wPieces.get(i + 12).getX(), wPieces.get(i + 12).getY(), x, y, field) == true) {
                            if (field[x][y].getPiece() != null) {
                                field[x][y].getPiece().setExistence(false);
                                bPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                field[wPieces.get(i + 12).getX()][wPieces.get(i + 12).getY()].freePiece();
                            }

                            wPieces.get(i + 12).setX(x);
                            wPieces.get(i + 12).setY(y);
                            field[x][y].setPiece(wPieces.get(i + 12));
                        } else
                            System.out.printf("Invalid spot");
                    }
                    if ("Q" == piece) {
                        if (wPieces.get(14).move(wPieces.get(14).getX(), wPieces.get(14).getY(), x, y, field) == true) {
                            if (field[x][y].getPiece() != null) {
                                field[x][y].getPiece().setExistence(false);
                                bPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                field[wPieces.get(14).getX()][wPieces.get(14).getY()].freePiece();
                            }

                            wPieces.get(14).setX(x);
                            wPieces.get(14).setY(y);
                            field[x][y].setPiece(wPieces.get(14));
                        } else
                            System.out.printf("Invalid spot");
                    }
                    if ("k" == piece) {
                        if (wPieces.get(15).move(wPieces.get(15).getX(), wPieces.get(15).getY(), x, y, field) == true) {
                            if (field[x][y].getPiece() != null) {
                                field[x][y].getPiece().setExistence(false);
                                bPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                field[wPieces.get(15).getX()][wPieces.get(15).getY()].freePiece();
                            }

                            wPieces.get(15).setX(x);
                            wPieces.get(15).setY(y);
                            field[x][y].setPiece(wPieces.get(15));
                        } else
                            System.out.printf("Invalid spot");
                    }

                }
                flag = 1;


                if (flag == 1) {

                    piece = s.next();

                    if (bPieces.get(15).check(wPieces, field) == true) {

                        while (true) {
                            int x = s.nextInt();
                            int y = s.nextInt();
                            if (bPieces.get(15).myCheck(x, y, wPieces, field) == true)
                                break;

                            else if (bPieces.get(15).move(bPieces.get(15).getX(), bPieces.get(15).getY(), x, y, field) == true) {
                                if (field[x][y].getPiece() != null) {
                                    field[x][y].getPiece().setExistence(false);
                                    wPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                    field[bPieces.get(15).getX()][bPieces.get(15).getY()].freePiece();
                                }


                                bPieces.get(15).setX(x);
                                bPieces.get(15).setY(y);
                                field[x][y].setPiece(bPieces.get(15));
                            } else
                                System.out.printf("Invalid spot");

                        }
                    } else {

                        int x = s.nextInt();
                        int y = s.nextInt();
                        char i = piece.charAt(1);

                        if ("p" + i == piece) {
                            if (bPieces.get(i).move(bPieces.get(i).getX(), bPieces.get(i).getY(), x, y, field) == true) {
                                if (field[x][y].getPiece() != null) {
                                    field[x][y].getPiece().setExistence(false);
                                    wPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                    field[bPieces.get(i).getX()][bPieces.get(i).getY()].freePiece();
                                }

                                if(bPieces.get(i).getY() == 7) {
                                    String rescue = s.next();
                                    int j = rescue.charAt(1);
                                    if ("p" + j == piece) {
                                        bPieces.get(j).setExistence(true);
                                        int X = s.nextInt();
                                        int Y = s.nextInt();
                                        bPieces.get(j).setX(X);
                                        bPieces.get(j).setX(Y);
                                        field[X][Y].setPiece(bPieces.get(j));
                                    }
                                    if ("r" + j == piece) {
                                        bPieces.get(j).setExistence(true);
                                        int X = s.nextInt();
                                        int Y = s.nextInt();
                                        bPieces.get(j).setX(X);
                                        bPieces.get(j).setX(Y);
                                        field[X][Y].setPiece(bPieces.get(j));

                                    }
                                    if ("kn" + j == piece) {

                                        bPieces.get(j).setExistence(true);
                                        int X = s.nextInt();
                                        int Y = s.nextInt();
                                        bPieces.get(j).setX(X);
                                        bPieces.get(j).setX(Y);
                                        field[X][Y].setPiece(bPieces.get(j));
                                    }
                                    if ("b" + j == piece) {
                                        bPieces.get(j).setExistence(true);
                                        int X = s.nextInt();
                                        int Y = s.nextInt();
                                        bPieces.get(j).setX(X);
                                        bPieces.get(j).setX(Y);
                                        field[X][Y].setPiece(bPieces.get(j));
                                    }
                                    if ("Q" == piece) {
                                        bPieces.get(14).setExistence(true);
                                        int X = s.nextInt();
                                        int Y = s.nextInt();
                                        bPieces.get(j).setX(X);
                                        bPieces.get(j).setX(Y);
                                        field[X][Y].setPiece(bPieces.get(j));

                                    }
                                }
                                bPieces.get(i).setX(x);
                                bPieces.get(i).setY(y);
                                field[x][y].setPiece(bPieces.get(i));
                            } else
                                System.out.printf("Invalid spot");
                        }
                        if ("r" + i == piece) {
                            if (bPieces.get(i + 8).move(bPieces.get(i + 8).getX(), bPieces.get(i + 8).getY(), x, y, field) == true) {
                                if (field[x][y].getPiece() != null) {
                                    field[x][y].getPiece().setExistence(false);
                                    wPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                    field[bPieces.get(i + 8).getX()][bPieces.get(i + 8).getY()].freePiece();
                                }

                                bPieces.get(i + 8).setX(x);
                                bPieces.get(i + 8).setY(y);
                                field[x][y].setPiece(bPieces.get(i + 8));
                            } else
                                System.out.printf("Invalid spot");
                        }
                        if ("b" + i == piece) {
                            if (bPieces.get(i + 10).move(bPieces.get(i + 10).getX(), bPieces.get(i + 10).getY(), x, y, field) == true) {
                                if (field[x][y].getPiece() != null) {
                                    field[x][y].getPiece().setExistence(false);
                                    wPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                    field[bPieces.get(i + 10).getX()][bPieces.get(i + 10).getY()].freePiece();
                                }

                                bPieces.get(i + 10).setX(x);
                                bPieces.get(i + 10).setY(y);
                                field[x][y].setPiece(bPieces.get(i + 10));
                            } else
                                System.out.printf("Invalid spot");
                        }
                        if ("kn" + i == piece) {
                            if (bPieces.get(i + 12).move(bPieces.get(i + 12).getX(), bPieces.get(i + 12).getY(), x, y, field) == true) {
                                if (field[x][y].getPiece() != null) {
                                    field[x][y].getPiece().setExistence(false);
                                    wPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                    field[bPieces.get(i + 12).getX()][bPieces.get(i + 12).getY()].freePiece();
                                }

                                bPieces.get(i + 12).setX(x);
                                bPieces.get(i + 12).setY(y);
                                field[x][y].setPiece(bPieces.get(i + 12));
                            } else
                                System.out.printf("Invalid spot");
                        }
                        if ("Q" == piece) {
                            if (bPieces.get(14).move(bPieces.get(14).getX(), bPieces.get(14).getY(), x, y, field) == true) {
                                if (field[x][y].getPiece() != null) {
                                    field[x][y].getPiece().setExistence(false);
                                    wPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                    field[bPieces.get(14).getX()][bPieces.get(14).getY()].freePiece();
                                }

                                bPieces.get(14).setX(x);
                                bPieces.get(14).setY(y);
                                field[x][y].setPiece(bPieces.get(14));
                            } else
                                System.out.printf("Invalid spot");
                        }
                        if ("k" == piece) {
                            if (bPieces.get(15).move(bPieces.get(15).getX(), bPieces.get(15).getY(), x, y, field) == true) {
                                if (field[x][y].getPiece() != null) {
                                    field[x][y].getPiece().setExistence(false);
                                    wPieces.get(field[x][y].getPiece().getIndex()).setExistence(false);
                                    field[bPieces.get(15).getX()][bPieces.get(15).getY()].freePiece();
                                }

                                bPieces.get(15).setX(x);
                                bPieces.get(15).setY(y);
                                field[x][y].setPiece(bPieces.get(15));
                            } else
                                System.out.printf("Invalid spot");
                        }
                    }
                    flag = 0;


                }

            }
        }
    }
    */
}