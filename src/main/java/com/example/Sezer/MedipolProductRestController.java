package com.example.Sezer;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

import java.util.List;

/**
 * Created by SEZER on 3.06.2017.
 */


@RestController
public class MedipolProductRestController {

   @Autowired
    private ProductService productService;

   @RequestMapping(path = "/add")
   public List<Product> add( @RequestParam String name, @RequestParam int price)
   {
       productService.add(name,price);

       return productService.list();
   }
   @RequestMapping(path = "/delete")
    public List<Product> delete(@RequestParam int id)
   {
       System.out.println("Silmek istediginiz id :" + id);

      return productService.delete(id);

   }
   @RequestMapping(path = "/update")
    public List<Product> update(@RequestParam int id,@RequestParam String name,@RequestParam int price)
   {
      System.out.println("Güncellemek istediğiniz id giriniz" + id);
       System.out.println("Güncellemek istediğiniz name giriniz" + name);
       System.out.println("Güncellemek istediğiniz price giriniz" + price);

       return productService.update(id,name,price);


   }
   @RequestMapping(path = "/list")
    public List<Product> list(@RequestParam int id)
   {
       System.out.println("Listelemek istediğiniz id giriniz" + id);
       return productService.list();
   }

   @RequestMapping(path = "/findById")
    public List<Product> findBy(@RequestParam int id)
   {
       System.out.println("İd giriniz" + id);

       return productService.findBy(id);
   }

    //add
    //delete
    //update
    //list
    //findById

}
