import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlaceViewActionListener implements ActionListener {
    ChessController chessController;
    public PlaceViewActionListener(ChessController chessController){
        this.chessController=chessController;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("dawd");
        PlaceView thePlaceView=(PlaceView)e.getSource();
    }
}
