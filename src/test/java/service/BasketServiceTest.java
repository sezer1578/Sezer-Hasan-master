package service;

/**
 * Created by SEZER on 3.06.2017.
 */
import model.Basket;
import model.BasketItem;
import model.Product;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BasketServiceTest {

    @Test
    public void shouldCreateBasket() throws Exception {
        //TODO
        final  BasketService basketService = new BasketService();
         basketService.createBasket();
         assertTrue(basketService.getBasket().equals(null));


    }

    @Test
    public void shouldAddProductWithOneQuantity() throws Exception {
        //TODO
        final BasketService basketService = new BasketService();
        final Product product = new Product(1,"adidas",300);
        basketService.addProduct(product,1);
        assertTrue(basketService.getBasket().equals(product));
    }

    @Test
    public void shouldAddProductWithTwoQuantity() throws Exception {
        //TODO
        final BasketService basketService = new BasketService();
        final Product product = new Product(1,"adidas",300);
        basketService.addProduct(product,2);
        assertTrue(basketService.getBasket().equals(product));
    }

    @Test
    public void shouldAddMultipleProduct() throws Exception {
        //TODO
        final BasketService basketService = new BasketService();
        final Product product = new Product(1,"nike",250);
        final Product product1 = new Product(2,"puma",150);

        basketService.addProduct(product,1);
        basketService.addProduct(product1,1);

        assertThat(basketService.getBasket().getItems().size(),Matchers.equalTo(400));



    }

    @Test
    public void shouldRemoveProduct() throws Exception {
        //TODO
        //sepetten urunu sildi mi
        final BasketService basketService = new BasketService();
        final Product product = new Product(1,"Spalding",400);

        basketService.removeProduct(product);

        assertThat(basketService.getBasket().getItems().size(),Matchers.equalTo(product));
    }

    @Test
    public void shouldIncrementBasketItemQuantity() throws Exception {
        //TODO
        final  BasketService basketService = new BasketService();
        final  Product product = new Product(1,"Jordon",500);
        basketService.incrementQuantity(product,5);

        assertThat(basketService.getBasket().getItems().size(),Matchers.equalTo(product));


    }

    @Test
    public void shouldDecrementBasketItemQuantity() throws Exception {
        //TODO
        final  BasketService basketService = new BasketService();
        final  Product product = new Product(1,"Polo",150);
        basketService.decrementQuantity(product,5);
        assertThat(basketService.getBasket().getItems().size(),Matchers.equalTo(product));


    }

    @Test
    public void shouldDecrementBasketItemQuantityAndRemoveWhenQuantityZero() throws Exception {
        //TODO
        final Basket basket = new Basket();
        final  BasketService basketService = new BasketService();
        final  Product product = new Product(1,"Polo",150);
        basketService.decrementQuantity(product,5);
        assertThat(basket.getItems().size(),Matchers.equalTo(null));
        assertThat(basketService.getBasket().getItems().size(),Matchers.equalTo(product));
    }

    @Test
    public void shouldPriceBeZeroWhenBasketIsEmpty() throws Exception {
        //TODO sepet bosken total 0 olmalı
        final Basket basket = new Basket();
        final  BasketService basketService = new BasketService();
        final  Product product = new Product(1,"Polo",150);
        basketService.decrementQuantity(product,5);
        assertThat(basket.getItems().size(),Matchers.equalTo(null));
        assertThat(product.getPrice(),Matchers.equalTo(0));
        assertThat(basketService.getBasket().getItems().size(),Matchers.equalTo(product));

    }

    @Test
    public void shouldCalculateOneProductPrice() throws Exception {
        //TODO sepette 1 urun varken price hesaplanmali
        final Basket basket = new Basket();
        final  BasketService basketService = new BasketService();
        final  Product product = new Product(1,"Polo",150);
        basketService.addProduct(product,1);
        assertTrue(basketService.getBasketPrice().equals(product.getPrice()));

    }

    @Test
    public void shouldCalculateMultipleProductPrice() throws Exception {
        //TODO sepette coklu urun varken price hesaplanmali
        final Basket basket = new Basket();
        final  BasketService basketService = new BasketService();
        final  Product product = new Product(1,"Polo",150);
        final  Product product1 = new Product(2,"Jack Jones",200);
        basketService.addProduct(product,1);
        basketService.addProduct(product1,1);
        assertTrue(basketService.getBasketPrice().equals(product.getPrice()));
    }

    @Test
    public void shouldCalculateOneProductPriceAfterIncrement() throws Exception {
        //TODO sepette 1 urun varken sayisi arttirildiginda price hesaplanmali
        final Basket basket = new Basket();
        final  BasketService basketService = new BasketService();
        final  Product product = new Product(1,"Polo",150);
        basketService.addProduct(product,1);
        basketService.incrementQuantity(product,5);
        assertTrue(basketService.getBasketPrice().equals(product.getPrice()));
    }

    @Test
    public void shouldCalculateOneProductPriceAfterDecrement() throws Exception {
        //TODO sepette 1 urun varken sayisi azaltildiginda price hesaplanmali
        final Basket basket = new Basket();
        final  BasketService basketService = new BasketService();
        final  Product product = new Product(1,"Polo",150);
        basketService.addProduct(product,1);
        basketService.decrementQuantity(product,5);
        assertTrue(basketService.getBasketPrice().equals(product.getPrice()));


    }

    @Test
    public void shouldCalculatePriceWithMultipleProductAndOneQuantityIncrementOperation() throws Exception {
        //TODO sepette coklu urun varken ve bir sayi arttirma isleminden sonra price hesaplanmali
        final Basket basket = new Basket();
        final  BasketService basketService = new BasketService();
        final  Product product = new Product(1,"Polo",150);
        final  Product product1 = new Product(2,"Jack Jones",200);
        basketService.addProduct(product,1);
        basketService.addProduct(product1,1);
        basketService.incrementQuantity(product,1);
        assertTrue(basketService.getBasketPrice().equals(product.getPrice()));


    }

    @Test
    public void shouldCalculatePriceWithMultipleProductAndOneQuantityDecrementOperation() throws Exception {
        //TODO sepette coklu urun varken ve bir sayi azaltma isleminden sonra price hesaplanmali
        final Basket basket = new Basket();
        final  BasketService basketService = new BasketService();
        final  Product product = new Product(1,"Polo",150);
        final  Product product1 = new Product(2,"Jack Jones",200);
        basketService.addProduct(product,1);
        basketService.addProduct(product1,1);
        basketService.decrementQuantity(product,1);
        assertTrue(basketService.getBasketPrice().equals(product.getPrice()));



    }


}