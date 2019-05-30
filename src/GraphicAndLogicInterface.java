import java.awt.*;
import java.util.ArrayList;

public class GraphicAndLogicInterface {
    private static int firstButtonRow, firstButtonColumn, secondButtonRow, secondButtonColumn;
    private static MyListeners mainListener;


    public static void main(String args[]) {

        NewGraphic chessMainGraphic = new NewGraphic();
        mainListener = chessMainGraphic.getMainListener();


        Place field[][] = new Place[8][8];
        for (int i = 0; i <= 7; ++i) {
            for (int j = 0; j <= 7; ++j) {
                Place temp = new Place(j, i, null);
                field[i][j] = temp;
            }

        }
        //****WHITE:

        ArrayList<Piece> whitePieces = new ArrayList<>();
        Rook leftWhiteRook = new Rook(true, 0, 0, "white", 111);
        field[0][0].setPiece(leftWhiteRook);
        whitePieces.add(leftWhiteRook);
        Rook rightWhiteRook = new Rook(true, 7, 0, "white", 112);
        field[0][7].setPiece(rightWhiteRook);
        whitePieces.add(rightWhiteRook);
        Knight leftWhiteKnight = new Knight(true, 1, 0, "white", 121);
        field[0][1].setPiece(leftWhiteKnight);
        whitePieces.add(leftWhiteKnight);
        Knight rightWhiteKnight = new Knight(true, 6, 0, "white", 122);
        field[0][6].setPiece(rightWhiteKnight);
        whitePieces.add(rightWhiteKnight);
        Bishop leftWhiteBishop = new Bishop(true, 2, 0, "white", 131);
        field[0][2].setPiece(leftWhiteBishop);
        whitePieces.add(leftWhiteBishop);
        Bishop rightWhiteBishop = new Bishop(true, 5, 0, "white", 132);
        field[0][5].setPiece(rightWhiteBishop);
        whitePieces.add(rightWhiteBishop);
        Queen whiteQueen = new Queen(true, 3, 0, "white", 1);
        field[0][3].setPiece(whiteQueen);
        whitePieces.add(whiteQueen);
        King whiteKing = new King(true, 4, 0, "white", 1000);
        field[0][4].setPiece(whiteKing);
        whitePieces.add(whiteKing);
        Pawn whitePawn1 = new Pawn(true, 0, 1, "white", 141);
        field[1][0].setPiece(whitePawn1);
        whitePieces.add(whitePawn1);
        Pawn whitePawn2 = new Pawn(true, 1, 1, "white", 142);
        field[1][1].setPiece(whitePawn2);
        whitePieces.add(whitePawn2);
        Pawn whitePawn3 = new Pawn(true, 2, 1, "white", 143);
        field[1][2].setPiece(whitePawn3);
        whitePieces.add(whitePawn3);
        Pawn whitePawn4 = new Pawn(true, 3, 1, "white", 144);
        field[1][3].setPiece(whitePawn4);
        whitePieces.add(whitePawn4);
        Pawn whitePawn5 = new Pawn(true, 4, 1, "white", 145);
        field[1][4].setPiece(whitePawn5);
        whitePieces.add(whitePawn5);
        Pawn whitePawn6 = new Pawn(true, 5, 1, "white", 146);
        field[1][5].setPiece(whitePawn6);
        whitePieces.add(whitePawn6);
        Pawn whitePawn7 = new Pawn(true, 6, 1, "white", 147);
        field[1][6].setPiece(whitePawn7);
        whitePieces.add(whitePawn7);
        Pawn whitePawn8 = new Pawn(true, 7, 1, "white", 148);
        field[1][7].setPiece(whitePawn8);
        whitePieces.add(whitePawn8);

        //****
        //BLACK
        ArrayList<Piece> blackPieces = new ArrayList<>();
        Rook leftBlackRook = new Rook(true, 0, 7, "black", 211);
        field[7][0].setPiece(leftBlackRook);
        blackPieces.add(leftBlackRook);
        Rook rightBlackRook = new Rook(true, 7, 7, "black", 212);
        field[7][7].setPiece(rightBlackRook);
        blackPieces.add(rightBlackRook);
        Knight leftBlackKnight = new Knight(true, 1, 7, "black", 221);
        field[7][1].setPiece(leftBlackKnight);
        blackPieces.add(leftBlackKnight);
        Knight rightBlackKnight = new Knight(true, 6, 7, "black", 222);
        field[7][6].setPiece(rightBlackKnight);
        blackPieces.add(rightBlackKnight);
        Bishop leftBlackBishop = new Bishop(true, 2, 7, "black", 231);
        field[7][2].setPiece(leftBlackBishop);
        blackPieces.add(leftBlackBishop);
        Bishop rightBlackBishop = new Bishop(true, 5, 7, "black", 232);
        field[7][5].setPiece(rightBlackBishop);
        blackPieces.add(rightBlackBishop);
        Queen blackQueen = new Queen(true, 3, 7, "black", 2);
        field[7][3].setPiece(blackQueen);
        blackPieces.add(blackQueen);
        King blackKing = new King(true, 4, 7, "black", 2000);
        field[7][4].setPiece(blackKing);
        blackPieces.add(blackKing);
        Pawn blackPawn1 = new Pawn(true, 0, 6, "black", 241);
        field[6][0].setPiece(blackPawn1);
        blackPieces.add(blackPawn1);
        Pawn blackPawn2 = new Pawn(true, 1, 6, "black", 242);
        field[6][1].setPiece(blackPawn2);
        blackPieces.add(blackPawn2);
        Pawn blackPawn3 = new Pawn(true, 2, 6, "black", 243);
        field[6][2].setPiece(blackPawn3);
        blackPieces.add(blackPawn3);
        Pawn blackPawn4 = new Pawn(true, 3, 6, "black", 244);
        field[6][3].setPiece(blackPawn4);
        blackPieces.add(blackPawn4);
        Pawn blackPawn5 = new Pawn(true, 4, 6, "black", 245);
        field[6][4].setPiece(blackPawn5);
        blackPieces.add(blackPawn5);
        Pawn blackPawn6 = new Pawn(true, 5, 6, "black", 246);
        field[6][5].setPiece(blackPawn6);
        blackPieces.add(blackPawn6);
        Pawn blackPawn7 = new Pawn(true, 6, 6, "black", 247);
        field[6][6].setPiece(blackPawn7);
        blackPieces.add(blackPawn7);
        Pawn blackPawn8 = new Pawn(true, 7, 6, "black", 248);
        field[6][7].setPiece(blackPawn8);
        blackPieces.add(blackPawn8);
        //****
        //*****
        int blackCheckNumber = 0, whiteCheckNumber = 0;
        for (int i = 1; ; ++i) {
            int o = 12;
            if (i % 2 == 1) {
                ++o;
                //System.out.println("==========\nwhite turn:\nchoose piece which you want to move: (example:a1)");
                chessMainGraphic.setTurn("Turn:white");
                //String choose=input.next();
                for (; ; ) {
                    /*if(mainListener.getNumberOfClicks()==1)
                    {
                        possibleSquaresShower(mainListener.getFirstButtonColumn(),mainListener.getFirstButtonRow(),field,chessMainGraphic,i);
                    }
                    */
                    System.out.println("white");
                    if (mainListener.getSituation()) break;

                }
                //******
                mainListener.setSituation(false);
                System.out.println("LISTENER DID THE JOB.");
                setChooseAndPutSquares(mainListener);
                System.out.println(firstButtonColumn + "\n" + firstButtonRow + "\n" + secondButtonColumn + "\n" + secondButtonRow);
                //System.out.println("choose place which you want to put: (example:a2)");
                //String put=input.next();
                if (whiteCheckNumber == 1) {
                    ++o;
                    if (newChooseAndPut(firstButtonColumn, firstButtonRow, secondButtonColumn, secondButtonRow, field, chessMainGraphic, i)) {
                        System.out.println("it is done.");
                    } else {
                        System.out.println("again");
                        i = i - 1;
                        continue;
                    }

                    if (isWhiteAtRisk(blackPieces, field)) {
                        // System.out.println("**********\nGAME IS OVER.\n"+player2.getName()+"(black) WON THE GAME.\n**********");
                        chessMainGraphic.setTurn("GAME IS OVER." + "Player2(black) WON THE GAME.");
                        chessMainGraphic.getButt2_2().setBackground(new Color(168, 17, 13));
                        break;
                    } else {
                        whiteCheckNumber = 0;
                        continue;
                    }


                }

                if (newChooseAndPut(firstButtonColumn, firstButtonRow, secondButtonColumn, secondButtonRow, field, chessMainGraphic, i)) {
                    --o;
                    System.out.println("it is done.");


                    if (!blackKing.getExistence()) {
                        //System.out.println("**********\nGAME IS OVER.\n"+"BLACK KING IS OUT OF
                        // THE GAME.\n"+player1.getName()+"(white) WON THE GAME.\n**********");
                        chessMainGraphic.setTurn("GAME IS OVER." + "Player1(white) WON THE GAME.");
                        chessMainGraphic.getButt2_2().setBackground(new Color(168, 17, 13));
                        break;

                    }

                    if (isBlackAtRisk(whitePieces, field)) {
                        //System.out.println("*****************************************BLACK IS AT RISK.(CHECK)*****************************************");
                        chessMainGraphic.setTurn("CHECK(black)");
                        ++blackCheckNumber;
                        /*chessMainGraphic.getButt2_2().setBackground(new Color(168, 17, 13));
                        for (int y = 0; y < 1000000000; ++y) {
                            for (int x = 0; x < 5; ++x) {
                                pause();
                                ++o;
                            }
                        }
                        for (int y = 0; y < 1000000000; ++y) {
                            for (int x = 0; x < 5; ++x) {
                                pause();
                                ++o;
                            }
                        }*/
                        chessMainGraphic.getButt2_2().setBackground(null);
                    }


                    continue;
                    //break;
                } else {
                    System.out.println("again");
                    i = i - 1;
                    continue;
                }

            }


            if (i % 2 == 0) {
                ++o;
                //System.out.println("==========\nblack turn:\nchoose piece which you want to move: (example:a1)");
                //String choose=input.next();

                chessMainGraphic.setTurn("Turn:black");
                //System.out.println("choose place which you want to put: (example:a2)");
                //String put=input.next();
                for (; ; ) {
                    /*if(mainListener.getNumberOfClicks()==1)
                    {
                        possibleSquaresShower(mainListener.getFirstButtonColumn(),mainListener.getFirstButtonRow(),field,chessMainGraphic,i);
                    }
                    */
                    System.out.println("black");
                    if (mainListener.getSituation()) break;

                }
                mainListener.setSituation(false);
                setChooseAndPutSquares(mainListener);

                if (blackCheckNumber == 1) {
                    ++o;
                    if (newChooseAndPut(firstButtonColumn, firstButtonRow, secondButtonColumn, secondButtonRow, field, chessMainGraphic, i)) {
                        System.out.println("it is done.");
                    } else {
                        System.out.println("again");
                        i = i - 1;
                        continue;
                    }
                    if (isBlackAtRisk(whitePieces, field)) {
                        //System.out.println("**********\nGAME IS OVER.\n"+player1.getName()+"(white) WON THE GAME.\n**********");
                        chessMainGraphic.setTurn("GAME IS OVER." + "Player1(white) WON THE GAME.");
                        chessMainGraphic.getButt2_2().setBackground(new Color(168, 17, 13));
                        break;
                    } else {
                        blackCheckNumber = 0;
                        continue;
                    }


                }
                if (newChooseAndPut(firstButtonColumn, firstButtonRow, secondButtonColumn, secondButtonRow, field, chessMainGraphic, i)) {
                    ++o;
                    System.out.println("it is done.");
                    if (!whiteKing.getExistence()) {
                        //System.out.println("**********\nGAME IS OVER.\n"+"
                        // WHITE KING IS OUT OF THE GAME.\n"+player2.getName()+"(black) WON THE GAME.\n**********");
                        chessMainGraphic.setTurn("GAME IS OVER." + "Player2(black) WON THE GAME.");
                        chessMainGraphic.getButt2_2().setBackground(new Color(168, 17, 13));
                        break;

                    }

                    if (isWhiteAtRisk(blackPieces, field)) {
                        chessMainGraphic.setTurn("CHECK(white)");
                        //System.out.println("*****************************************WHITE IS AT RISK.(CHECK)*****************************************");
                        ++whiteCheckNumber;
                        /*chessMainGraphic.getButt2_2().setBackground(new Color(168, 17, 13));
                        for (int y = 0; y < 1000000000; ++y) {
                            for (int x = 0; x < 5; ++x) {
                                pause();
                                ++o;
                            }
                        }
                        for (int y = 0; y < 1000000000; ++y) {
                            for (int x = 0; x < 5; ++x) {
                                pause();
                                ++o;
                            }
                        }*/
                        chessMainGraphic.getButt2_2().setBackground(null);

                    }
                    continue;
                } else {
                    System.out.println("again");
                    i = i - 1;
                    continue;
                }

            }


        }
        System.out.println("============\nGAME FINISHED.\n============");


    }

