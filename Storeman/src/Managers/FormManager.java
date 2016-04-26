package Managers;

import MainForm.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * Created by Rustam Salakhutdinov on 03.04.2016.
 */
public final class FormManager {
    //Panels
    public final static void setCurrentProductsPanel(AnchorPane parent) {
        Parent parentNode = loadNode("/Panels/CurrentProductsPanel/CurrentProductsPanel.fxml");
        if (parentNode != null)
            prepareInlinePanel(parent, parentNode);
    }

    public final static void setStartPanel(AnchorPane parent) {
        Parent parentNode = loadNode("/Panels/StartPanel/startPanel.fxml");
        if (parentNode != null)
            prepareInlinePanel(parent, parentNode);
    }

    //Windows
    public final static void showProductTypeEdit(Window owner) {
        Parent parentNode = loadNode("/Forms/ProductTypeEdit/ProductTypeEdit.fxml");
        if (parentNode != null)
            startModalWindow(owner, parentNode);
    }

    public final static void startModalWindow(Window owner, Parent node)
    {
        Stage stage = new Stage();
        stage.setScene(new Scene(node));
        stage.setTitle("My modal window");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(owner);
        stage.setResizable(false);
        stage.show();
    }

    private final static Parent loadNode(String fxmlFilePath) {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource(fxmlFilePath));

        try {
            return  (Parent) loader.load();
        } catch (Exception e) {
            AlertManager.showError("Can't find form to load!", "Can't find form to load!",
                    "We can't find this form file: " + fxmlFilePath);
            return null;
        }
    }

    private final static void prepareInlinePanel(AnchorPane parent, Parent node)
    {
        parent.getChildren().removeAll();
        parent.getChildren().add(node);
        parent.setRightAnchor(node, 0.0);
        parent.setBottomAnchor(node, 0.0);
        parent.setLeftAnchor(node, 0.0);
        parent.setTopAnchor(node, 0.0);
    }
}
