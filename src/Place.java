public class Place {
private int x;
private int y;
private Piece piece;
//private boolean vacant;
public Place(int x, int y,Piece b){

this.x = x;
this.y = y;
piece = b;
//vacant = true;

}

public void setPiece(Piece piece)
{
    this.piece = piece;
}
public Piece getPiece(){

    return piece;
}
}
