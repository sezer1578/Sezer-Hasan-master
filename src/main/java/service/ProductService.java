package service;

/**
 * Created by SEZER on 3.06.2017.
 */

import model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Service
public class ProductService {

    private List<Product> products = new ArrayList<Product>();

    public ProductService() {

        products.add(new Product(1, "nike air", 200));
        products.add(new Product(2, "addidas", 300));
    }

    public List<Product> add(String name, Integer quantity){
        //TODO
        final Random random = new Random(10000l);
        final Product product = new Product(random.nextInt(), name, quantity);
        products.add(product);

        return null;
    }

    public List<Product> delete(Integer id) {
       //TODO
        for (Product product : products)
        {
            if(product.getId().equals(id)){
                List<Product> pro = new ArrayList<>();

                pro.remove(id);


            }
        }
        return new ArrayList<>();
    }

    public List<Product>  update(Integer id, String name, Integer price){
        //TODO
        for(Product product : products)
        {
            if(product.getId().equals(id))
            {
                if(product.getName().equals(name))
                {
                    if(product.getPrice().equals(price))
                    {

                    }
                }
                List<Product> pro = new ArrayList<>();
                update(1,"nike",150);
                pro.iterator();


            }
        }
        return new ArrayList<>();

    }

    public List<Product> list(){
        return products;
    }

    public List<Product> findBy(int productId) {
        //TODO
        for(Product product : products)
        {
            if(product.getId().equals(productId))
            {
                List<Product> pro = new ArrayList<>();
                pro.add(product);


            }
        }
        return new ArrayList<>();
    }

}
