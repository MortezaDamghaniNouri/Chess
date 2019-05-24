import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListeners implements ActionListener
{
    private JButton arrayOfButtons[][];
    public static int firstButtonRow,firstButtonColumn,secondButtonRow,secondButtonColumn;
    private int numberOfClicks;
    private boolean situation;
    public MyListeners(JButton arrayOfButtons[][])
    {
        this.arrayOfButtons=arrayOfButtons;
        numberOfClicks=0;
        situation=false;

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("in");

        ++numberOfClicks;
        System.out.println(numberOfClicks);
        situation=false;
        if(numberOfClicks==1)
        {
            for(int i=1;i<=8;++i)
            {
                for(int j=1;j<=8;++j)
                {

                    if((e.getSource())==(arrayOfButtons[i][j]))
                    {
                        System.out.println("first received.");
                        firstButtonRow=i;
                        firstButtonColumn=j;
                        break;

                    }

                }
            }




        }
        if(numberOfClicks==2)
        {
            for(int i=1;i<=8;++i)
            {
                for(int j=1;j<=8;++j)
                {

                    if((e.getSource())==(arrayOfButtons[i][j]))
                    {
                        System.out.println("second received.");
                        secondButtonRow=i;
                        secondButtonColumn=j;
                        break;

                    }

                }
            }


            numberOfClicks=0;
            situation=true;
        }



    }
    public int getNumberOfClicks()
    {
        return numberOfClicks;
    }
    public boolean getSituation()
    {
        return situation;
    }

    public int getFirstButtonColumn() {
        return firstButtonColumn-1;
    }

    public int getFirstButtonRow() {
        return firstButtonRow-1;
    }

    public int getSecondButtonColumn() {
        return secondButtonColumn-1;
    }

    public int getSecondButtonRow() {
        return secondButtonRow-1;
    }




}