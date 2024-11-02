package hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;



public class Controller {

    @FXML

    private AnchorPane anchorPane;

    public void usefulButtonIsPressed(ActionEvent e) {
        System.out.println("Nice, you pressed this button!");
    }
}