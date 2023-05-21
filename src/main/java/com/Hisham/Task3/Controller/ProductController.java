package com.Hisham.Task3.Controller;

import com.Hisham.Task3.Models.Product;
import com.Hisham.Task3.RequestObject.GetProductRequestObject;
import com.Hisham.Task3.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

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
