public class Bishop extends Piece {

    public Bishop(boolean existence, int x, int y, String c,int i) {
        super(existence, x, y,c,i);
    }

    @Override
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place [][] field) {
        boolean result = super.move(currentX, currentY,nextX,nextY, field);
        if (!result)
            return false;
        else
        {
            if(nextY==currentY+1&&nextX==currentX+1)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY+i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int m=11;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;

            }
            if(nextY==currentY+2&&nextX==currentX+2)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY+i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int u=10,n=2;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int m=10,n=12;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+3&&nextX==currentX+3)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY+i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int y=9;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int m=11,y=1;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+4&&nextX==currentX+4)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY+i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int p=8;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int q=11,i;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+5&&nextX==currentX+5)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY+i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int o=13;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int m=13;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+6&&nextX==currentX+6)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY+i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int o=14;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int m=14;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+7&&nextX==currentX+7)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY+i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int o=15;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int m=15;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-1&&nextX==currentX-1)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY-i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=101;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=101;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-2&&nextX==currentX-2)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY-i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=102;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=102;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-3&&nextX==currentX-3)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY-i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=103;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=103;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-4&&nextX==currentX-4)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY-i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=104;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=104;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-5&&nextX==currentX-5)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY-i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=105;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=105;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-6&&nextX==currentX-6)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY-i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=106;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=106;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-7&&nextX==currentX-7)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY-i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=107;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=107;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-1&&nextX==currentX+1)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY-i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=11;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=11,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-2&&nextX==currentX+2)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY-i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=12;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=12,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-3&&nextX==currentX+3)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY-i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=13,q=1;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=13,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-4&&nextX==currentX+4)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY-i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=14,d;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=14,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-5&&nextX==currentX+5)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY-i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=15,f;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=15,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-6&&nextX==currentX+6)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY-i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=16;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=16,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY-7&&nextX==currentX+7)
            {
                for(int i=1;currentY-i>=nextY+1&&currentX+i<=nextX-1;++i)
                {
                    if(field[currentY-i][currentX+i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=17;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=17,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+1&&nextX==currentX-1)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY+i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=21;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=21,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+2&&nextX==currentX-2)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY+i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=22;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=22,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+3&&nextX==currentX-3)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY+i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=23;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=23,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+4&&nextX==currentX-4)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY+i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=24;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=24,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+5&&nextX==currentX-5)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY+i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=25;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=25,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+6&&nextX==currentX-6)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY+i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=26;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=26,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if(nextY==currentY+7&&nextX==currentX-7)
            {
                for(int i=1;currentY+i<=nextY-1&&currentX-i>=nextX+1;++i)
                {
                    if(field[currentY+i][currentX-i]!=null)return false;

                }
                if(field[nextY][nextX]==null)
                {
                    int w=27;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    int p=27,l=0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }





        }

        return false;
    }
}
