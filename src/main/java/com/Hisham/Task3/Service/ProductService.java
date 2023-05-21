package com.Hisham.Task3.Service;

import com.Hisham.Task3.Models.Product;
import com.Hisham.Task3.Reposetory.ProductRepository;
import com.Hisham.Task3.ResponseObject.GetProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    public GetProductResponse getProductById(Long productId) {
        Optional<Product> optionalProduct =  productRepository.findById(productId);
        if(!optionalProduct.isEmpty())
        {
            Product product =  optionalProduct.get();
            GetProductResponse productResponse = new GetProductResponse();
            productResponse.setName(product.getName());
            productResponse.setPrice(product.getPrice());
            productResponse.setIngredients(product.getIngredients());
            productResponse.setQuantity(product.getQuantity());
            return productResponse;
        }


        return null;

    }



}
