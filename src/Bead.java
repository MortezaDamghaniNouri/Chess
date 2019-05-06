import java.util.ArrayList;

public class Bead {

    private boolean existence;
    private int x;
    private int y;
    private int index;

    public Bead(boolean existence, int x, int y, int index){
        existence = true;
        this.x = x;
        this.y = y;
        this.index = index;
    }
    public void setExistence(boolean state){
        existence = state;
    }
    public boolean getExistence(){
        return existence;
    }

    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
    public int getIndex(){
        return index;
    }
    public boolean move(int currentX, int currentY, int x, int y, Place [][] field){
        if(currentX == x && currentY == y){

            if(x > 7 || y > 7 || x < 0 || y < 0)
                return false;

        }
        return true;

    }
    public boolean check(ArrayList<Bead> pieces, Place [][] field){
        for(int i = 0;i < 16;i++) {
            boolean result = pieces.get(i).move(pieces.get(i).getX(), pieces.get(i).getY(), getX(), getY(), field);
            if (result == true) {
                //pieces.get(i).getX();
                //pieces.get(i).getY();
                return true;
            }
        }
        return false;

    }
    public boolean myCheck(int x, int y, ArrayList<Bead> pieces, Place [][] field){

        for(int i = 0;i < 16;i++) {
            boolean result = pieces.get(i).move(pieces.get(i).getX(), pieces.get(i).getY(), x, y, field);
            if (result == true) {

                return true;
            }
        }
        return false;
    }
}
