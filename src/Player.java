import java.util.ArrayList;
public class Player {

private String color;
private ArrayList <Bead> pieces = new ArrayList<>();
private String result;
public Player(String color){
  this.color = color;
  if(color == "white") {
      for (int i = 0; i < 8; i++)
          pieces.add(new Pawn(true, i, 1, i));

      pieces.add(new Rook(true, 0, 0, 8));
      pieces.add(new Rook(true, 7, 0, 9));
      pieces.add(new Bishop(true, 6, 0, 10));
      pieces.add(new Bishop(true, 1, 0, 11));
      pieces.add(new Knight(true, 5, 0, 12));
      pieces.add(new Knight(true, 2, 0, 13));
      pieces.add(new Queen(true, 3, 0, 14));
      pieces.add(new King(true, 4, 0, 15));
  }
  if(color == "black"){
      for (int i = 0; i < 8; i++)
          pieces.add(new Pawn(true, i, 6, i));

      pieces.add(new Rook(true, 0, 7, 8));
      pieces.add(new Rook(true, 7, 7, 9));
      pieces.add(new Bishop(true, 6, 7, 10));
      pieces.add(new Bishop(true, 1, 7, 11));
      pieces.add(new Knight(true, 5, 7, 12));
      pieces.add(new Knight(true, 2, 7, 13));
      pieces.add(new Queen(true, 3, 7, 14));
      pieces.add(new King(true, 4, 7, 15));



  }
}
public void setWinner(){
    result = "winner";
}
public ArrayList<Bead> getList(){
    return pieces;
}

}
