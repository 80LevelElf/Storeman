package Managers;

import MainForm.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * Created by Rustam Salakhutdinov on 03.04.2016.
 */
public final class FormManager {
    //Panels
    public final static void setCurrentProductsPanel(AnchorPane parent) throws IOException {
        fillParentAnchorPaneBy(parent, importNode("/Components/CurrentProductsPanel/currentProductsPanel.fxml"));
    }

    private final static Node importNode(String fxmlFilePath) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource(fxmlFilePath));
        System.out.println(loader.getLocation());
        return  (Node) loader.load();
    }

    private final static void fillParentAnchorPaneBy(AnchorPane parent, Node node)
    {
        parent.getChildren().removeAll();
        parent.getChildren().add(node);
        parent.setRightAnchor(node, 0.0);
        parent.setBottomAnchor(node, 0.0);
        parent.setLeftAnchor(node, 0.0);
        parent.setTopAnchor(node, 0.0);
    }
}
