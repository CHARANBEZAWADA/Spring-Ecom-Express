package com.Ecom.demoEcom.Controller;


import com.Ecom.demoEcom.Model.Product;
import com.Ecom.demoEcom.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
@Autowired
    public ProductService service;
@GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();

    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        return new ResponseEntity<>(service.getProduct(id), HttpStatus.OK);
    }
    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        System.out.println(product+" ajfnanfmaofkolak");
        return service.addProduct(product);
    }

    @PutMapping("/product/{id}")
    public Product UpdateProduct(@PathVariable int id,@RequestBody Product product){
    return service.UpdateProduct(id,product);
    }

    @DeleteMapping("/product/{id}")
    public  void  deleteProduct(@PathVariable int id) {
          service.deleteProduct(id);
    }




}
