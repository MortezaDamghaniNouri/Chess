import java.util.ArrayList;
public class ChessLogic {
    Place field[][];
    ArrayList<Piece> blackPieces,whitePieces;
    King whiteKing,blackKing;

    public ChessLogic() {
        field=new Place[8][8];
        initialPieces();
    }

    private void initialPieces(){
        for(int i=0;i<=7;++i)
        {
            for(int j=0;j<=7;++j)
            {
                Place temp=new Place(j,i,null);
                field[i][j]=temp;
            }

        }
        //****WHITE:
        whitePieces=new ArrayList<>();
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
         whiteKing=new King(true,4,0,"white",1000);
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
        blackPieces=new ArrayList<>();
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
         blackKing=new King(true,4,7,"black",2000);
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
    }
   


     public boolean isBlackAtRisk()
    {
        Piece temp;
        for(int i=0;i<=15;++i)
        {
            temp=whitePieces.get(i);
            if(temp.getExistence())
            {
                byte w=0;
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
    public   boolean isWhiteAtRisk()
    {
        Piece temp=null;
        for(int i=0;i<=15;++i)
        {
            temp=blackPieces.get(i);
            if(temp.getExistence())
            {
                byte t;
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


    public Place getPlace(int i,int j){
        return field[i][j];
    }

    public Place[][] getField() {
        return field;
    }

    public King getWhiteKing(){
        return whiteKing;
    }

    public King getBlackKing(){
        return blackKing;
    }





}