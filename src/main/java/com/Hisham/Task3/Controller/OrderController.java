package com.Hisham.Task3.Controller;

import com.Hisham.Task3.Models.Order;
import com.Hisham.Task3.Models.Product;
import com.Hisham.Task3.RequestObject.GetOrderRequestObject;
import com.Hisham.Task3.RequestObject.GetProductRequestObject;
import com.Hisham.Task3.ResponseObject.GetOrderResponse;
import com.Hisham.Task3.ResponseObject.GetProductResponse;
import com.Hisham.Task3.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("api/orders")
    public void saveOrder (@RequestBody GetOrderRequestObject orderRequestObject) {
        createOrder(orderRequestObject);
    }

    @GetMapping("api/orders")
    public List<Order> getOrder () {
        return orderService.getOrder();
    }

    @GetMapping("api/orders/{orderId}")
    public GetOrderResponse createOrder (@PathVariable Long orderId) {
        return orderService.getOrderById(orderId);
    }

    public void createOrder(GetOrderRequestObject orderRequestObject) {

        Order order = new Order();
        order.setQuantity(orderRequestObject.getQuantity());
        order.setShipping_address("NOT IMPORTANT");
        order.setCreatedDate(new Date());
        order.setIsActive(true);
        orderService.saveOrder(order);
    }

}
