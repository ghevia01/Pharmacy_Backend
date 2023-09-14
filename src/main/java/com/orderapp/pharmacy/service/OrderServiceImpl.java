package com.orderapp.pharmacy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderapp.pharmacy.data.model.Order;
import com.orderapp.pharmacy.repository.OrderRepo;
import com.orderapp.pharmacy.repository.UserRepo;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo itemRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public Order createItem(Order item, String customer, String employee) {

        item.setCustomer(this.userRepo.findByUsername(customer).get());
        item.setCustomer(this.userRepo.findByUsername(employee).get());

        return this.itemRepo.save(item);
    }

    @Override
    public List<Order> getItems() {
        return this.itemRepo.findAll();
    }

}
