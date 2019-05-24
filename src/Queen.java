public class Queen extends Piece {

    public Queen(boolean existence, int x, int y,String c,int i) {
        super(existence, x, y,c,i);
    }

    @Override
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place[][] field,NewGraphic chessMainGraphic) {
        boolean result = super.move(currentX, currentY,nextX,nextY,field,chessMainGraphic);
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
                if(field[nextY][nextX].getPiece()==null)
                {
                    byte n=3;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=11,l=11;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {

                    int u;double e;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=112,n=112;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int y=9;double e=12;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=11,y=1;double e=12.5;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int p=8;double t=19;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int q=11,i;double y=201;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int o=13;double f=22;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=13;double k=23;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int o=14;double k=24;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=14;double k=24;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int o=15;double k=24;double l=23;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int m=15;double k=23;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=101;double k=25;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=101;double k=25;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=102;double k=23;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=102;double k=26;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=103;double k=26;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=103;double k=27;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=104;double k=28;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=104;double k=28;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=105;double k=29;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=105;double k=29;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=106;double k=29;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=106;double k=30;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=107;double k=31;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=107;double k=32;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=11;double k=33;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=11,l=0;double k=34;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=12;double k=35;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=12,l=0;double k=36;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=13,q=1;double k=37;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=13,l=0;double k=38;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=14,d;double k=39;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=14,l=0;double k=39;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=15,f;double k=40;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=15,l=0;double k=40;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=16;double k=41;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=16,l=0;double k=41;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY-i][currentX+i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=17;double k=41;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=17,l=0;double k=41;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=21;double k=41;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=21,l=0;double k=42;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=22;double k=42;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=22,l=0;double k=43;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=23;double k=43;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=23,l=0;double k=43;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=24;double k=44;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=24,l=0;double k=44;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=25;double k=44;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=25,l=0;double k=45;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=26;double k=45;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=26,l=0;double k=46;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
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
                    if(field[currentY+i][currentX-i].getPiece()!=null)return false;

                }
                if(field[nextY][nextX].getPiece()==null)
                {
                    int w=27;double k=23;
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                else
                {
                    if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                    int p=27,l=0;double k=47;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextX == currentX || nextY == currentY) {
                if (nextY == currentY) {
                    if (nextX > currentX) {
                        for (int i = currentX + 1; i <= nextX - 1; ++i) {
                            if (field[currentY][i].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            byte u=8;
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            byte u=1;
                            if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;

                    }
                    if (currentX > nextX) {
                        for (int i = currentX - 1; i >= nextX + 1; --i) {
                            if (field[currentY][i].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            byte u=1;
                            if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                            int i = 0;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;


                    }


                }
                if (nextX == currentX) {
                    int k = 0;
                    if (nextY > currentY) {
                        for (int i = currentY + 1; i <= nextY - 1; ++i) {
                            int y = 0;
                            if (field[i][currentX].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            byte u=1;
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            byte u=1;
                            if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                            int m = 1;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;

                    }
                    if (currentY > nextY) {
                        byte u=1;
                        for (int i = currentY - 1; i >= nextY + 1; --i) {
                            if (field[i][currentX].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            byte o=2;
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            byte p=1;
                            if(field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))return false;
                            int w = 0, j = 0;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX,currentY,nextX,nextY,field,chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;


                    }


                }


            }






        }


        return false;

    }



    public boolean check(int currentX,int currentY,Place field[][])
    {
        Piece queen=field[currentY][currentX].getPiece();
        if(queen.getColor().equals("white"))
        {
            if(blackKingChecker(currentX,currentY+1,field)&&betweenChecker11(currentX,currentY,currentX,currentY+1,field))return true;
            if(blackKingChecker(currentX,currentY+2,field)&&betweenChecker11(currentX,currentY,currentX,currentY+2,field))return true;
            if(blackKingChecker(currentX,currentY+3,field)&&betweenChecker11(currentX,currentY,currentX,currentY+3,field))return true;
            if(blackKingChecker(currentX,currentY+4,field)&&betweenChecker11(currentX,currentY,currentX,currentY+4,field))return true;
            if(blackKingChecker(currentX,currentY+5,field)&&betweenChecker11(currentX,currentY,currentX,currentY+5,field))return true;
            if(blackKingChecker(currentX,currentY+6,field)&&betweenChecker11(currentX,currentY,currentX,currentY+6,field))return true;
            if(blackKingChecker(currentX,currentY+7,field)&&betweenChecker11(currentX,currentY,currentX,currentY+7,field))return true;

            if(blackKingChecker(currentX+1,currentY+1,field)&&betweenChecker21(currentX,currentY,currentX+1,currentY+1,field))return true;
            if(blackKingChecker(currentX+2,currentY+2,field)&&betweenChecker21(currentX,currentY,currentX+2,currentY+2,field))return true;
            if(blackKingChecker(currentX+3,currentY+3,field)&&betweenChecker21(currentX,currentY,currentX+3,currentY+3,field))return true;
            if(blackKingChecker(currentX+4,currentY+4,field)&&betweenChecker21(currentX,currentY,currentX+4,currentY+4,field))return true;
            if(blackKingChecker(currentX+5,currentY+5,field)&&betweenChecker21(currentX,currentY,currentX+5,currentY+5,field))return true;
            if(blackKingChecker(currentX+6,currentY+6,field)&&betweenChecker21(currentX,currentY,currentX+6,currentY+6,field))return true;
            if(blackKingChecker(currentX+7,currentY+7,field)&&betweenChecker21(currentX,currentY,currentX+7,currentY+7,field))return true;
//====
            if(blackKingChecker(currentX,currentY-1,field)&&betweenChecker12(currentX,currentY,currentX,currentY-1,field))return true;
            if(blackKingChecker(currentX,currentY-2,field)&&betweenChecker12(currentX,currentY,currentX,currentY-2,field))return true;
            if(blackKingChecker(currentX,currentY-3,field)&&betweenChecker12(currentX,currentY,currentX,currentY-3,field))return true;
            if(blackKingChecker(currentX,currentY-4,field)&&betweenChecker12(currentX,currentY,currentX,currentY-4,field))return true;
            if(blackKingChecker(currentX,currentY-5,field)&&betweenChecker12(currentX,currentY,currentX,currentY-5,field))return true;
            if(blackKingChecker(currentX,currentY-6,field)&&betweenChecker12(currentX,currentY,currentX,currentY-6,field))return true;
            if(blackKingChecker(currentX,currentY-7,field)&&betweenChecker12(currentX,currentY,currentX,currentY-7,field))return true;

            if(blackKingChecker(currentX-1,currentY-1,field)&&betweenChecker22(currentX,currentY,currentX-1,currentY-1,field))return true;
            if(blackKingChecker(currentX-2,currentY-2,field)&&betweenChecker22(currentX,currentY,currentX-2,currentY-2,field))return true;
            if(blackKingChecker(currentX-3,currentY-3,field)&&betweenChecker22(currentX,currentY,currentX-3,currentY-3,field))return true;
            if(blackKingChecker(currentX-4,currentY-4,field)&&betweenChecker22(currentX,currentY,currentX-4,currentY-4,field))return true;
            if(blackKingChecker(currentX-5,currentY-5,field)&&betweenChecker22(currentX,currentY,currentX-5,currentY-5,field))return true;
            if(blackKingChecker(currentX-6,currentY-6,field)&&betweenChecker22(currentX,currentY,currentX-6,currentY-6,field))return true;
            if(blackKingChecker(currentX-7,currentY-7,field)&&betweenChecker22(currentX,currentY,currentX-7,currentY-7,field))return true;
//====
            if(blackKingChecker(currentX+1,currentY,field)&&betweenChecker13(currentX,currentY,currentX+1,currentY,field))return true;
            if(blackKingChecker(currentX+2,currentY,field)&&betweenChecker13(currentX,currentY,currentX+2,currentY,field))return true;
            if(blackKingChecker(currentX+3,currentY,field)&&betweenChecker13(currentX,currentY,currentX+3,currentY,field))return true;
            if(blackKingChecker(currentX+4,currentY,field)&&betweenChecker13(currentX,currentY,currentX+4,currentY,field))return true;
            if(blackKingChecker(currentX+5,currentY,field)&&betweenChecker13(currentX,currentY,currentX+5,currentY,field))return true;
            if(blackKingChecker(currentX+6,currentY,field)&&betweenChecker13(currentX,currentY,currentX+6,currentY,field))return true;
            if(blackKingChecker(currentX+7,currentY,field)&&betweenChecker13(currentX,currentY,currentX+7,currentY,field))return true;


            if(blackKingChecker(currentX+1,currentY-1,field)&&betweenChecker23(currentX,currentY,currentX+1,currentY-1,field))return true;
            if(blackKingChecker(currentX+2,currentY-2,field)&&betweenChecker23(currentX,currentY,currentX+2,currentY-2,field))return true;
            if(blackKingChecker(currentX+3,currentY-3,field)&&betweenChecker23(currentX,currentY,currentX+3,currentY-3,field))return true;
            if(blackKingChecker(currentX+4,currentY-4,field)&&betweenChecker23(currentX,currentY,currentX+4,currentY-4,field))return true;
            if(blackKingChecker(currentX+5,currentY-5,field)&&betweenChecker23(currentX,currentY,currentX+5,currentY-5,field))return true;
            if(blackKingChecker(currentX+6,currentY-6,field)&&betweenChecker23(currentX,currentY,currentX+6,currentY-6,field))return true;
            if(blackKingChecker(currentX+7,currentY-7,field)&&betweenChecker23(currentX,currentY,currentX+7,currentY-7,field))return true;

//====
            if(blackKingChecker(currentX-1,currentY,field)&&betweenChecker14(currentX,currentY,currentX-1,currentY,field))return true;
            if(blackKingChecker(currentX-2,currentY,field)&&betweenChecker14(currentX,currentY,currentX-2,currentY,field))return true;
            if(blackKingChecker(currentX-3,currentY,field)&&betweenChecker14(currentX,currentY,currentX-3,currentY,field))return true;
            if(blackKingChecker(currentX-4,currentY,field)&&betweenChecker14(currentX,currentY,currentX-4,currentY,field))return true;
            if(blackKingChecker(currentX-5,currentY,field)&&betweenChecker14(currentX,currentY,currentX-5,currentY,field))return true;
            if(blackKingChecker(currentX-6,currentY,field)&&betweenChecker14(currentX,currentY,currentX-6,currentY,field))return true;
            if(blackKingChecker(currentX-7,currentY,field)&&betweenChecker14(currentX,currentY,currentX-7,currentY,field))return true;


            if(blackKingChecker(currentX-1,currentY+1,field)&&betweenChecker24(currentX,currentY,currentX-1,currentY+1,field))return true;
            if(blackKingChecker(currentX-2,currentY+2,field)&&betweenChecker24(currentX,currentY,currentX-2,currentY+2,field))return true;
            if(blackKingChecker(currentX-3,currentY+3,field)&&betweenChecker24(currentX,currentY,currentX-3,currentY+3,field))return true;
            if(blackKingChecker(currentX-4,currentY+4,field)&&betweenChecker24(currentX,currentY,currentX-4,currentY+4,field))return true;
            if(blackKingChecker(currentX-5,currentY+5,field)&&betweenChecker24(currentX,currentY,currentX-5,currentY+5,field))return true;
            if(blackKingChecker(currentX-6,currentY+6,field)&&betweenChecker24(currentX,currentY,currentX-6,currentY+6,field))return true;
            if(blackKingChecker(currentX-7,currentY+7,field)&&betweenChecker24(currentX,currentY,currentX-7,currentY+7,field))return true;
        }
        if(queen.getColor().equals("black"))
        {
            if(whiteKingChecker(currentX,currentY+1,field)&&betweenChecker11(currentX,currentY,currentX,currentY+1,field))return true;
            if(whiteKingChecker(currentX,currentY+2,field)&&betweenChecker11(currentX,currentY,currentX,currentY+2,field))return true;
            if(whiteKingChecker(currentX,currentY+3,field)&&betweenChecker11(currentX,currentY,currentX,currentY+3,field))return true;
            if(whiteKingChecker(currentX,currentY+4,field)&&betweenChecker11(currentX,currentY,currentX,currentY+4,field))return true;
            if(whiteKingChecker(currentX,currentY+5,field)&&betweenChecker11(currentX,currentY,currentX,currentY+5,field))return true;
            if(whiteKingChecker(currentX,currentY+6,field)&&betweenChecker11(currentX,currentY,currentX,currentY+6,field))return true;
            if(whiteKingChecker(currentX,currentY+7,field)&&betweenChecker11(currentX,currentY,currentX,currentY+7,field))return true;

            if(whiteKingChecker(currentX+1,currentY+1,field)&&betweenChecker21(currentX,currentY,currentX+1,currentY+1,field))return true;
            if(whiteKingChecker(currentX+2,currentY+2,field)&&betweenChecker21(currentX,currentY,currentX+2,currentY+2,field))return true;
            if(whiteKingChecker(currentX+3,currentY+3,field)&&betweenChecker21(currentX,currentY,currentX+3,currentY+3,field))return true;
            if(whiteKingChecker(currentX+4,currentY+4,field)&&betweenChecker21(currentX,currentY,currentX+4,currentY+4,field))return true;
            if(whiteKingChecker(currentX+5,currentY+5,field)&&betweenChecker21(currentX,currentY,currentX+5,currentY+5,field))return true;
            if(whiteKingChecker(currentX+6,currentY+6,field)&&betweenChecker21(currentX,currentY,currentX+6,currentY+6,field))return true;
            if(whiteKingChecker(currentX+7,currentY+7,field)&&betweenChecker21(currentX,currentY,currentX+7,currentY+7,field))return true;
//====
            if(whiteKingChecker(currentX,currentY-1,field)&&betweenChecker12(currentX,currentY,currentX,currentY-1,field))return true;
            if(whiteKingChecker(currentX,currentY-2,field)&&betweenChecker12(currentX,currentY,currentX,currentY-2,field))return true;
            if(whiteKingChecker(currentX,currentY-3,field)&&betweenChecker12(currentX,currentY,currentX,currentY-3,field))return true;
            if(whiteKingChecker(currentX,currentY-4,field)&&betweenChecker12(currentX,currentY,currentX,currentY-4,field))return true;
            if(whiteKingChecker(currentX,currentY-5,field)&&betweenChecker12(currentX,currentY,currentX,currentY-5,field))return true;
            if(whiteKingChecker(currentX,currentY-6,field)&&betweenChecker12(currentX,currentY,currentX,currentY-6,field))return true;
            if(whiteKingChecker(currentX,currentY-7,field)&&betweenChecker12(currentX,currentY,currentX,currentY-7,field))return true;

            if(whiteKingChecker(currentX-1,currentY-1,field)&&betweenChecker22(currentX,currentY,currentX-1,currentY-1,field))return true;
            if(whiteKingChecker(currentX-2,currentY-2,field)&&betweenChecker22(currentX,currentY,currentX-2,currentY-2,field))return true;
            if(whiteKingChecker(currentX-3,currentY-3,field)&&betweenChecker22(currentX,currentY,currentX-3,currentY-3,field))return true;
            if(whiteKingChecker(currentX-4,currentY-4,field)&&betweenChecker22(currentX,currentY,currentX-4,currentY-4,field))return true;
            if(whiteKingChecker(currentX-5,currentY-5,field)&&betweenChecker22(currentX,currentY,currentX-5,currentY-5,field))return true;
            if(whiteKingChecker(currentX-6,currentY-6,field)&&betweenChecker22(currentX,currentY,currentX-6,currentY-6,field))return true;
            if(whiteKingChecker(currentX-7,currentY-7,field)&&betweenChecker22(currentX,currentY,currentX-7,currentY-7,field))return true;
//====
            if(whiteKingChecker(currentX+1,currentY,field)&&betweenChecker13(currentX,currentY,currentX+1,currentY,field))return true;
            if(whiteKingChecker(currentX+2,currentY,field)&&betweenChecker13(currentX,currentY,currentX+2,currentY,field))return true;
            if(whiteKingChecker(currentX+3,currentY,field)&&betweenChecker13(currentX,currentY,currentX+3,currentY,field))return true;
            if(whiteKingChecker(currentX+4,currentY,field)&&betweenChecker13(currentX,currentY,currentX+4,currentY,field))return true;
            if(whiteKingChecker(currentX+5,currentY,field)&&betweenChecker13(currentX,currentY,currentX+5,currentY,field))return true;
            if(whiteKingChecker(currentX+6,currentY,field)&&betweenChecker13(currentX,currentY,currentX+6,currentY,field))return true;
            if(whiteKingChecker(currentX+7,currentY,field)&&betweenChecker13(currentX,currentY,currentX+7,currentY,field))return true;


            if(whiteKingChecker(currentX+1,currentY-1,field)&&betweenChecker23(currentX,currentY,currentX+1,currentY-1,field))return true;
            if(whiteKingChecker(currentX+2,currentY-2,field)&&betweenChecker23(currentX,currentY,currentX+2,currentY-2,field))return true;
            if(whiteKingChecker(currentX+3,currentY-3,field)&&betweenChecker23(currentX,currentY,currentX+3,currentY-3,field))return true;
            if(whiteKingChecker(currentX+4,currentY-4,field)&&betweenChecker23(currentX,currentY,currentX+4,currentY-4,field))return true;
            if(whiteKingChecker(currentX+5,currentY-5,field)&&betweenChecker23(currentX,currentY,currentX+5,currentY-5,field))return true;
            if(whiteKingChecker(currentX+6,currentY-6,field)&&betweenChecker23(currentX,currentY,currentX+6,currentY-6,field))return true;
            if(whiteKingChecker(currentX+7,currentY-7,field)&&betweenChecker23(currentX,currentY,currentX+7,currentY-7,field))return true;

//====
            if(whiteKingChecker(currentX-1,currentY,field)&&betweenChecker14(currentX,currentY,currentX-1,currentY,field))return true;
            if(whiteKingChecker(currentX-2,currentY,field)&&betweenChecker14(currentX,currentY,currentX-2,currentY,field))return true;
            if(whiteKingChecker(currentX-3,currentY,field)&&betweenChecker14(currentX,currentY,currentX-3,currentY,field))return true;
            if(whiteKingChecker(currentX-4,currentY,field)&&betweenChecker14(currentX,currentY,currentX-4,currentY,field))return true;
            if(whiteKingChecker(currentX-5,currentY,field)&&betweenChecker14(currentX,currentY,currentX-5,currentY,field))return true;
            if(whiteKingChecker(currentX-6,currentY,field)&&betweenChecker14(currentX,currentY,currentX-6,currentY,field))return true;
            if(whiteKingChecker(currentX-7,currentY,field)&&betweenChecker14(currentX,currentY,currentX-7,currentY,field))return true;


            if(whiteKingChecker(currentX-1,currentY+1,field)&&betweenChecker24(currentX,currentY,currentX-1,currentY+1,field))return true;
            if(whiteKingChecker(currentX-2,currentY+2,field)&&betweenChecker24(currentX,currentY,currentX-2,currentY+2,field))return true;
            if(whiteKingChecker(currentX-3,currentY+3,field)&&betweenChecker24(currentX,currentY,currentX-3,currentY+3,field))return true;
            if(whiteKingChecker(currentX-4,currentY+4,field)&&betweenChecker24(currentX,currentY,currentX-4,currentY+4,field))return true;
            if(whiteKingChecker(currentX-5,currentY+5,field)&&betweenChecker24(currentX,currentY,currentX-5,currentY+5,field))return true;
            if(whiteKingChecker(currentX-6,currentY+6,field)&&betweenChecker24(currentX,currentY,currentX-6,currentY+6,field))return true;
            if(whiteKingChecker(currentX-7,currentY+7,field)&&betweenChecker24(currentX,currentY,currentX-7,currentY+7,field))return true;
        }


        return false;
    }













    private boolean betweenChecker11(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentY+i<=nextY-1;++i)
        {
            if(field[currentY+i][currentX].getPiece()!=null)return false;

        }
        return true;

    }
    private boolean betweenChecker12(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentY-i>=nextY+1;++i)
        {
            if(field[currentY-i][currentX].getPiece()!=null)return false;

        }
        return true;

    }
    private boolean betweenChecker13(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentX+i<=nextX-1;++i)
        {
            if(field[currentY][currentX+i].getPiece()!=null)return false;

        }
        return true;

    }
    private boolean betweenChecker14(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentX-i>=nextX+1;++i)
        {
            if(field[currentY][currentX-i].getPiece()!=null)return false;

        }
        return true;

    }
    private boolean betweenChecker21(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentX+i<=nextX-1&&currentY+i<=nextY-1;++i)
        {
            if(field[currentY+i][currentX+i].getPiece()!=null)return false;

        }
        return true;

    }
    private boolean betweenChecker22(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentX-i>=nextX+1&&currentY-i>=nextY+1;++i)
        {
            if(field[currentY-i][currentX-i].getPiece()!=null)return false;

        }
        return true;

    }
    private boolean betweenChecker23(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentX+i<=nextX-1&&currentY-i>=nextY+1;++i)
        {
            if(field[currentY-i][currentX+i].getPiece()!=null)return false;

        }
        return true;

    }
    private boolean betweenChecker24(int currentX,int currentY,int nextX,int nextY,Place field[][])
    {
        for(int i=1;currentX-i>=nextX+1&&currentY+i<=nextY-1;++i)
        {
            if(field[currentY+i][currentX-i].getPiece()!=null)return false;

        }
        return true;

    }











}
