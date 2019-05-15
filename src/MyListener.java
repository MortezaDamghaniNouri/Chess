import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener
{
    private JButton field[][];
    private int row;
    private int column;

    public MyListener(JButton input[][])
    {
        field=input;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ((JButton)e.getSource()).setBackground(Color.LIGHT_GRAY);
        for(int i=1;i<=8;++i)
        {
            for(int j=1;j<=8;++j)
            {
                if((e.getSource()).equals(field[i][j]))
                {
                    row=i;
                    column=j;
                    break;
                }
            }

        }
        for(int i=1;i<=8;++i)
        {
            field[i][column].setBackground(Color.LIGHT_GRAY);
        }




    }











}