    private static boolean isBlackAtRisk(ArrayList<Piece> whitePieces, Place field[][]) {
        Piece temp;
        for (int i = 0; i <= 15; ++i) {
            int d = 0;
            temp = whitePieces.get(i);
            if (temp.getExistence()) {
                ++d;
                byte w = 0;
                if (temp instanceof Queen) {
                    temp = (Queen) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }
                if (temp instanceof Rook) {

                    temp = (Rook) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }
                if (temp instanceof Bishop) {
                    temp = (Bishop) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }
                if (temp instanceof Knight) {
                    temp = (Knight) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }
                if (temp instanceof King) {
                    temp = (King) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }
                if (temp instanceof Pawn) {
                    temp = (Pawn) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }


            }


        }
        return false;

    }

    private static boolean isWhiteAtRisk(ArrayList<Piece> blackPieces, Place field[][]) {
        Piece temp;
        for (int i = 0; i <= 15; ++i) {
            int d = 0;
            temp = blackPieces.get(i);
            if (temp.getExistence()) {
                ++d;
                byte t;
                if (temp instanceof Queen) {
                    temp = (Queen) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }
                if (temp instanceof Rook) {
                    temp = (Rook) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }
                if (temp instanceof Bishop) {
                    temp = (Bishop) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }
                if (temp instanceof Knight) {
                    temp = (Knight) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }
                if (temp instanceof King) {
                    temp = (King) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }
                if (temp instanceof Pawn) {
                    temp = (Pawn) temp;
                    if (temp.check(temp.getX(), temp.getY(), field)) return true;
                }


            }


        }
        return false;

    }

