import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;

public class NewGraphic
{
 public NewGraphic()
 {
     JFrame mainFrame=new JFrame("CHESS");
     mainFrame.setSize(1650,680);
     mainFrame.setLayout(new BorderLayout());
     //***
     JButton butt1=new JButton("CENTER");
     JButton butt2_1=new JButton("A");
     JButton butt2_2=new JButton("B");
     JButton butt2_3=new JButton("C");
     //***
     JPanel panel1=new JPanel();
     JPanel panel2=new JPanel();
    mainFrame.add(panel2,BorderLayout.WEST);
    panel2.setLayout(new GridLayout(3,1));
    panel2.setPreferredSize(new Dimension(200,680));
    mainFrame.add(panel1,BorderLayout.CENTER);
    panel1.setPreferredSize(new Dimension(1400,1400));
    mainFrame.add(panel1,BorderLayout.CENTER);
    panel2.add(butt2_1);
    panel2.add(butt2_2);
    panel2.add(butt2_3);
    panel1.setLayout(new GridLayout(8,8));
     JButton mainButtons[][]=new JButton[9][9];
     for(int i=1;i<=8;++i)
     {

         for(int j=1;j<=8;++j)
         {
             mainButtons[i][j]=new JButton();
             //temp[i][j].addActionListener(new MyListener(temp));
             if(i%2==1)
             {

                 if(j%2==1)
                 {
                     mainButtons[i][j].setBackground(Color.white);
                 }
                 else
                 {
                     mainButtons[i][j].setBackground(Color.GRAY);
                 }
                 panel1.add(mainButtons[i][j]);

             }
             else
             {
                 if(j%2==1)
                 {
                     mainButtons[i][j].setBackground(Color.GRAY);

                 }
                 else
                 {
                     mainButtons[i][j].setBackground(Color.WHITE);
                 }
                 panel1.add(mainButtons[i][j]);


             }

         }
     }
     ImageIcon blackPawn=new ImageIcon("blackPawn.png");
     ImageIcon whitePawn=new ImageIcon("whitePawn.png");
     ImageIcon blackRook=new ImageIcon("blackRook.png");
     ImageIcon whiteRook=new ImageIcon("whiteRook.png");
     ImageIcon blackKnight=new ImageIcon("blackKnight.png");
     ImageIcon whiteKnight=new ImageIcon("whiteKnight.png");
     ImageIcon blackBishop=new ImageIcon("blackBishop.png");
     ImageIcon whiteBishop=new ImageIcon("whiteBishop.png");
     ImageIcon blackKing=new ImageIcon("blackKing.png");
     ImageIcon whiteKing=new ImageIcon("whiteKing.png");
     ImageIcon blackQueen=new ImageIcon("blackQueen.png");
     ImageIcon whiteQueen=new ImageIcon("whiteQueen.png");
     for(int i=1;i<=8;++i)
     {
         mainButtons[2][i].setIcon(blackPawn);

     }
     for(int i=1;i<=8;++i)
     {
         mainButtons[7][i].setIcon(whitePawn);

     }
     mainButtons[8][1].setIcon(whiteRook);
     mainButtons[8][8].setIcon(whiteRook);
     mainButtons[8][2].setIcon(whiteKnight);
     mainButtons[8][7].setIcon(whiteKnight);
     mainButtons[8][3].setIcon(whiteBishop);
     mainButtons[8][6].setIcon(whiteBishop);
     mainButtons[8][4].setIcon(whiteQueen);
     mainButtons[8][5].setIcon(whiteKing);
     mainButtons[1][1].setIcon(blackRook);
     mainButtons[1][8].setIcon(blackRook);
     mainButtons[1][2].setIcon(blackKnight);
     mainButtons[1][7].setIcon(blackKnight);
     mainButtons[1][3].setIcon(blackBishop);
     mainButtons[1][6].setIcon(blackBishop);
     mainButtons[1][4].setIcon(blackQueen);
     mainButtons[1][5].setIcon(blackKing);



















     mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     mainFrame.setVisible(true);
 }















}
