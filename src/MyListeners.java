import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListeners implements ActionListener {
    private JButton arrayOfButtons[][];
    /**
     * @param firstButtonRow    it is an int variable which indicates the row of the first clicked button in graphical array.
     * @param firstButtonColumn    it is an int variable which indicates the column of the first clicked button in graphical array.
     * @param secondButtonRow    it is an int variable which indicates the row of the second clicked button in graphical array.
     * @param secondButtonColumn    it is an int variable which indicates the column of the second clicked button in graphical array.
     */
    public static int firstButtonRow, firstButtonColumn, secondButtonRow, secondButtonColumn;
    private int numberOfClicks;
    private boolean situation;

    public MyListeners(JButton arrayOfButtons[][]) {
        this.arrayOfButtons = arrayOfButtons;
        numberOfClicks = 0;
        situation = false;

    }

    /**
     * it finds the the vector of the square of the graphical array for the first and second clicked buttons.
     *
     * @param e it contains data about the square of graphical frame which has been clicked.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("in");

        ++numberOfClicks;
        System.out.println(numberOfClicks);
        situation = false;
        if (numberOfClicks == 1) {
            for (int i = 1; i <= 8; ++i) {
                for (int j = 1; j <= 8; ++j) {

                    if ((e.getSource()) == (arrayOfButtons[i][j])) {
                        System.out.println("first received.");
                        firstButtonRow = i;
                        firstButtonColumn = j;
                        break;

                    }

                }
            }


        }
        if (numberOfClicks == 2) {
            for (int i = 1; i <= 8; ++i) {
                for (int j = 1; j <= 8; ++j) {

                    if ((e.getSource()) == (arrayOfButtons[i][j])) {
                        System.out.println("second received.");
                        secondButtonRow = i;
                        secondButtonColumn = j;
                        break;

                    }

                }
            }


            numberOfClicks = 0;
            situation = true;
        }


    }

    /**
     * @return it is a boolean variable which indicates the number of clicks.
     */
    public int getNumberOfClicks() {
        return numberOfClicks;
    }

    /**
     * it sets situation field.
     *
     * @param input an input to set situation field.
     */
    public void setSituation(boolean input) {
        situation = input;
    }

    /**
     * it returns situation field.
     *
     * @return situation field.
     */
    public boolean getSituation() {
        return situation;
    }

    /**
     * it returns the column of first clicked button.
     *
     * @return firstButtonColumn -1 .
     */

    public int getFirstButtonColumn() {
        return firstButtonColumn - 1;
    }

    /**
     * it returns the row of first clicked button.
     *
     * @return firstButtonRow -1 .
     */
    public int getFirstButtonRow() {
        return 8 - firstButtonRow;
    }

    /**
     * it returns the column of second clicked button.
     *
     * @return secondButtonColumn -1 .
     */
    public int getSecondButtonColumn() {
        return secondButtonColumn - 1;
    }

    /**
     * it returns the row of second clicked button.
     *
     * @return secondButtonRow -1 .
     */
    public int getSecondButtonRow() {
        return 8 - secondButtonRow;
    }


}