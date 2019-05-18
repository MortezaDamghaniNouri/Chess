import javax.swing.*;
import java.awt.*;

public class Graphic
{
    private JFrame mainFrame;
    public Graphic()
    {

        mainFrame =new JFrame("CHESS");
        mainFrame.setSize(1650,680);

        mainFrame.setLayout(new BorderLayout());
        JButton butt1=new JButton("TOP");
        //JButton butt2=new JButton("RIGHT");
        JPanel right=new JPanel(new GridLayout(8,8));
        JButton butt3=new JButton("LEFT");
        JButton butt3_1=new JButton("LEFT TOP");
        JButton butt3_2=new JButton("LEFT MIDDLE");
        JButton butt3_3=new JButton("LEFT DOWN");
        mainFrame.getContentPane().add(butt1,BorderLayout.PAGE_START);
        mainFrame.getContentPane().add(right,BorderLayout.CENTER);
        //mainFrame.getContentPane().add(butt3,BorderLayout.LINE_START);
        butt3.setPreferredSize(new Dimension(200,50));
        JPanel leftPanel=new JPanel(new GridLayout(3,1));
        leftPanel.add(butt3_1);
        leftPanel.add(butt3_2);
        leftPanel.add(butt3_3);
        mainFrame.getContentPane().add(leftPanel,BorderLayout.LINE_START);
        JButton temp[][]=new JButton[9][9];
        for(int i=1;i<=8;++i)
        {

           for(int j=1;j<=8;++j)
           {
               temp[i][j]=new JButton();
               temp[i][j].addActionListener(new MyListener(temp));
               if(i%2==1)
               {

                   if(j%2==1)
                   {
                       temp[i][j].setBackground(Color.WHITE);
                   }
                   else
                   {
                       temp[i][j].setBackground(Color.BLACK);
                   }
                   right.add(temp[i][j]);

               }
               else
               {
                   if(j%2==1)
                   {
                       temp[i][j].setBackground(Color.BLACK);

                   }
                   else
                   {
                       temp[i][j].setBackground(Color.WHITE);
                   }
                   right.add(temp[i][j]);


               }

                   }
         }






    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setVisible(true);
    }







}
