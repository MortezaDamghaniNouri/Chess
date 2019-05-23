import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.MouseListener;

public class NewGraphic {
    private JFrame mainFrame;
    private JButton butt1, butt2_1, butt2_2, butt2_3,mainButtons[][];
    private JPanel panel1, panel2;
    MyListeners mainListener;

    public NewGraphic() {
        mainFrame = new JFrame("CHESS");
        mainFrame.setSize(1650, 680);
        mainFrame.setLayout(new BorderLayout());
        //***
        butt1 = new JButton("CENTER");
        butt2_1 = new JButton("A");
        butt2_2 = new JButton("white");
        butt2_3 = new JButton("C");
        //***
        panel1 = new JPanel();
        panel2 = new JPanel();
        mainFrame.add(panel2, BorderLayout.WEST);
        panel2.setLayout(new GridLayout(3, 1));
        panel2.setPreferredSize(new Dimension(200, 680));
        mainFrame.add(panel1, BorderLayout.CENTER);
        panel1.setPreferredSize(new Dimension(1400, 1400));
        mainFrame.add(panel1, BorderLayout.CENTER);
        panel2.add(butt2_1);
        panel2.add(butt2_2);
        panel2.add(butt2_3);
        panel1.setLayout(new GridLayout(8, 8));
        mainButtons= new JButton[9][9];
        mainListener=new MyListeners(mainButtons);
        for (int i = 1; i <= 8; ++i) {

            for (int j = 1; j <= 8; ++j) {
                mainButtons[i][j] = new JButton();
                mainButtons[i][j].addActionListener(mainListener);
                if (i % 2 == 1) {

                    if (j % 2 == 1) {
                        mainButtons[i][j].setBackground(Color.white);
                    } else {
                        mainButtons[i][j].setBackground(Color.GRAY);
                    }
                    panel1.add(mainButtons[i][j]);

                } else {
                    if (j % 2 == 1) {
                        mainButtons[i][j].setBackground(Color.GRAY);

                    } else {
                        mainButtons[i][j].setBackground(Color.WHITE);
                    }
                    panel1.add(mainButtons[i][j]);


                }

            }
        }
        ImageIcon blackPawn = setSize("blackPawn.png");
        ImageIcon whitePawn = setSize("whitePawn.png");
        ImageIcon blackRook = setSize("blackRook.png");
        ImageIcon whiteRook = setSize("whiteRook.png");
        ImageIcon blackKnight = setSize("blackKnight.png");
        ImageIcon whiteKnight = setSize("whiteKnight.png");
        ImageIcon blackBishop = setSize("blackBishop.png");
        ImageIcon whiteBishop = setSize("whiteBishop.png");
        ImageIcon blackKing = setSize("blackKing.png");
        ImageIcon whiteKing = setSize("whiteKing.png");
        ImageIcon blackQueen = setSize("blackQueen.png");
        ImageIcon whiteQueen = setSize("whiteQueen.png");
        for (int i = 1; i <= 8; ++i) {
            mainButtons[2][i].setIcon(blackPawn);

        }
        for (int i = 1; i <= 8; ++i) {
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
    public void setTurn(String color)
    {
        butt2_2.setText(color);
    }
    public MyListeners getMainListener()
    {
        return mainListener;
    }
    public JButton[][] getMainButtons()
    {
        return mainButtons;
    }
    public ImageIcon setSize(String name)
    {
        ImageIcon output=new ImageIcon(name);
        Image newImage=output.getImage();
        Image newimg=newImage.getScaledInstance(80,60, Image.SCALE_SMOOTH);
        output=new ImageIcon(newimg);
        return output;
    }






}
