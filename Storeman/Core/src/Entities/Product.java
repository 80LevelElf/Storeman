package Entities;

import Entities.Abstract.AStorable;

import java.util.Currency;

/**
 * Created by Rustam Salakhutdinov on 02.04.2016.
 */
public class Product extends AStorable {
    private ProductType productType;
    private int count;
    private Currency price;
    private double amount;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