    /**
     * it allocates received values of MyListeners class to related fields.
     *
     * @param input an object of MyListener class.
     */

    public static void setChooseAndPutSquares(MyListeners input) {
        firstButtonRow = input.getFirstButtonRow();
        firstButtonColumn = input.getFirstButtonColumn();
        secondButtonRow = input.getSecondButtonRow();
        secondButtonColumn = input.getSecondButtonColumn();
    }

    /**
     * it shows possible squares for a piece to move.
     *
     * @param x                place(x) of the piece.
     * @param y                place(x) of the piece.
     * @param field            the field of the game.
     * @param chessMainGraphic an object of NewGraphic class which has data about graphical interface.
     * @param turn             an integer which indicates which player have to move.
     * @return it is a boolean variable which indicates the work is done or not.
     */

    public static boolean possibleSquaresShower(int x, int y, Place field[][], NewGraphic chessMainGraphic, int turn) {
        Place choseSquare = field[y][x];
        if (choseSquare.getPiece() == null) {
            chessMainGraphic.getMainButtons()[y + 1][x + 1].setBackground(new Color(0, 4, 85));
            return false;
        } else {
            if ((turn % 2 == 1 && choseSquare.getPiece().getColor().equals("white")) || (turn % 2 == 0 && choseSquare.getPiece().getColor().equals("black")))
                if (choseSquare.getPiece() instanceof Rook) {
                    ((Rook) choseSquare.getPiece()).showPossibleSquares(x, y, field, chessMainGraphic);
                } else return false;

        }

        return false;

    }

