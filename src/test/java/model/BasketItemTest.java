package model;

/**
 * Created by SEZER on 3.06.2017.
 */
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BasketItemTest {

    @Test
    public void shouldCalculatePriceWhenQuantityIsOne() throws Exception {
        //TODO

        //create data

        final Product product = new Product(1, "jhk", 5);
        final BasketItem basketItem = new BasketItem(1, product);

        //action
        final Integer result = basketItem.price();

        //verify
        assertTrue(basketItem.getQuantity() == 1);
        assertTrue(result == 5);

    }

    @Test
    public void shouldCalculatePriceWhenQuantityIsThree() throws Exception {
        //TODO

        final Product product = new Product(1,"Spalding",100);
        final BasketItem basketItem = new BasketItem(3,product);

        final  Integer result = basketItem.price();

        assertTrue(basketItem.getQuantity() == 3);
        assertTrue(result == 300);
    }
}