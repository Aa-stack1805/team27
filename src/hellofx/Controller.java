package hellofx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Button usefulButton;

    @FXML
    private Button color;

    @FXML
    public void usefulButtonIsPressed(ActionEvent e) {
        System.out.println("Nice, you pressed this button!");
    }

    @FXML
    private void openColorChanger(ActionEvent event) {
        try {
            // Load the new FXML file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Kevin.fxml"));
            Parent newRoot = fxmlLoader.load();

            // Create a new stage
            Stage newStage = new Stage();
            newStage.setTitle("Color Changer");

            // Set the scene for the new stage
            Scene newScene = new Scene(newRoot);
            newStage.setScene(newScene);

            // Show the new stage
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}