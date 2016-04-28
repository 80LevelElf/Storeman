package Forms.StartPanel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Rustam Salakhutdinov on 26.04.2016.
 */
public class StartPanelController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button aboutButton;

    @FXML
    private Button currentProductsButton;

    @FXML
    private Button helpButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button transactionHistoryButton;


    @FXML
    void initialize() {
        assert aboutButton != null : "fx:id=\"aboutButton\" was not injected: check your FXML file 'StartPanel.fxml'.";
        assert currentProductsButton != null : "fx:id=\"currentProductsButton\" was not injected: check your FXML file 'StartPanel.fxml'.";
        assert helpButton != null : "fx:id=\"helpButton\" was not injected: check your FXML file 'StartPanel.fxml'.";
        assert settingsButton != null : "fx:id=\"settingsButton\" was not injected: check your FXML file 'StartPanel.fxml'.";
        assert transactionHistoryButton != null : "fx:id=\"transactionHistoryButton\" was not injected: check your FXML file 'StartPanel.fxml'.";


    }
}
