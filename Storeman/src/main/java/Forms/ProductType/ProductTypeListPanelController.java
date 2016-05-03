package Forms.ProductType;

import Core.Helpers.ViewModelHelper;
import DAL.Testing.Products.TestProductTypeRepository;
import ViewModel.ProductTypeViewItem;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

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
    private TableColumn<ProductTypeViewItem, String> measureUnitsColumn;

    @FXML
    private TableColumn<ProductTypeViewItem, String> nameColumn;

    @FXML
    private TableView<ProductTypeViewItem> tableView;

    @FXML
    void initialize() {
        assert productTypesTitlesPane != null : "fx:id=\"productTypesTitlesPane\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";
        assert nameColumn != null : "fx:id=\"nameColumn\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";
        assert editButton != null : "fx:id=\"editButton\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";
        assert measureUnitsColumn != null : "fx:id=\"measureUnitsColumn\" was not injected: check your FXML file 'ProductTypeListPanel.fxml'.";

        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        measureUnitsColumn.setCellValueFactory(new PropertyValueFactory<>("measureUnits"));
        measureUnitsColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        measureUnitsColumn.setOnEditCommit(t -> t.getTableView().getItems().get(
                        t.getTablePosition().getRow()).setMeasureUnits(t.getNewValue())
        );

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        nameColumn.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setName(t.getNewValue())
        );

        TestProductTypeRepository repository = new TestProductTypeRepository();
        tableView.setItems(ViewModelHelper.getProductTypeViewList(repository.GetList()));
    }
}
