package hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;

public class KevinsController {

    @FXML
    private Region changeMe;

    @FXML
    private Button coolButton;

    @FXML
    private void action(ActionEvent event) {
        int r = (int) (Math.random() * 255 + 1);
        int g = (int) (Math.random() * 255 + 1);
        int b = (int) (Math.random() * 255 + 1);
        changeMe.setStyle("-fx-background-color: RGB(" + r + "," + g + "," + b + ");");
    }

    @FXML
    private void hover() {
        coolButton.setStyle("-fx-background-color: RGB(70,210,210);");  // Change color on hover
    }

    @FXML
    private void leave() {
        coolButton.setStyle("-fx-background-color: RGB(20,170,170);");  // Change back to original color
    }
}