package com.Ecom.demoEcom.Service;

import com.Ecom.demoEcom.Model.Product;
import com.Ecom.demoEcom.Repositary.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProductService {
@Autowired
    private ProductRepo repo;
    public List<Product> getAllProducts() {

        return repo.findAll();
    }

    public Product getProduct(int id) {
        return repo.findById(id).get();
    }

    public Product addProduct(Product prod) {
        return repo.save(prod);
    }

    public Product UpdateProduct(@PathVariable int id, Product product) {
        return repo.save(product);

    }

    public void deleteProduct(@PathVariable int id) {
        repo.deleteById(id);
    }
}
