package model;

/**
 * Created by SEZER on 3.06.2017.
 */
public class BasketItem {

    private int quantity;
    private Product product;

    public BasketItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Integer price() {
        //TODO

        return quantity * product.getPrice();
    }

}