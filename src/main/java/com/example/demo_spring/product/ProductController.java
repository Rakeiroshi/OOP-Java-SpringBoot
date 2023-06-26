package com.example.demo_spring.product;

import com.example.demo_spring.product.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProduct(){
        return List.of(
                new Product(1L,"Zotac","ZOTAC GAMING GeForce RTX 4060",500.0),
                new Product(2L,"Intel","Intel Core i9-13900KF",700.0),
                new Product(3L,"Asus","Maximus Z690 Extreme",1200.0)
        );


    }


}
