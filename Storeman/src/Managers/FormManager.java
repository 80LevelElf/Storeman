package Managers;

import MainForm.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

/**
 * Created by Rustam Salakhutdinov on 03.04.2016.
 */
public final class FormManager {
    //Panels
    public final static void setCurrentProductsPanel(AnchorPane parent) throws IOException {
        prepareInlinePanel(parent, loadNode("/Components/CurrentProductsPanel/currentProductsPanel.fxml"));
    }

    //Windows
    public final static void showProductTypeEdit(Window owner) throws IOException {
        startModalWindow(owner, loadNode("/Forms/ProductTypeEdit/ProductTypeEdit.fxml"));
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

    private final static Parent loadNode(String fxmlFilePath) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource(fxmlFilePath));
        return  (Parent) loader.load();
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
