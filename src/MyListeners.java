import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class MyListeners implements ActionListener
{
    private JButton arrayOfButtons[][];
    public static int firstButtonRow,firstButtonColumn,secondButtonRow,secondButtonColumn;
    private int numberOfClicks=0;
    public MyListeners(JButton arrayOfButtons[][])
    {
        this.arrayOfButtons=arrayOfButtons;



    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++numberOfClicks;
        if(numberOfClicks==1)
        {
            for(int i=1;i<=8;++i)
            {
                for(int j=1;j<=8;++j)
                {

                    if((e.getSource())==(arrayOfButtons[i][j]))
                    {
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
                        secondButtonRow=i;
                        secondButtonColumn=j;
                        break;

                    }

                }
            }


            numberOfClicks=0;
        }



    }
    public int getNumberOfClicks()
    {
        return numberOfClicks;
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