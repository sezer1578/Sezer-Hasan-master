package com.example.Sezer;

import model.Basket;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.BasketService;
import service.ProductService;

/**
 * Created by SEZER on 3.06.2017.
 */
@RequestMapping()//TODO
@RestController
public class MedipolBasketRestController {

    @Autowired private BasketService basketService;
    @Autowired private ProductService productService;

    @RequestMapping(path = "/addToBasket")
    public Basket addToBasket(@RequestParam int productId, @RequestParam int quantity) {

        Product product = productService.findBy(productId);
        basketService.addProduct(product, quantity);
        return basketService.getBasket();

    }


    //createBasket
    //getBasketDetail
    //addToBasket
    //removeProduct
    //incrementQuantity
    //decrementQuantity
    //getBasketPrice

}
