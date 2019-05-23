import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyListener implements ActionListener, MouseListener
{
    private JButton field[][];
    private int firstClickRow;
    private int firstClickColumn;
    private int secondClickRow;
    private int secondClickColumn;
    private int numberOfClicks;

    public MyListener(JButton input[][])
    {

        field=input;
        numberOfClicks=0;

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //((JButton)e.getSource()).setBackground(Color.LIGHT_GRAY);
        if(numberOfClicks==1)
        {
            for(int i=1;i<=8;++i)
            {
                for(int j=1;j<=8;++j)
                {
                    if((e.getSource()).equals(field[i][j]))
                    {   secondClickRow=i;
                        secondClickColumn=j;
                        break;
                    }
                }

            }




            numberOfClicks=0;
            firstClickRow=0;
            firstClickColumn=0;
            secondClickRow=0;
            secondClickColumn=0;
        }
        if(numberOfClicks==0)
        {
            for(int i=1;i<=8;++i)
            {
                for(int j=1;j<=8;++j)
                {
                    if((e.getSource()).equals(field[i][j]))
                    {   firstClickRow=i;
                        firstClickColumn=j;
                        break;
                    }
                }

            }
            ++numberOfClicks;


        }



        System.out.println(firstClickRow+"\n"+firstClickColumn);
        /*for(int i=1;i<=8;++i)
        {
            field[i][column].setBackground(Color.LIGHT_GRAY);
        }*/
        field[8][8].setBackground(Color.BLUE);







    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
