import javax.swing.*;
import java.awt.*;

public class NewGraphic {
    private PlaceView placeViews[][];
    public PlaceView[][] getPlaceViewList(){
        return placeViews;
    }
    public NewGraphic() {
        JFrame mainFrame = new JFrame("CHESS");
        mainFrame.setSize(1650, 680);
        mainFrame.setLayout(new BorderLayout());
        //***
        JButton butt1 = new JButton("CENTER");
        JButton butt2_1 = new JButton("A");
        JButton butt2_2 = new JButton("B");
        JButton butt2_3 = new JButton("C");
        //***
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
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
        placeViews = new PlaceView[8][8];
        for (int i = 0; i <= 7; ++i) {
            for (int j = 0; j <= 7; ++j) {
                placeViews[i][j] = new PlaceView();
                //temp[i][j].addActionListener(new MyListener(temp));
                if (i % 2 == 1) {
                    placeViews[i][j].setBackground(j % 2 == 1 ? Color.WHITE : Color.BLACK);
                    panel1.add(placeViews[i][j]);
                } else {
                    if (j % 2 == 1) {
                        placeViews[i][j].setBackground(Color.BLACK);

                    } else {
                        placeViews[i][j].setBackground(Color.WHITE);
                    }
                    panel1.add(placeViews[i][j]);
                }

            }
        }
    /*MyNewListener listener1=new MyNewListener(temp);
    for(int i=0;i<=7;++i)
    {
        for(int j=0;j<=7;++j)
        {
            temp[i][j].addActionListener(listener1);

        }
    }*/


        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
