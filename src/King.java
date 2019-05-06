import java.lang.Math;
import java.util.ArrayList;

public class King extends Bead {

    public King(boolean existence, int x, int y, int i) {
        super(existence, x, y, i);
    }

    @Override
    public boolean move(int currentX, int currentY, int x, int y, Place [][] field) {
        boolean result = super.move(currentX, currentY, x, y, field);
        if (result == false)
            return false;
        if (Math.sqrt(Math.pow(Math.abs((currentX - x)), 2)) + Math.pow(Math.abs((y - currentY)), 2) != Math.sqrt(2))
            return true;
        return false;
    }




    }

