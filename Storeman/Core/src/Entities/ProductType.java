package Entities;

import Entities.Abstract.AStorable;

/**
 * Created by Rustam Salakhutdinov on 02.04.2016.
 */
public class ProductType extends AStorable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
