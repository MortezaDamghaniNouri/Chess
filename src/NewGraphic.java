import javax.swing.*;
import java.awt.*;
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
     mainFrame.add(butt1,BorderLayout.CENTER);
     JPanel panel1=new JPanel();
     JPanel panel2=new JPanel();
    mainFrame.add(panel2,BorderLayout.WEST);
    panel2.setLayout(new GridLayout(3,1));
    panel2.setPreferredSize(new Dimension(200,680));
    mainFrame.add(panel1,BorderLayout.CENTER);
    panel1.setPreferredSize(new Dimension(1400,1400));
    panel1.add(butt1);
    panel2.add(butt2_1);
    panel2.add(butt2_2);
    panel2.add(butt2_3);



     mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     mainFrame.setVisible(true);
 }
}
