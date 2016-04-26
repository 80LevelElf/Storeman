package MainForm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Managers.FormManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

import javax.swing.event.HyperlinkEvent;

public class MainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private MenuItem currentProductMenuItem;

    @FXML
    private MenuBar mainMenu;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private MenuItem productTypeMenuItem;

    @FXML
    private MenuItem settingsMenuItem;

    @FXML
    private MenuItem transactionHistoryMenuItem;

    @FXML
    void initialize() throws IOException {
        assert aboutMenuItem != null : "fx:id=\"aboutMenuItem\" was not injected: check your FXML file 'mainWindow.fxml'.";
        assert currentProductMenuItem != null : "fx:id=\"currentProductMenuItem\" was not injected: check your FXML file 'mainWindow.fxml'.";
        assert mainMenu != null : "fx:id=\"mainMenu\" was not injected: check your FXML file 'mainWindow.fxml'.";
        assert mainPane != null : "fx:id=\"mainPane\" was not injected: check your FXML file 'mainWindow.fxml'.";
        assert productTypeMenuItem != null : "fx:id=\"productTypeMenuItem\" was not injected: check your FXML file 'mainWindow.fxml'.";
        assert settingsMenuItem != null : "fx:id=\"settingsMenuItem\" was not injected: check your FXML file 'mainWindow.fxml'.";
        assert transactionHistoryMenuItem != null : "fx:id=\"transactionHistoryMenuItem\" was not injected: check your FXML file 'mainWindow.fxml'.";

        FormManager.setStartPanel(mainPane);

        currentProductMenuItem.setOnAction(event -> FormManager.setCurrentProductsPanel(mainPane));
    }
}