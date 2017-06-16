package service;

import model.Basket;
import model.BasketItem;
import model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SEZER on 3.06.2017.
 */

@Service
public class BasketService {

    private Basket basket = new Basket();

    public void createBasket() {
        basket = new Basket();
    }

    public void printBasketDetail() {
        //TODO productName, quantity
        Product product = new Product();
        System.out.println(product.getName() + product.getPrice());
    }

    public void addProduct(Product product, Integer quantity){
        //TODO
        List<BasketItem> basketItems = new ArrayList<>();
        basketItems.add(new BasketItem(2,product));
        basketItems.add(new BasketItem(4,product));


    }

    public void removeProduct(Product product){
        //TODO
        //sepetten ilgili ürünü silmeli
        Product product1 = new Product();
        for(int i = 0; i<product1.getId(); i++)
        {
           if(product1.getId().equals(i))
           {
               List<Product> products = new ArrayList<>();
               products.remove(i);
           }
        }

    }

    public void incrementQuantity(Product product, Integer quantity){
        //TODO sepetteki itemin sayisi soylenen kadar artirilmali

         for(BasketItem basketItem1 : basket.getItems())
         {
             if(basket.getItems().equals(quantity))
             {
                 quantity++;

             }

         }





    }

    public void decrementQuantity(Product product, Integer quantity){
        //TODO sepetteki itemin sayisi soylenen kadar azaltilmali
        //0 ise sepetten cikartilmali
        for(BasketItem basketItem1 : basket.getItems())
        {
            if(basket.getItems().equals(quantity))
            {
                quantity--;

            }
            else if(basket.getItems().equals(0))
            {
                removeProduct(product);
            }

        }
    }

    public Basket getBasket() {
        return basket;
    }

    public Integer getBasketPrice() {
        //TODO  sepet tutarini donmeli
        Product product = new Product();
        product.getPrice();


        return 0;
    }

}
