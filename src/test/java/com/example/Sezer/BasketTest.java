package com.example.Sezer;

/**
 * Created by SEZER on 3.06.2017.
 */
import model.Basket;
import model.BasketItem;
import model.Product;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import service.ProductService;

import javax.validation.constraints.AssertTrue;

import java.util.regex.Matcher;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BasketTest {

    @Test
    public void shouldAddProductWithOneQuantity() throws Exception {

        final Basket basket = new Basket();
        final Product product = new Product(1, "nike air", 200);

        basket.addItem(new BasketItem(1, product));

        assertTrue(basket.getItems().size() == 1);
        assertTrue(basket.getItems().get(0).getProduct().equals(product));

    }

    @Test
    public void shouldAddProductWithTwoQuantity() throws Exception {

        //TODO

        final Basket basket = new Basket();
        final  Product product = new Product(1, "nike air", 250);

        basket.addItem(new BasketItem(2,product));

        assertTrue(basket.getItems().size()==2);
        assertTrue(basket.getItems().get(0).getProduct().equals(product));


    }

    @Test
    public void shouldAddTwoDifferentProduct() throws Exception {
        //TODO

       final Basket basket = new Basket();
       final Product product = new Product(1,"adidas",250);
       final Product product1 = new Product(2,"nike", 300);

       basket.addItem(new BasketItem(1,product));
       basket.addItem(new BasketItem(1,product1));

       assertTrue(basket.getItems().size() ==2);
       assertTrue(basket.getItems().get(0).getProduct().equals(product));
        assertTrue(basket.getItems().get(0).getProduct().equals(product1));



    }

    @Test
    public void shouldCalculateBasketPriceWithOneProductOneQuantity() throws Exception {

        //TODO

        final Basket basket = new Basket();
        final  Product product = new Product(1,"nike air",400);
        basket.addItem(new BasketItem(1,product));

        assertThat(basket.calculateBasketPrice(), Matchers.equalTo(400));


    }

    @Test
    public void shouldCalculateBasketPriceWithOneProductTwoQuantity() throws Exception {

        //TODO

        final Basket basket = new Basket();
        final  Product product = new Product(1,"nike air",400);
        basket.addItem(new BasketItem(2,product));

        assertThat(basket.calculateBasketPrice(), Matchers.equalTo(800));
    }

    @Test
    public void shouldCalculateBasketPriceWithMultipleProduct() throws Exception {
        //TODO
        final Basket basket = new Basket();
        final  Product product1 = new Product(1,"Spalding",150);
        final  Product product2 = new Product(2,"Jordan",300);

        basket.addItem(new BasketItem(1,product1));
        basket.addItem(new BasketItem(1,product2));

        assertThat(basket.calculateBasketPrice(),Matchers.equalTo(450));
    }

    @Test
    public void shouldUpdateBasketItemQuantity() throws Exception {
        //TODO
        final Basket basket = new Basket();

        final Product product = new Product(1,"Nike",250);

        basket.addItem(new BasketItem(1,product));

        //123123


    }

}
