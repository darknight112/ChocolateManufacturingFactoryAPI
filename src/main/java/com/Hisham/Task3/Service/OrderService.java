package com.Hisham.Task3.Service;

import com.Hisham.Task3.Models.Order;
import com.Hisham.Task3.Models.Product;
import com.Hisham.Task3.Reposetory.OrderRepository;
import com.Hisham.Task3.Reposetory.ProductRepository;
import com.Hisham.Task3.ResponseObject.GetOrderResponse;
import com.Hisham.Task3.ResponseObject.GetProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }


    public List<Order> getOrder() {
        return orderRepository.findAll();
    }

    public GetOrderResponse getOrderById(Long orderId) {
        Optional<Order> optionalOrder =  orderRepository.findById(orderId);
        if(!optionalOrder.isEmpty())
        {
            Order order =  optionalOrder.get();
            GetOrderResponse orderResponse = new GetOrderResponse();
            orderResponse.setShipping_address(order.getShipping_address());
            orderResponse.setQuantity(order.getQuantity());

            return orderResponse;
        }


        return null;

    }


}
