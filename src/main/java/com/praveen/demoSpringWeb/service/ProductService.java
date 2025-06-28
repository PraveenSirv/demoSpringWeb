package com.praveen.demoSpringWeb.service;

import com.praveen.demoSpringWeb.model.Product;
import com.praveen.demoSpringWeb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProduct(String pName) {
        return repo.findByPName(pName);
    }

    public void addProduct(Product p) {
        repo.save(p);
    }

    public void deleteProduct(int pId) {
        repo.deleteById(pId);
    }

    public void updateProduct(Product p) {
        repo.save(p);
    }
}
