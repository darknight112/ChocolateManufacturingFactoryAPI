package com.Hisham.Task3.Service;

import com.Hisham.Task3.Models.Product;
import com.Hisham.Task3.Reposetory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

}
