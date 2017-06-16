package model;

/**
 * Created by SEZER on 3.06.2017.
 */
import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<BasketItem> items = new ArrayList<>();

    public void addItem(BasketItem item) {
        items.add(item);
    }

    public List<BasketItem> getItems() {
        return items;
    }

    public Integer calculateBasketPrice() {

        //TODO
        Product product = new Product();
        BasketItem basketItem = new BasketItem(2, product);

        int hesap = product.getPrice() * basketItem.getQuantity();
        System.out.print("Calculate" + hesap);



        return 0;
    }
}