import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Test1
{
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
        //white******
        ArrayList<Piece> whitePieces=new ArrayList<>();
        Rook leftWhiteRook=new Rook(true,3,0,"white",11);
        field[0][3].setPiece(leftWhiteRook);
        whitePieces.add(leftWhiteRook);
        //System.out.println(whitePieces.get(0).getIndex());
        //Bishop leftWhiteBishop=new Bishop(true,2,0,"white",11);
        //field[0][2].setPiece(leftWhiteBishop);
        //whitePieces.add(leftWhiteBishop);
        King whiteKing=new King(true,4,0,"white",1000);
        field[0][4].setPiece(whiteKing);
        whitePieces.add(whiteKing);
        //black**********
        ArrayList<Piece> blackPieces=new ArrayList<>();
        Rook leftBlackRook=new Rook(true,0,7,"black",21);
        field[7][0].setPiece(leftBlackRook);
        blackPieces.add(leftBlackRook);
        //Queen blackQueen=new Queen(true,3,7,"black",2);
        //field[7][3].setPiece(blackQueen);
        //blackPieces.add(blackQueen);
        King blackKing=new King(true,4,7,"black",2000);
        field[7][4].setPiece(blackKing);
        blackPieces.add(blackKing);
        //*****
        int blackCheckNumber=0,whiteCheckNumber=0;
        for(int i=1;;++i)
        {
            if(i%2==1)
            {
                System.out.println("==========\nwhite turn:\nchoose piece which you want to move: (example:a1)");
                int choose=input.nextInt();
                System.out.println("choose place which you want to put: (example:a2)");
                int put=input.nextInt();
                if(whiteCheckNumber==1)
                {
                    if(newChooseAndPut(choose,put,field,i))
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
                if(newChooseAndPut(choose,put,field,i))
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
                int choose=input.nextInt();
                System.out.println("choose place which you want to put: (example:a2)");
                int put=input.nextInt();
                if(blackCheckNumber==1)
                {
                    if(newChooseAndPut(choose,put,field,i))
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
                if(newChooseAndPut(choose,put,field,i))
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
    private static boolean isBlackAtRisk(ArrayList<Piece> whitePieces,Place field[][])
    {
        Piece temp;

        for(int i=0;i<=1;++i)
        {

            temp=whitePieces.get(i);
            if(temp.getExistence())
            {
                if(temp instanceof Queen)
                {
                    temp=(Queen) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }
                if(temp instanceof Rook)
                {

                    temp=(Rook) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }
                if(temp instanceof Bishop)
                {
                    temp=(Bishop) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }
                if(temp instanceof Knight)
                {
                    temp=(Knight) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }
                if(temp instanceof King)
                {
                    temp=(King) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }
                if(temp instanceof Pawn)
                {
                    temp=(Pawn) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }




            }


        }
        return false;

    }
    private static boolean isWhiteAtRisk(ArrayList<Piece> blackPieces,Place field[][])
    {
        Piece temp;

        for(int i=0;i<=1;++i)
        {
            temp=blackPieces.get(i);
            if(temp.getExistence())
            {
                byte u=1;
                if(temp instanceof Queen)
                {
                    temp=(Queen) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }
                if(temp instanceof Rook)
                {
                    temp=(Rook) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }
                if(temp instanceof Bishop)
                {
                    temp=(Bishop) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }
                if(temp instanceof Knight)
                {
                    temp=(Knight) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }
                if(temp instanceof King)
                {
                    temp=(King) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }
                if(temp instanceof Pawn)
                {
                    temp=(Pawn) temp;
                    if(temp.check(temp.getX(),temp.getY(),field))return true;
                }




            }

        }
        return false;

    }

    private static boolean newChooseAndPut(int choose,int put,Place field[][],int turn) {
        int i1 = 0, i2 = 0, j1 = 0, j2 = 0;
        i1=choose%10;j1=choose/10;i2=put%10;j2=put/10;
        System.out.println("(i1="+i1+"  j1="+j1+"  i2="+i2+"  j2="+j2+")");
        Place choseSquare=field[i1][j1];
        if(choseSquare.getPiece()==null){
            System.out.println("NULL");return false;}
         else
            {
                byte r=1;
                if((turn%2==1&&choseSquare.getPiece().getColor().equals("white"))||(turn%2==0&&choseSquare.getPiece().getColor().equals("black")))
                    return choseSquare.getPiece().move(j1,i1,j2,i2,field);
                else return false;
            }






        }






}
