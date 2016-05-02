package ViewModel;

import Model.Entities.ProductType;
import ViewModel.Abstract.AViewItem;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Rustam on 02.05.2016.
 */
public class ProductTypeViewItem extends AViewItem<ProductType> {
    private SimpleStringProperty name = new SimpleStringProperty();
    private SimpleStringProperty measureUnits = new SimpleStringProperty();

    public ProductTypeViewItem(ProductType sourceObject) {
        super(sourceObject);
        map(sourceObject);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getMeasureUnits() {
        return measureUnits.get();
    }

    public SimpleStringProperty measureUnitsProperty() {
        return measureUnits;
    }

    public void setMeasureUnits(String measureUnits) {
        this.measureUnits.set(measureUnits);
    }
}
