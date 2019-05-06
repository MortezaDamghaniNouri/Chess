public class Place {
private int x;
private int y;
private Bead piece;
private boolean vacant;
public Place(int x, int y){

this.x = x;
this.y = y;
piece = null;
vacant = true;

}

public void setPiece(Bead piece){

    if(this.piece != null){
       this.piece.setExistence(false);
       this.piece = piece;
    }
    else
        this.piece = piece;
}
public Bead freePiece(){

 Bead freePiece = this.piece;
 this.piece = null;
 return freePiece;

}
public Bead getPiece(){

    return piece;
}
}
