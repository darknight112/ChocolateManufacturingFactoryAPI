package com.Hisham.Task3.Controller;

import com.Hisham.Task3.Models.Product;
import com.Hisham.Task3.RequestObject.GetProductRequestObject;
import com.Hisham.Task3.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("api/products")
    public void saveProduct (@RequestBody GetProductRequestObject productRequestObject) {
        createProduct(productRequestObject);
    }

//    @GetMapping("api/products")
//    public List<Product> getProduct () {
//        return productService.getProduct();
//    }

    public void createProduct(GetProductRequestObject productRequestObject) {

        Product product = new Product();
        product.setName(productRequestObject.getName());
        product.setIngredients("Not Important");
        product.setQuantity(productRequestObject.getQuantity());
        product.setPrice(productRequestObject.getPrice());
        product.setCreatedDate(new Date());
        product.setIsActive(true);
        productService.saveProduct(product);
    }
}
