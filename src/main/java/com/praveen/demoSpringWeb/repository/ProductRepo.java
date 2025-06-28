package com.praveen.demoSpringWeb.repository;

import com.praveen.demoSpringWeb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    Product findByPName(String pname);

}
