import java.util.Scanner;

public class ConsoleInterface {
    public static void main(String[] args) {
        ChessLogic logic=new ChessLogic();

        Scanner input=new Scanner(System.in);
        String name;
        System.out.println("Enter the name of first(white) player:");
        name=input.next();
        Player player1=new Player(name,"white");
        System.out.println("Enter the name of second(black) player:");
        name=input.next();
        Player player2=new Player(name,"black");


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
                    if(chooseAndPut(choose,put,i,logic))
                    {
                        System.out.println("it is done.");
                    }
                    else
                    {
                        System.out.println("again");
                        i=i-1;
                        continue;
                    }
                    if(logic.isWhiteAtRisk())
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
                if(chooseAndPut(choose,put,i,logic))
                {
                    System.out.println("it is done.");
                    if(!logic.getBlackKing().getExistence())
                    {
                        System.out.println("**********\nGAME IS OVER.\n"+"BLACK KING IS OUT OF THE GAME.\n"+player1.getName()+"(white) WON THE GAME.\n**********");
                        break;

                    }
                    if(logic.isBlackAtRisk())
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
                    if(chooseAndPut(choose,put,i,logic))
                    {
                        System.out.println("it is done.");
                    }
                    else
                    {
                        System.out.println("again");
                        i=i-1;
                        continue;
                    }
                    if(logic.isBlackAtRisk())
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
                if(chooseAndPut(choose,put,i,logic))
                {
                    System.out.println("it is done.");
                    if(!logic.getWhiteKing().getExistence())
                    {
                        System.out.println("**********\nGAME IS OVER.\n"+"WHITE KING IS OUT OF THE GAME.\n"+player2.getName()+"(black) WON THE GAME.\n**********");
                        break;

                    }
                    if(logic.isWhiteAtRisk())
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


    private static boolean chooseAndPut(String choose,String put,int turn,ChessLogic logic)
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

            Place choseSquare=logic.getPlace(i1,j1);
            if(choseSquare.getPiece()==null){
                System.out.println("NULL");return false;}
            else
            {
                if((turn%2==1&&choseSquare.getPiece().getColor().equals("white"))||(turn%2==0&&choseSquare.getPiece().getColor().equals("black")))
                    return choseSquare.getPiece().move(j1,i1,j2,i2,logic.getField());
                else return false;
            }

        }


        return false;
    }
}