    /**
     * it changes the place of pieces on the field of the game.
     *
     * @param firstButtonColumn  the column of first clicked button.
     * @param firstButtonRow     the row of first clicked button.
     * @param secondButtonColumn the column of second clicked button.
     * @param secondButtonRow    the row of second clicked button.
     * @param field              the field of the game.
     * @param chessMainGraphic   an object of NewGraphic class which has data about graphical interface.
     * @param turn               an integer which indicates which player have to move.
     * @return it is a boolean variable which indicates the work is done or not.
     */
    public static boolean newChooseAndPut(int firstButtonColumn, int firstButtonRow, int secondButtonColumn, int secondButtonRow, Place field[][],
                                          NewGraphic chessMainGraphic, int turn) {
        Place choseSquare = field[firstButtonRow][firstButtonColumn];
        if (choseSquare.getPiece() == null) {
            //chessMainGraphic.getMainButtons()[8-firstButtonRow][firstButtonColumn+1].setBackground(new Color(0, 4, 85));
            return false;
        } else {
            if ((turn % 2 == 1 && choseSquare.getPiece().getColor().equals("white")) || (turn % 2 == 0 && choseSquare.getPiece().getColor().equals("black")))
                return choseSquare.getPiece().move(firstButtonColumn, firstButtonRow, secondButtonColumn, secondButtonRow, field, chessMainGraphic);
            else return false;
        }


    }

    /**
     * it saves the data on consol for some seconds.
     */

    public static void pause() {
        int m = 0;
        for (int j = 0; j <= 1000000000; ++j) {
            for (int i = 0; i <= 1000000000; ++i) ++m;
        }

    }

}
