package com.praveen.demoSpringWeb.controller;


import com.praveen.demoSpringWeb.model.Product;
import com.praveen.demoSpringWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/")
    public String show(){
        return "Welcom to Our Web Project";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable("name") String pName){
        return service.getProduct(pName);
    }

    @PostMapping("/addproduct")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }

    @DeleteMapping("/deleteproduct/{id}")
    public void deleteProductById(@PathVariable("id") int pId){
        service.deleteProduct(pId);
    }

    @PutMapping("/updateprod")
    public void updateProduct(@RequestBody Product p ){
        service.updateProduct(p);
    }

}
