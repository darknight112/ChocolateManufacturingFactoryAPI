package com.Hisham.Task3.Service;

import com.Hisham.Task3.Models.Order;
import com.Hisham.Task3.Models.Product;
import com.Hisham.Task3.Reposetory.OrderRepository;
import com.Hisham.Task3.Reposetory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

}
