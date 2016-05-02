package Model.Entities;

import Model.Abstract.AStorable;

/**
 * Created by Rustam Salakhutdinov on 02.04.2016.
 */
public class ProductType extends AStorable {
    private String name;
    private String measureUnits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasureUnits() {
        return measureUnits;
    }

    public void setMeasureUnits(String measureUnits) {
        this.measureUnits = measureUnits;
    }
}
