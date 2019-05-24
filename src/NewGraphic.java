import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.MouseListener;

public class NewGraphic {
    private JFrame mainFrame;
    private JButton butt1, butt2_1, butt2_2, butt2_3, mainButtons[][], blackSideButtons[][], whiteSideButtons[][];
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
        panel2.setPreferredSize(new Dimension(400, 680));
        mainFrame.add(panel1, BorderLayout.CENTER);
        panel1.setPreferredSize(new Dimension(1400, 1400));
        mainFrame.add(panel1, BorderLayout.CENTER);

        panel1.setLayout(new GridLayout(8, 8));
        mainButtons = new JButton[9][9];
        mainListener = new MyListeners(mainButtons);
        for (int i = 1; i <= 8; ++i) {

            for (int j = 1; j <= 8; ++j) {
                mainButtons[i][j] = new JButton();
                mainButtons[i][j].addActionListener(mainListener);
                if (i % 2 == 1) {

                    if (j % 2 == 1) {
                        mainButtons[i][j].setBackground(Color.white);
                    } else {
                        mainButtons[i][j].setBackground(new Color(113, 51, 1));
                    }
                    panel1.add(mainButtons[i][j]);

                } else {
                    if (j % 2 == 1) {
                        mainButtons[i][j].setBackground(new Color(113, 51, 1));

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
        //*****(adding side panels.)
        JPanel panel2_1 = new JPanel();
        JPanel panel2_2 = new JPanel();
        JPanel panel2_3 = new JPanel();
        panel2.add(panel2_1);
        panel2.add(panel2_2);
        panel2.add(panel2_3);
        panel2_1.setLayout(new GridLayout(2, 8));
        blackSideButtons = new JButton[3][9];

        for (int i = 1; i <= 2; ++i) {
            JButton temp;
            for (int j = 1; j <= 8; ++j) {
                temp = new JButton();
                temp.setBackground(new Color(8, 92, 6));
                blackSideButtons[i][j]=temp;
                panel2_1.add(temp);

            }


        }

        panel2_2.add(butt2_2);

        panel2_3.setLayout(new GridLayout(2, 8));
        whiteSideButtons = new JButton[3][9];

        for (int i = 1; i <= 2; ++i) {
            JButton temp;
            for (int j = 1; j <= 8; ++j) {
                temp = new JButton();
                temp.setBackground(new Color(8, 92, 6));
                whiteSideButtons[i][j]=temp;
                panel2_3.add(temp);

            }


        }
        ImageIcon newBlackPawn = newSetSize("blackPawn.png");
        ImageIcon newWhitePawn = newSetSize("whitePawn.png");
        ImageIcon newBlackRook = newSetSize("blackRook.png");
        ImageIcon newWhiteRook = newSetSize("whiteRook.png");
        ImageIcon newBlackKnight = newSetSize("blackKnight.png");
        ImageIcon newWhiteKnight = newSetSize("whiteKnight.png");
        ImageIcon newBlackBishop = newSetSize("blackBishop.png");
        ImageIcon newWhiteBishop = newSetSize("whiteBishop.png");
        ImageIcon newBlackKing = newSetSize("blackKing.png");
        ImageIcon newWhiteKing = newSetSize("whiteKing.png");
        ImageIcon newBlackQueen = newSetSize("blackQueen.png");
        ImageIcon newWhiteQueen = newSetSize("whiteQueen.png");

        for (int i = 1; i <= 8; ++i) {
            blackSideButtons[2][i].setIcon(newBlackPawn);

        }
        for (int i = 1; i <= 8; ++i) {
            whiteSideButtons[1][i].setIcon(newWhitePawn);

        }
        whiteSideButtons[2][1].setIcon(newWhiteRook);
        whiteSideButtons[2][8].setIcon(newWhiteRook);
        whiteSideButtons[2][2].setIcon(newWhiteKnight);
        whiteSideButtons[2][7].setIcon(newWhiteKnight);
        whiteSideButtons[2][3].setIcon(newWhiteBishop);
        whiteSideButtons[2][6].setIcon(newWhiteBishop);
        whiteSideButtons[2][4].setIcon(newWhiteQueen);
        whiteSideButtons[2][5].setIcon(newWhiteKing);

        blackSideButtons[1][1].setIcon(newBlackRook);
        blackSideButtons[1][8].setIcon(newBlackRook);
        blackSideButtons[1][2].setIcon(newBlackKnight);
        blackSideButtons[1][7].setIcon(newBlackKnight);
        blackSideButtons[1][3].setIcon(newBlackBishop);
        blackSideButtons[1][6].setIcon(newBlackBishop);
        blackSideButtons[1][4].setIcon(newBlackQueen);
        blackSideButtons[1][5].setIcon(newBlackKing);







        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }


    public void setTurn(String color) {
        butt2_2.setText(color);
    }

    public MyListeners getMainListener() {
        return mainListener;
    }

    public JButton[][] getMainButtons() {
        return mainButtons;
    }

    public JButton[][] getBlackSideButtons() {
        return blackSideButtons;
    }

    public JButton[][] getWhiteSideButtons() {

        return whiteSideButtons;
    }

    public ImageIcon setSize(String name) {
        ImageIcon output = new ImageIcon(name);
        Image newImage = output.getImage();
        Image newimg = newImage.getScaledInstance(60, 55, Image.SCALE_SMOOTH);
        output = new ImageIcon(newimg);
        return output;
    }
    public ImageIcon newSetSize(String name) {
        ImageIcon output = new ImageIcon(name);
        Image newImage = output.getImage();
        Image newimg = newImage.getScaledInstance(40, 50, Image.SCALE_SMOOTH);
        output = new ImageIcon(newimg);
        return output;
    }






}
