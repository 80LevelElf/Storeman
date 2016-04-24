package Components.CurrentProductsPanel;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringJoiner;

import DAL.Testing.Products.TestProductRepository;
import Model.Entities.Product;
import Model.Entities.ProductType;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableStringValue;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class CurrentProductsPanelController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Product, String> amountColumn;

    @FXML
    private TableColumn<Product, String> countColumn;

    @FXML
    private TableColumn<Product, String> nameColumn;

    @FXML
    private TableColumn<Product, String> priceColumn;

    @FXML
    private TableColumn<Product, String> typeColumn;

    @FXML
    private TableView<Product> taleView;

    @FXML
    void initialize() {
        assert amountColumn != null : "fx:id=\"amountColumn\" was not injected: check your FXML file 'CurrentProductsPanel.fxml'.";
        assert countColumn != null : "fx:id=\"countColumn\" was not injected: check your FXML file 'CurrentProductsPanel.fxml'.";
        assert nameColumn != null : "fx:id=\"nameColumn\" was not injected: check your FXML file 'CurrentProductsPanel.fxml'.";
        assert priceColumn != null : "fx:id=\"priceColumn\" was not injected: check your FXML file 'CurrentProductsPanel.fxml'.";
        assert typeColumn != null : "fx:id=\"typeColumn\" was not injected: check your FXML file 'CurrentProductsPanel.fxml'.";
        assert taleView != null : "fx:id=\"taleView\" was not injected: check your FXML file 'CurrentProductsPanel.fxml'.";

        TestProductRepository repository = new TestProductRepository();
        taleView.setItems(FXCollections.observableList(repository.GetList()));

        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Type
        typeColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("productType")
        {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Product, String> param) {
                Product product = param.getValue();
                if (product != null && product.getProductType() != null)
                    return new SimpleStringProperty(product.getProductType().getName());

                return new SimpleStringProperty();
            }
        });

        //Count
        countColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("count")
        {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Product, String> param) {
                Product product = param.getValue();
                if (product != null)
                    if (product.getProductType() != null)
                    {
                        return new SimpleStringProperty(String.format("%s %s",
                                product.getCount(),
                                product.getProductType().getMeasureUnits()));
                    }
                else
                    {
                        return new SimpleStringProperty(Double.toString(product.getCount()));
                    }

                return new SimpleStringProperty();
            }
        });

        //Amount
        amountColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("amount")
        {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Product, String> param) {
                Product product = param.getValue();
                if (product != null)
                    if (product.getProductType() != null)
                    {
                        return new SimpleStringProperty(String.format("%s %s",
                                product.getAmount(),
                                product.getProductType().getMeasureUnits()));
                    }
                    else
                    {
                        return new SimpleStringProperty(Double.toString(product.getAmount()));
                    }

                return new SimpleStringProperty();
            }
        });
    }

}
