package Forms.ProductType;

import DAL.Testing.Products.TestProductRepository;
import DAL.Testing.Products.TestProductTypeRepository;
import Model.Entities.ProductType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringJoiner;

/**
 * Created by Rustam on 28.04.2016.
 */
public class ProductTypeListPanelController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TitledPane productTypesTitlesPane;

    @FXML
    private Button deleteButton;

    @FXML
    private Button editButton;

    @FXML
    private Button addButton;

    @FXML
    private TableColumn<ProductType, String> measureUnitsColumn;

    @FXML
    private TableColumn<ProductType, String> nameColumn;

    @FXML
    private TableView<ProductType> tableView;

    @FXML
    void initialize() {
        assert productTypesTitlesPane != null : "fx:id=\"productTypesTitlesPane\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";
        assert nameColumn != null : "fx:id=\"nameColumn\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";
        assert editButton != null : "fx:id=\"editButton\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";
        assert measureUnitsColumn != null : "fx:id=\"measureUnitsColumn\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";

        TestProductTypeRepository repository = new TestProductTypeRepository();
        tableView.setItems(FXCollections.observableList(repository.GetList()));

        measureUnitsColumn.setCellValueFactory(new PropertyValueFactory<>("measureUnits"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    }
}
