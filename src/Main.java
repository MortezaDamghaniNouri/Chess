import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String name;
        System.out.println("Enter the name of first(white) player:");
        name=input.next();
        Player player1=new Player(name,"white");
        System.out.println("Enter the name of second(black) player:");
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
        King whiteKing=new King(true,4,0,"white",1000);
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
        King blackKing=new King(true,4,7,"black",2000);
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
        //*****
        int blackCheckNumber=0,whiteCheckNumber=0;
        for(int i=1;;++i)
        {
            if(i%2==1)
            {
                System.out.println("==========\nwhite turn:\nchoose piece which you want to move: (example:a1)");
                String choose=input.next();
                System.out.println("choose place which you want to put: (example:a2)");
                String put=input.next();
                if(whiteCheckNumber==1)
                {
                    if(chooseAndPut(choose,put,field,i))
                    {
                        System.out.println("it is done.");
                    }
                    else
                    {
                        System.out.println("again");
                        i=i-1;
                        continue;
                    }
                    if(isWhiteAtRisk(blackPieces,field))
                    {
                        System.out.println("**********\nGAME IS OVER.\n"+player2.getName()+"(black) WON THE GAME.\n**********");
                        break;
                    }
                    else
                    {
                        whiteCheckNumber=0;
                        continue;
                    }


                }
                if(chooseAndPut(choose,put,field,i))
                {
                    System.out.println("it is done.");
                    if(isBlackAtRisk(whitePieces,field))
                    {
                        System.out.println("*****************************************BLACK IS AT RISK.(CHECK)*****************************************");
                        ++blackCheckNumber;


                    }
                    continue;
                }
                else
                {
                    System.out.println("again");
                    i=i-1;
                    continue;
                }

            }
            if(i%2==0)
            {
                System.out.println("==========\nblack turn:\nchoose piece which you want to move: (example:a1)");
                String choose=input.next();
                System.out.println("choose place which you want to put: (example:a2)");
                String put=input.next();
                if(blackCheckNumber==1)
                {
                    if(chooseAndPut(choose,put,field,i))
                    {
                        System.out.println("it is done.");
                    }
                    else
                    {
                        System.out.println("again");
                        i=i-1;
                        continue;
                    }
                    if(isBlackAtRisk(whitePieces,field))
                    {
                        System.out.println("**********\nGAME IS OVER.\n"+player1.getName()+"(white) WON THE GAME.\n**********");
                        break;
                    }
                    else
                    {
                        blackCheckNumber=0;
                        continue;
                    }


                }
                if(chooseAndPut(choose,put,field,i))
                {
                    System.out.println("it is done.");
                    if(isWhiteAtRisk(blackPieces,field))
                    {
                        System.out.println("*****************************************WHITE IS AT RISK.(CHECK)*****************************************");
                        ++whiteCheckNumber;


                    }
                    continue;
                }
                else
                {
                    System.out.println("again");
                    i=i-1;
                    continue;
                }

            }










        }
        System.out.println("============\nGAME FINISHED.\n============");





    }

    private static boolean chooseAndPut(String choose,String put,Place field[][],int turn)
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
        if(c11=='h')
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
            System.out.println("(i1="+i1+"  j1="+j1+"  i2="+i2+"  j2="+j2+")");
            Place choseSquare=field[i1][j1];
            if(choseSquare.getPiece()==null){
                System.out.println("NULL");return false;}
            else
            {
                if((turn%2==1&&choseSquare.getPiece().getColor().equals("white"))||(turn%2==0&&choseSquare.getPiece().getColor().equals("black")))
                return choseSquare.getPiece().move(j1,i1,j2,i2,field);
                else return false;
            }

        }


        return false;
    }


    private static boolean isBlackAtRisk(ArrayList<Piece> whitePieces,Place field[][])
    {
        Piece temp;
        for(int i=0;i<=15;++i)
        {
            temp=whitePieces.get(i);
            if(temp.getExistence()&&temp.check(temp.getX(),temp.getY(),field))
            {
                return true;
            }


        }
        return false;

    }
    private static boolean isWhiteAtRisk(ArrayList<Piece> blackPieces,Place field[][])
    {
        Piece temp;
        for(int i=0;i<=15;++i)
        {
            temp=blackPieces.get(i);
            if(temp.getExistence()&&temp.check(temp.getX(),temp.getY(),field))
            {
                return true;
            }


        }
        return false;

    }










}