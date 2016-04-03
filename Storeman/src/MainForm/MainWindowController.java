package MainForm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Managers.FormManager;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuBar mainMenu;

    @FXML
    private AnchorPane mainPane;

    @FXML
    void initialize() throws IOException {
        assert mainMenu != null : "fx:id=\"mainMenu\" was not injected: check your FXML file 'mainWindow.fxml'.";
        assert mainPane != null : "fx:id=\"mainPane\" was not injected: check your FXML file 'mainWindow.fxml'.";

        FormManager.setCurrentProductsPanel(mainPane);
    }
}