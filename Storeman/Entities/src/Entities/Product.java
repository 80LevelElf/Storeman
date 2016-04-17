package Entities;

import Entities.Abstract.AStorable;

import java.util.Currency;

/**
 * Created by Rustam Salakhutdinov on 02.04.2016.
 */
public class Product extends AStorable {
    private ProductType productType;
    private double count;
    private double price;
    private String name;

    public Product(long id)
    {
        super(id);
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return price * count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
