package service;

/**
 * Created by SEZER on 3.06.2017.
 */
import model.Product;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.filter;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceTest {

    @Test
    public void shouldListInitialProducts() throws Exception {

        //TODO
        final ProductService productService = new ProductService();

        List<Product> products = (List<Product>) productService.findBy(1);
        assertThat(products.get(1));









    }

    @Test
    public void shouldAddOneProduct() throws Exception {
        //TODO
        final ProductService productService = new ProductService();

        final String newUserName = "userNmae";
        final Integer price = Integer.valueOf("price");

        productService.add(newUserName,price);

        final List<Product> response = productService.add(newUserName,price);
        assertThat(response.size());
        assertThat(response.get(0).getName());
        assertThat(response.get(0).getPrice());


    }

    @Test
    public void shouldMultipleOneProduct() throws Exception {
        //TODO
    }

    @Test
    public void shouldDeleteProductById() throws Exception {
        //TODO

        final ProductService productService = new ProductService();
        final List<Product> product = new ArrayList<>();
        product.remove(1);
        assertThat(product.get(0).getId());



    }

    @Test
    public void shouldUpdateProductName() throws Exception {

        final  ProductService productService = new ProductService();
            final List<Product> product = new ArrayList<>();

            assertThat(product.get(0).getName().equals("nikeair"));

    }

    @Test
    public void shouldUpdateProductPrice() throws Exception {
        //TODO
        final  ProductService productService = new ProductService();
        final List<Product> product = new ArrayList<>();

        assertThat(product.get(0).getPrice().equals(200));


    }

    @Test
    public void shouldUpdateProductNameAndPrice() throws Exception {
        //TODO
        final  ProductService productService = new ProductService();
        final List<Product> product = new ArrayList<>();

        assertThat(product.get(0).getPrice().equals(200));
        assertThat(product.get(0).getName().equals("nike"));




    }

}