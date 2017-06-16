package com.example.Sezer;

/**
 * Created by SEZER on 3.06.2017.
 */
import org.junit.Test;

public class MedipolBasketRestControllerTest {

    @Test
    public void shouldAddProductToBasket() throws Exception {

        final MedipolBasketRestController controller = new MedipolBasketRestController();

        controller.addToBasket(1, 1);

    }
}