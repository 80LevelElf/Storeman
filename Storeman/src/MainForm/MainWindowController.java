package MainForm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainWindowController {
    @FXML
    private Button myButton;

    @FXML
    private void initialize() {
        myButton.setText("It is my text!");
    }
}
